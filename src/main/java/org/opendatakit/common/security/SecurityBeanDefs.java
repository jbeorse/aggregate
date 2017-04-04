/*
 * Copyright (C) 2010 University of Washington
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.opendatakit.common.security;

/**
 * Static class defining bean names that must be in sync with the names in 
 * <pre>WEB-INF/applicationContext-security.xml</pre>.
 * 
 * @author mitchellsundt@gmail.com
 *
 */
public final class SecurityBeanDefs {
	public static final String ACTIVE_DIRECTORY_LDAP_AUTHENTICATION_PROVIDER = "activeDirectoryAuthenticationProvider";
	public static final String ANONYMOUS_AUTHENTICATION_FILTER = "anonymousFilter";
	
	private SecurityBeanDefs() {};
}
