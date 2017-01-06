package com.evertec.newarchitecture.api.model.customer;

import java.io.Serializable;

import com.evertec.newarchitecture.api.model.customer.flags.UserInterface;

public class CustomerUsageStats implements Serializable {
	
	private static final long serialVersionUID = 6181695785298065079L;
	private CustomerUsageStatsId id = new CustomerUsageStatsId();
	private UserInterface userInterface;
	private int excelTransExportCount = 0;
	private int quickenTransExportCount = 0;
	private int quickbooksTransExportCount = 0;
	private int moneyTransExportCount = 0;
	
	/**
	 * @return the id
	 */
	public CustomerUsageStatsId getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(CustomerUsageStatsId id) {
		this.id = id;
	}

	/**
	 * @return the excelTransExportCount
	 */
	public int getExcelTransExportCount() {
		return excelTransExportCount;
	}

	/**
	 * @param excelTransExportCount
	 *            the excelTransExportCount to set
	 */
	public void setExcelTransExportCount(int excelTransExportCount) {
		this.excelTransExportCount = excelTransExportCount;
	}

	/**
	 * @return the quickenTransExportCount
	 */
	public int getQuickenTransExportCount() {
		return quickenTransExportCount;
	}

	/**
	 * @param quickenTransExportCount
	 *            the quickenTransExportCount to set
	 */
	public void setQuickenTransExportCount(int quickenTransExportCount) {
		this.quickenTransExportCount = quickenTransExportCount;
	}

	/**
	 * @return the quickbooksTransExportCount
	 */
	public int getQuickbooksTransExportCount() {
		return quickbooksTransExportCount;
	}

	/**
	 * @param quickbooksTransExportCount
	 *            the quickbooksTransExportCount to set
	 */
	public void setQuickbooksTransExportCount(int quickbooksTransExportCount) {
		this.quickbooksTransExportCount = quickbooksTransExportCount;
	}

	/**
	 * @return the moneyTransExportCount
	 */
	public int getMoneyTransExportCount() {
		return moneyTransExportCount;
	}

	/**
	 * @param moneyTransExportCount
	 *            the moneyTransExportCount to set
	 */
	public void setMoneyTransExportCount(int moneyTransExportCount) {
		this.moneyTransExportCount = moneyTransExportCount;
	}

	/**
	 * @return the userInterface
	 */
	public UserInterface getUserInterface() {
		return userInterface;
	}

	/**
	 * @param userInterface
	 *            the userInterface to set
	 */
	public void setUserInterface(UserInterface userInterface) {
		this.userInterface = userInterface;
	}

}
