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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class PrimitiveWrapper {
	private static final Set<Class<?>> WRAPPERS = new HashSet<Class<?>>();

	static {
		WRAPPERS.add(Byte.class);
		WRAPPERS.add(Short.class);
		WRAPPERS.add(Character.class);
		WRAPPERS.add(Integer.class);
		WRAPPERS.add(Long.class);
		WRAPPERS.add(Float.class);
		WRAPPERS.add(Double.class);
		WRAPPERS.add(Boolean.class);
		WRAPPERS.add(String.class);
		WRAPPERS.add(Date.class);
		WRAPPERS.add(Calendar.class);
		WRAPPERS.add(BigDecimal.class);
		WRAPPERS.add(BigInteger.class);
		WRAPPERS.add(LocalizedString.class);
	}

	public static boolean isPrimitive(Class<?> c) {
		return c.isPrimitive() || WRAPPERS.contains(c) || WRAPPERS.contains(c.getSuperclass());
	}

	public static boolean isPrimitive(Object o) {
		return isPrimitive(o.getClass());
	}
}
