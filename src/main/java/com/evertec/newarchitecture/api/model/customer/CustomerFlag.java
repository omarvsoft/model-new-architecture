package com.evertec.newarchitecture.api.model.customer;

import java.io.Serializable;


public class CustomerFlag implements Serializable {
	private static final long serialVersionUID = -136061526587672463L;
	private String id;
	private CustomerProfile customerProfile;

	private GlobalCustomerFlag type;

	public CustomerFlag(CustomerFlagType type) {

		this.type = new GlobalCustomerFlag(type);
	}

	public CustomerFlag() {

	}

	public GlobalCustomerFlag getType() {
		return type;
	}

	public void setType(GlobalCustomerFlag type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
		final CustomerFlag other = (CustomerFlag) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}


	public CustomerProfile getCustomerProfile() {
		return customerProfile;
	}

	public void setCustomerProfile(CustomerProfile customerProfile) {
		this.customerProfile = customerProfile;
	}
}
