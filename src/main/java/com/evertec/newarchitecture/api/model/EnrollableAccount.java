package com.evertec.newarchitecture.api.model;

import java.io.Serializable;

public class EnrollableAccount implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String accountId;
	private String accountType;
	private String productId;

	public EnrollableAccount(String accountId, String accountType, String productId) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.productId = productId;
	}

	public EnrollableAccount(String accountId, String accountType) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
	}

	public EnrollableAccount() {
		super();
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

}
