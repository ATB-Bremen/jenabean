package thewebsemantic.vocabulary;

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

import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntProperty;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.iterator.ExtendedIterator;

public class Generate {
	public static void main(String[] args) {
		String url = args[0];
		OntModel m = ModelFactory.createOntologyModel();
		m.read(url);
		ExtendedIterator it = m.listOntProperties();
		while(it.hasNext()) {
			OntProperty op = (OntProperty)it.next();
			if (op.getNameSpace().equals(url + "#") && op.isObjectProperty()) {
				//System.out.println(op);
				System.out.println("Collection<Thing> " + op.getLocalName() + "();");
				System.out.println("Sioc " + op.getLocalName() + "(Thing t);");
			}
		}
	}

}
