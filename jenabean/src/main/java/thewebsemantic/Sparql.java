package thewebsemantic;

/*-
 * #%L
 * Jenabean binding library for RDF
 * %%
 * Copyright (C) 2015 thewebsemantic
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.LinkedList;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.shared.Lock;
import org.apache.jena.update.UpdateAction;

public class Sparql {
	
	/**
	 * Helpful for binding a query result set with a single solution
	 * subject to a particular java bean.  This returns a collection of beans.
	 * Queries are required to follow this pattern in the select clause:
	 * 
	 * <code>SELECT ?s WHERE ...</code>
	 * 
	 * Jenabean will attempt to create an instance of type <code>c</code> bound to 
	 * the RDF resources returned in your query.  It's important to use 
	 * name variable ?s.  This is the named variable Jenabean will expect.
	 * You should make sure that your query
	 * only returns one type or base type, for example, this snippet ensures that
	 * only resources of OWL type Bird are selected...
	 * 
	 * <code>SELECT ?s WHERE { ?s a :Bird ...</code>
	 * 
	 * If you SPARQL query returns heterogenous types, classcast exceptions
	 * will be thrown.
	 * 
	 * @param <T>
	 * @param m jena model
	 * @param c Java Class to which the OWL type is bound to
	 * @param query a full SPARQL query
	 * @return
	 */
	public static <T> LinkedList<T> exec(Model m, Class<T> c, String query) {
		RDF2Bean reader = new RDF2Bean(m);
		QueryExecution qexec = getQueryExec(m, query);
		LinkedList<T> beans = new LinkedList<T>();
		try {
			m.enterCriticalSection(Lock.READ);
			ResultSet results = qexec.execSelect();
			for (;results.hasNext();) beans.add(reader.load(c, resource(results)));
			return beans;
		} finally {
			m.leaveCriticalSection();
			qexec.close();
		}
	}

	public static <T> LinkedList<T> exec(Model m, Class<T> c, String query, QuerySolution initialBindings) {
		RDF2Bean reader = new RDF2Bean(m);
		QueryExecution qexec = getQueryExec(m, query, initialBindings);
		LinkedList<T> beans = new LinkedList<T>();
		try {
			m.enterCriticalSection(Lock.READ);
			ResultSet results = qexec.execSelect();
			for (;results.hasNext();) beans.add(reader.load(c, resource(results)));
			return beans;
		} finally {
			m.leaveCriticalSection();
			qexec.close();
		}
	}
	
	public static <T> LinkedList<T> exec(RDF2Bean reader, Class<T> c, String query, QuerySolution initialBindings, int start, int max) {
		Model m = reader.getModel();
		QueryExecution qexec = getQueryExec(m, query, initialBindings);
		LinkedList<T> beans = new LinkedList<T>();
		try {
			m.enterCriticalSection(Lock.READ);
			ResultSet results = qexec.execSelect();
			
			for(int pos = 0; pos < start && results.hasNext(); pos++)
				results.next();
			for (;results.hasNext() && max!=0; max--) beans.add(reader.load(c, resource(results)));
			return beans;
		} finally {
			m.leaveCriticalSection();
			qexec.close();
		}
	}
	
	public static <T> LinkedList<Resource> exec2(Model m, String query, QuerySolution initialBindings) {
		QueryExecution qexec = getQueryExec(m, query, initialBindings);
		LinkedList<Resource> beans = new LinkedList<Resource>();
		try {
			m.enterCriticalSection(Lock.READ);
			ResultSet results = qexec.execSelect();
			for (;results.hasNext();) beans.add(resource(results));
			return beans;
		} finally {
			m.leaveCriticalSection();
			qexec.close();
		}
	}

	public static void update(Model m, String query, QuerySolution i) {
		UpdateAction.parseExecute(query, m /* check if needed, i*/);
	}
	
	private static QueryExecution getQueryExec(Model m, String query) {
		Query q = QueryFactory.create(query);
		return QueryExecutionFactory.create(q, m);
	}

	private static QueryExecution getQueryExec(Model m, String query, QuerySolution i) {
		Query q = QueryFactory.create(query);
		return QueryExecutionFactory.create(q, m, i);
	}
	
	private static Resource resource(ResultSet results) {
		return results.nextSolution().getResource("s");
	}
}
