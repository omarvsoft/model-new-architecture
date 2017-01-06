package com.evertec.newarchitecture.api.model.customer;

import java.io.Serializable;

public enum CustomerAuthMethod implements Serializable {
	PASSWD_PIN, PASSWD_RSA;

	public static Object fromString(String string) {
		return CustomerAuthMethod.valueOf(string);
	}

	public String toString(Object o) {
		return o.toString();
	}
}

