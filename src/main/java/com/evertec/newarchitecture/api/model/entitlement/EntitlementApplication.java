package com.evertec.newarchitecture.api.model.entitlement;

import java.io.Serializable;

public enum EntitlementApplication implements Serializable {
	MONITOR, CSR;

	public static Object fromString(String string) {
		return EntitlementApplication.valueOf(string);
	}

	public String toString(Object o) {
		return o.toString();
	}
}
