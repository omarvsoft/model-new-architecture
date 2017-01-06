package com.evertec.newarchitecture.api.model.customer;

import java.io.Serializable;

public enum CustomerFlagType implements Serializable {
	MUST_CHANGE_PASSWORD, MUST_CHANGE_USERNAME, MUST_VALIDATE_SSN, MUST_VALIDATE_ENROLLACCOUNT, VALIDATE_DOB, VALIDATE_PIN, ENROLL_EBILLS, ENROLL_TELEPAGO,

	PASSWORD_BLOCK, PASSWORD_RESET_BLOCK, NEED_RSA_QUESTIONS,

	PENDING_ACCOUNT_APPLICATION, PENDING_EXT_ACCT_VALIDATION, OVERRIDE_RSA_VALIDATION,

	OCC_PAYMENT_ADD, OCC_PAYEE_ADD, FRAUD_BLOCK, ATHM_BLOCK, DCI_QUESTIONS_REQUIRED,

	DOCUMENTS_AVAILABLE, ESIGN_ENFORCEMENT, PENDING_COMERCIAL_ACCEPTANCE,
	//MBSD-461 NON-TRANSACTIONAL
	PROFILE_NOT_VERIFIED;
	
	public static Object fromString(String string) {
		if (string == null)
			return null;
		return CustomerFlagType.valueOf(string);
	}

	public String toString(Object o) {
		if (o == null)
			return null;
		return o.toString();
	}

}
