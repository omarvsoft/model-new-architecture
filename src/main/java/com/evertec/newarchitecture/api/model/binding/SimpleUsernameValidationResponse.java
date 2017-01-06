package com.evertec.newarchitecture.api.model.binding;

public class SimpleUsernameValidationResponse {
	
	private ResultStatus resultStatus;
	private String token;
	
	public SimpleUsernameValidationResponse(ResultStatus resultStatus, String token) {
		this.resultStatus = resultStatus;
		this.token = token;
	}
	
	public ResultStatus getResultStatus() {
		return resultStatus;
	}
	public void setResultStatus(ResultStatus resultStatus) {
		this.resultStatus = resultStatus;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	

}
