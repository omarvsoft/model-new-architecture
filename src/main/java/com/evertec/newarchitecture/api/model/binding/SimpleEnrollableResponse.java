package com.evertec.newarchitecture.api.model.binding;

import java.util.ArrayList;
import java.util.List;

import com.evertec.newarchitecture.api.model.EnrollableAccount;

public class SimpleEnrollableResponse {
	
	private ResultStatus resultStatus;
	private List<EnrollableAccount> listEnrollable = 
			new ArrayList<EnrollableAccount>();
	
	
	public SimpleEnrollableResponse(ResultStatus resultStatus, 
			List<EnrollableAccount> listEnrollable) {
		this.resultStatus = resultStatus;
		this.listEnrollable = listEnrollable;
	}

	public ResultStatus getResultStatus() {
		return resultStatus;
	}

	public void setResultStatus(ResultStatus resultStatus) {
		this.resultStatus = resultStatus;
	}

	public List<EnrollableAccount> getListEnrollable() {
		return listEnrollable;
	}

	public void setListEnrollable(List<EnrollableAccount> listEnrollable) {
		this.listEnrollable = listEnrollable;
	} 
	
	

}
