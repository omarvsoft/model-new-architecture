package com.evertec.newarchitecture.api.model.signup;

import java.io.Serializable;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import com.evertec.newarchitecture.api.model.account.TVFrontendAccount;

public class SignupCampaign implements Serializable {
	
	private static final long serialVersionUID = -7651623710466512006L;
	private String profileId;
	private String ssn;
	private String can;
	private String campaignType;
	private Date campaignDate;
	private char campaignResult;
	private SignupCampaignEstatement signupCampEstmt;
	private List<TVFrontendAccount> addedAccounts;
	private String agree;

	public final static char CAMPANNA_NO_VISTA = 'V';

	/**
	 * @return the cuenta
	 */
	/*
	 * cibp-2360 dsalas carga las cuentas que estan en xml en un campo de la
	 * tabla signup_camp_customer
	 */
	public Hashtable<String, String> getCuentas() {
//		XStream xstream = new XStream();
//
//		Properties secureAttributes = (Properties) xstream.fromXML(this.getAttributeData());
//		Hashtable<String, String> mapa = (Hashtable<String, String>) secureAttributes.clone();
//		mapa.remove("DDAONLY");
//		return mapa;
		return null;
	}

	/**
	 * @param cuenta
	 *            the cuenta to set
	 */
	public void setCuenta(String cuenta, String desc) {
		//this.putString(cuenta, desc);
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setCan(String can) {
		this.can = can;
	}

	public String getCan() {
		return can;
	}

	public void setCampaignType(String campaignType) {
		this.campaignType = campaignType;
	}

	public String getCampaignType() {
		return campaignType;
	}

	public void setCampaignDate(Date campaignDate) {
		this.campaignDate = campaignDate;
	}

	public Date getCampaignDate() {
		return campaignDate;
	}

	public void setCampaignResult(char campaignResult) {
		this.campaignResult = campaignResult;
	}

	public char getCampaignResult() {
		return campaignResult;
	}

	public String[] getActiveAccounts() {
//		String[] activeList = null;
//
//		if (super.isSet("ACTIVE_ACCOUNTS"))
//			activeList = super.getString("ACTIVE_ACCOUNTS").split(",");
//
//		return activeList;
		
		return null;
	}

	public void setActiveAccounts(String[] activeAccts) {
		String strActiveAccts = "";

		for (int i = 0; i < activeAccts.length; i++) {
			if (!activeAccts[i].equals("")) {
				if (strActiveAccts.equals(""))
					strActiveAccts = activeAccts[i];
				else
					strActiveAccts += "," + activeAccts[i];
			}
		}

		//super.putString("ACTIVE_ACCOUNTS", strActiveAccts);
	}

	public String[] getElegibleAccounts() {
//		String[] elegibleList = null;
//
//		if (super.isSet("ELEGIBLE_ACCOUNTS"))
//			elegibleList = super.getString("ELEGIBLE_ACCOUNTS").split(",");
//
//		return elegibleList;
		
		return null;
	}

	public void setElegibleAccounts(String[] elegibleAccts) {
//		String strElegibleAccts = "";
//
//		for (int i = 0; i < elegibleAccts.length; i++) {
//			if (!elegibleAccts[i].equals("")) {
//				if (strElegibleAccts.equals(""))
//					strElegibleAccts = elegibleAccts[i];
//				else
//					strElegibleAccts += "," + elegibleAccts[i];
//			}
//		}
//
//		super.putString("ELEGIBLE_ACCOUNTS", strElegibleAccts);
		
	}

	public String getPremia() {
//		String premia = null;
//
//		if (super.isSet("PREMIA"))
//			premia = super.getString("PREMIA");
//
//		return premia;
		
		return null;
	}

	public void setPremia(String premia) {
		//super.putString("PREMIA", premia);
	}

	public String getDdaOnly() {
//		String ddaonly = null;
//
//		if (super.isSet("DDAONLY"))
//			ddaonly = super.getString("DDAONLY");
//
//		return ddaonly;
		
		return null;
	}

	public void setDdaOnly(String ddaonly) {
		//super.putString("DDAONLY", ddaonly);
	}

	public int getActiveQty() {
//		String qty = null;
//
//		if (super.isSet("ACTIVE_QTY"))
//			qty = super.getString("ACTIVE_QTY");
//		else
//			qty = "0";
//
//		return Integer.parseInt(qty);
		
		return 0;
	}

	public void setActiveQty(int qty) {
		//super.putString("ACTIVE_QTY", String.valueOf(qty));
	}

	public void setSignupCampEstmt(SignupCampaignEstatement signupCampEstmt) {
		this.signupCampEstmt = signupCampEstmt;
	}

	public SignupCampaignEstatement getSignupCampEstmt() {
		return signupCampEstmt;
	}

	public List<TVFrontendAccount> getAddedAccounts() {
		return addedAccounts;
	}

	public void setAddedAccounts(List<TVFrontendAccount> addedAccounts) {
		this.addedAccounts = addedAccounts;
	}

	/**
	 * @return the agree
	 */
	public String getAgree() {
		return agree;
	}

	/**
	 * @param agree
	 *            the agree to set
	 */
	public void setAgree(String agree) {
		this.agree = agree;
	}

}
