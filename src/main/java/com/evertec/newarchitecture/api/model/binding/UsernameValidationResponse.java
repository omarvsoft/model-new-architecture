package com.evertec.newarchitecture.api.model.binding;

import java.io.Serializable;
import java.util.List;

import com.evertec.newarchitecture.api.model.EnrollableAccount;
import com.evertec.newarchitecture.api.model.customer.CustomerProfile;

public class UsernameValidationResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<EnrollableAccount> accountsToValidate;
	private List<ASK_FOR> tasksList;
	private ResultStatus statusResult;
	// private RsaIdentificationObj rsaIdentification;
	private DeviceRequest deviceRequest;
	private CustomerProfile customerProfile;
	private String returnURL;
	private int passwordSalt;

	private String rsaTransactionId;
	private String rsaSessionId;
	
	private Boolean mbopId = false;
	
	private List<ASK_FOR_OOB> tasksListOOB;
	
	public enum ASK_FOR {
		SSDS_FORCED_LOGIN, DUMMY_QUESTIONS, OOB_CHALLENGE, QUESTION_CHALLENGE, CSR_ACTION, VALIDATE_PASSWORD, RSA_ENROLL, RSA_ENROLL_USERNAME, RSA_ENROLL_FROM_OAO,

		RECOVERY_CODE, CHANGE_USERNAME, CHANGE_PASSWORD, VALIDATE_PASSWORD_PIN, VALIDATE_DOB, VALIDATE_ENROLLACCOUNT, VALIDATE_PIN, SESSION_INIT, EXTERNAL_URL
		
	}
	
	public enum ASK_FOR_OOB {

		CHANGE_OOB, EDIT_PRIMARY_PHONE, OOB_CHALLENGE, EDIT_BACKUP_PHONE, EDIT_CHALLENGE_TYPE, EDIT_CHALLENGE_FREQUENCY, GENERATE_RECOVERY_CODE, DEACTIVATE_2_STEP, 
		
		ALERT_TYPES, EDIT_SMS, ATH_MOVIL, MY_DOCUMENTS, BALANCE, ATH_ALERT_TYPES, CCA_ALERT_TYPES, PERSONAL_INFORMATION_CHANGES, PAYMENTS_TRANSFERS, EDIT_EMAIL  
		
		, PERSONAL_INFORMATION
	}
	
//	@Override
//	public String generateAuditReport() {
//		super.addAuditString("\n" + toString());
//		return super.getAuditString();
//	}
//
//	@Override
//	public String generateErrorReport() {
//		super.addErrorString("\n" + this.toString());
//		if (super.getException() != null)
//			super.addErrorString("\n\nException:" + super.getException().toString());
//
//		return null;
//	}

	@Override
	public String toString() {
		String data = "Response Data:\n";

		// if(rsaIdentification != null)
		// data = data + "\t RSA Identification: " +
		// rsaIdentification.toString() + "\n";
		// else
		// data = data + "\t RSA Identification Object is null.\n";

		if (deviceRequest != null)
			data = data + "\t Device Request: " + deviceRequest.toString() + "\n";
		else
			data = data + "\t Device Request Object is null.\n";

		if (customerProfile != null)
			data = data + "\t Customer Profile: " + customerProfile.toString() + "\n";
		else
			data = data + "\t Customer Profile Object is null.\n";

		data = data + "\t Status Result: " + statusResult.toString() + "\n" + "\t Status Result: "
				+ statusResult.toString() + "\n";

		return data;
	}

	public List<ASK_FOR> getTasksList() {
		return tasksList;
	}

	public void setTasksList(List<ASK_FOR> tasksList) {
		this.tasksList = tasksList;
	}

	public ResultStatus getStatusResult() {
		return statusResult;
	}

	public void setStatusResult(ResultStatus statusResult) {
		this.statusResult = statusResult;
	}

	public UsernameValidationResponse() {
		super();
	}

	/*
	 * public RsaIdentificationObj getRsaIdentification() { return
	 * rsaIdentification; }
	 * 
	 * public void setRsaIdentification(RsaIdentificationObj rsaIdentification)
	 * { this.rsaIdentification = rsaIdentification; }
	 */

	public List<EnrollableAccount> getAccountsToValidate() {
		return accountsToValidate;
	}

	public void setAccountsToValidate(List<EnrollableAccount> accountsToValidate) {
		this.accountsToValidate = accountsToValidate;
	}

	public CustomerProfile getCustomerProfile() {
		return customerProfile;
	}

	public void setCustomerProfile(CustomerProfile customerProfile) {
		this.customerProfile = customerProfile;
	}

	public String getReturnURL() {
		return returnURL;
	}

	public void setReturnURL(String returnURL) {
		this.returnURL = returnURL;
	}

	public int getPasswordSalt() {
		return passwordSalt;
	}

	public void setPasswordSalt(int passwordSalt) {
		this.passwordSalt = passwordSalt;
	}

	public DeviceRequest getDeviceRequest() {
		return deviceRequest;
	}

	public void setDeviceRequest(DeviceRequest deviceRequest) {
		this.deviceRequest = deviceRequest;
	}

	public String getRsaTransactionId() {
		return rsaTransactionId;
	}

	public void setRsaTransactionId(String rsaTransactionId) {
		this.rsaTransactionId = rsaTransactionId;
	}

	public String getRsaSessionId() {
		return rsaSessionId;
	}

	public void setRsaSessionId(String rsaSessionId) {
		this.rsaSessionId = rsaSessionId;
	}

	public Boolean getMbopId() {
		return mbopId;
	}

	public void setMbopId(Boolean mbopId) {
		this.mbopId = mbopId;
	}
	
	public List<ASK_FOR_OOB> getTasksListOOB() {
		return tasksListOOB;
	}

	public void setTasksListOOB(List<ASK_FOR_OOB> tasksListOOB) {
		this.tasksListOOB = tasksListOOB;
	}
	
	

}
