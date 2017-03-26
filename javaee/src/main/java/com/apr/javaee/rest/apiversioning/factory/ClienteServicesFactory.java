package com.apr.javaee.rest.apiversioning.factory;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import com.apr.javaee.rest.apiversioning.services.ClienteServices;

public class ClienteServicesFactory {

	@Inject
	Instance<ClienteServices> availableReports;

	public ClienteServices createService(String ver) {

		for (ClienteServices cs : availableReports) {
			if (cs.getVersion().equals(ver)) { // or whatever test you need
				return cs;
			}
		}
		return null;
	}

}
