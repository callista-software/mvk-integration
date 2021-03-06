/**
 * Copyright (C) 2011,2012 Callista Enterprise AB <info@callistaenterprise.se>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.callistasoftware.netcare.mvk.authentication.service;

import org.callistasoftware.netcare.mvk.authentication.service.api.AuthenticationResult;
import org.callistasoftware.netcare.mvk.authentication.service.api.PreAuthenticationCallback;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MvkPreAuthenticationServiceTestCallback implements PreAuthenticationCallback {

	@Override
	public UserDetails createMissingUser(AuthenticationResult auth) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetails verifyPrincipal(Object principal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetails lookupPrincipal(AuthenticationResult auth)
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
