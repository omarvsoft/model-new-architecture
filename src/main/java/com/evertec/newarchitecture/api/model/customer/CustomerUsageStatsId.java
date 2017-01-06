package com.evertec.newarchitecture.api.model.customer;

import java.io.Serializable;
import java.util.Date;

public class CustomerUsageStatsId implements Serializable{
	
	private static final long serialVersionUID = 1069855718545172314L;
	private String profileId;
	private Date actionDate;

	/**
	 * @return the profileId
	 */
	public String getProfileId() {
		return profileId;
	}

	/**
	 * @param profileId
	 *            the profileId to set
	 */
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	/**
	 * @return the actionDate
	 */
	public Date getActionDate() {
		return actionDate;
	}

	/**
	 * @param actionDate
	 *            the actionDate to set
	 */
	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}

}
