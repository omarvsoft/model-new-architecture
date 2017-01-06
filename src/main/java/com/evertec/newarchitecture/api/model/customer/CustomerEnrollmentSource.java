package com.evertec.newarchitecture.api.model.customer;

import java.io.Serializable;

public enum CustomerEnrollmentSource implements Serializable {
	SSDS, ONLINE_AO, BATCH, WEB, MIGRATION_WEB, MIGRATION_BATCH, MIGRATION_SSDS, MBOP, PREMIA, ATHM, OFERTAS;

	public static Object fromString(String string) {
		return CustomerEnrollmentSource.valueOf(string);
	}

	public String toString(Object o) {
		return o.toString();
	}
}
