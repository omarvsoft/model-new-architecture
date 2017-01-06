package com.evertec.newarchitecture.api.model.customer;

import java.io.Serializable;

public enum CustomerSignonSource implements Serializable {
	MI_BANCO, MBOP;

	public static Object fromString(String string) {
		return CustomerSignonSource.valueOf(string);
	}

	public String toString(Object o) {
		return o.toString();
	}

}
