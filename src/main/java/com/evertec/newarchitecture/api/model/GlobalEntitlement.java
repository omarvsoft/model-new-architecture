package com.evertec.newarchitecture.api.model;

import java.util.Date;

import com.evertec.newarchitecture.api.model.entitlement.EntitlementApplication;
import com.evertec.newarchitecture.api.model.entitlement.EntitlementStatus;
import com.evertec.newarchitecture.api.model.entitlement.EntitlementType;


public class GlobalEntitlement {
	private String name;
	private String description;
	private EntitlementStatus status;
	private EntitlementType type;
	private EntitlementApplication application;
	private Date eventDate;

	public GlobalEntitlement(EntitlementType type) {
		this.type = type;
	}

	public GlobalEntitlement() {

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

	public EntitlementStatus getStatus() {
		return status;
	}

	public void setStatus(EntitlementStatus status) {
		this.status = status;
	}

	public EntitlementType getType() {
		return type;
	}

	public void setType(EntitlementType type) {
		this.type = type;
	}
	
	public EntitlementApplication getApplication() {
		return application;
	}

	public void setApplication(EntitlementApplication application) {
		this.application = application;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
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
		final GlobalEntitlement other = (GlobalEntitlement) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}




}
