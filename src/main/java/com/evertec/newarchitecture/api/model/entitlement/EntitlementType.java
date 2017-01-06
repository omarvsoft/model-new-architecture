package com.evertec.newarchitecture.api.model.entitlement;

import java.io.Serializable;

public enum EntitlementType implements Serializable {
	BANKING, BILLPAY, TRANSFERS, EBILLS, AGGREGATION, MOBILE_BANKING, ALERTS, SIGNON, ENROLLMENT, ACCOUNT_OPENING, EZSTMT, OAO, IPHONE_API, TRANSACTIONS, GUIDED_SETUP, PFM, CAMPAIGNS, ATHMOVIL, RDC, SOS, RSA, MOBILE_CASH, DCI_QUESTIONS, PAYROLL;
	// mpicado, CHECKS, HARLAND;
	// hector, IPHONE_API
	// bagarcia cibp-2218 GUIDED_SETUP
	// jortiz, MOBILECASH
	// epibarra PAYROLL
	public static Object fromString(String string) {
		if (string == null)
			return null;
		return EntitlementType.valueOf(string);
	}

	public String toString(Object o) {
		if (o == null)
			return null;
		return o.toString();
	}

}