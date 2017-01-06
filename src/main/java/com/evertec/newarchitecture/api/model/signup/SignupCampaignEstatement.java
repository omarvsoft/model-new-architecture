package com.evertec.newarchitecture.api.model.signup;

import java.io.Serializable;

public class SignupCampaignEstatement implements Serializable {
	
	private static final long serialVersionUID = -7651623710466512006L;
	private int activeEstatements;
	private int warming;
	private int forests;

	public void setActiveEstatements(int activeEstatements) {
		this.activeEstatements = activeEstatements;
	}

	public int getActiveEstatements() {
		return activeEstatements;
	}

	public void setWarming(int warming) {
		this.warming = warming;
	}

	public int getWarming() {
		return warming;
	}

	public void setForests(int forests) {
		this.forests = forests;
	}

	public int getForests() {
		return forests;
	}

}
