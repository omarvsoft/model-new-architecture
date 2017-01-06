package com.evertec.newarchitecture.api.model.customer.flags;

import java.io.Serializable;

public enum UserInterface implements Serializable {
	COMMERCIAL("1"), RETAIL("0");

	private String flagNumber;

	UserInterface(String flagNumber) {
		this.flagNumber = flagNumber;
	}

	public String getFlagNumber() {
		return new String(flagNumber);
	}

	public static UserInterface getUserInterfaceType(String value) {
		if (value == null)
			return null;
		else if ("0".equals(value))
			return RETAIL;
		else if ("1".equals(value))
			return COMMERCIAL;
		else
			return null;
	}

}