package com.evertec.newarchitecture.api.model.customer;

import java.io.Serializable;

public class GlobalCustomerFlag implements Serializable{
	
	private static final long serialVersionUID = 3412925002634981776L;
	private String name;
	private String description;

	private CustomerFlagType type;

	public GlobalCustomerFlag() {

	}

	public GlobalCustomerFlag(CustomerFlagType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CustomerFlagType getType() {
		return type;
	}

	public void setType(CustomerFlagType type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final GlobalCustomerFlag other = (GlobalCustomerFlag) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	
}
