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

import java.lang.reflect.Array;
import java.util.List;

import thewebsemantic.lazy.Lazy;

import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

public class ListSaver extends Saver {

	@Override
	public void save(Bean2RDF writer, Resource subject, Property property, Object o) {
		// we will not remove children unless we get a 0 length list
		if ( o==null)
			return;
		else if (o instanceof Lazy && ! ((Lazy)o).isConnected()) {
			return;
		} else if (o instanceof Lazy && ! ((Lazy)o).modified()) {
			return;
		}
		Saver.of(Array.class).save(writer, subject, property, ((List)o).toArray());

	}

}
