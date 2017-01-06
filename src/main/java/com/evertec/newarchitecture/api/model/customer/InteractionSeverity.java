package com.evertec.newarchitecture.api.model.customer;

import java.io.Serializable;

public enum InteractionSeverity implements Serializable {

	INFO, WARNING, ERROR, SYSTEM_ERROR;

	public static Object fromString(String string) {
		return InteractionSeverity.valueOf(string);
	}

	public String toString(Object o) {
		return o.toString();
	}
}
