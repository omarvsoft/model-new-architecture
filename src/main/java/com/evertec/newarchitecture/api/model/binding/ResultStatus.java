package com.evertec.newarchitecture.api.model.binding;

import java.io.Serializable;

public enum ResultStatus implements Serializable {
	DELETED, DISABLED, DENY, PENDING_CSR, SUCCESS, ERROR, BLOCKED, EXCEPTION,

	DUPLICATE,

	PASS_BLOCKED, PASS_RESET_BLOCKED, RSA_BLOCKED, FRAUD_BLOCKED, ATHM_BLOCKED,
	
	RSA_UNABLE, RSA_FAILED, RSA_ALLOW, RSA_EXPIRED

}
