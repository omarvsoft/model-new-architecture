package com.evertec.newarchitecture.api.model.customer;

import java.io.Serializable;

import javax.persistence.Entity;

import com.evertec.newarchitecture.api.model.GlobalEntitlement;
import com.evertec.newarchitecture.api.model.entitlement.EntitlementStatus;
import com.evertec.newarchitecture.api.model.entitlement.EntitlementType;

@Entity
public class CustomerEntitlement implements Serializable {
	
	private static final long serialVersionUID = 4977922093381457411L;
	private GlobalEntitlement globalEntitlement;
	private EntitlementStatus customerEntitlementStatus = EntitlementStatus.ENABLED;
	private String profileId;

	public CustomerEntitlement() {
		super();
	}

	public CustomerEntitlement(EntitlementType type, EntitlementStatus status) {

		this.globalEntitlement = new GlobalEntitlement(type);
		this.customerEntitlementStatus = status;

	}

	public String getUniqueId() {
		throw new UnsupportedOperationException();
	}

	public EntitlementStatus getCustomerEntitlementStatus() {
		return customerEntitlementStatus;
	}

	public void setCustomerEntitlementStatus(EntitlementStatus customerEntitlementStatus) {
		this.customerEntitlementStatus = customerEntitlementStatus;
	}

	public GlobalEntitlement getGlobalEntitlement() {
		return globalEntitlement;
	}

	public void setGlobalEntitlement(GlobalEntitlement entitlementType) {
		this.globalEntitlement = entitlementType;
	}

	public EntitlementType getType() {
		return globalEntitlement.getType();
	}

	public void setType(EntitlementType type) {
		globalEntitlement.setType(type);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((getGlobalEntitlement() == null) ? 0 : getGlobalEntitlement().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		final CustomerEntitlement other = (CustomerEntitlement) obj;
		if (getGlobalEntitlement() == null) {
			if (other.getGlobalEntitlement() != null)
				return false;
		} else if (!getGlobalEntitlement().equals(other.getGlobalEntitlement()))
			return false;
		return true;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getProfileId() {
		return profileId;
	}

}
