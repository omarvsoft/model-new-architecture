package com.evertec.newarchitecture.api.model.entitlement;

import java.io.Serializable;

public enum EntitlementStatus implements Serializable {
	ENABLED, DISABLED, BLOCKED, OVERRIDE, PENDING_UPDATE, UPDATED;

	public static Object fromString(String string) {
		return EntitlementStatus.valueOf(string);
	}

	public String toString(Object o) {
		return o.toString();
	}
}