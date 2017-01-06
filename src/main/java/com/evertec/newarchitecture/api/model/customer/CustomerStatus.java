package com.evertec.newarchitecture.api.model.customer;

import java.io.Serializable;

public enum CustomerStatus implements Serializable {
	ACTIVE, ENROLLED, PENDING_CSR_ACTIVATION, DELETED, DISABLED, SSDS_FORCED;

	public static Object fromString(String string) {
		return CustomerStatus.valueOf(string);
	}

	public String toString(Object o) {
		return o.toString();
	}
}
