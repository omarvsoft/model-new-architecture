package com.evertec.newarchitecture.api.model.customer;

import java.io.Serializable;
import java.util.Date;

public class CustomerSignonStats implements Serializable{
	
	private static final long serialVersionUID = -6711069698340212914L;

	private String profileId;

	private Date firstSignOnSuccess;
	private Date lastSignOnSuccess;
	private Date firstSignOnFail;
	private Date lastSignOnFail;
	private int signonSucessTotalCount = 0;

	// last Interaction
	private String lastInteraction;
	private Date lastInteractionDate;

	// Password Fail
	private int passwordFailCount = 0;
	private Date lastPasswordFail;
	private int passwordFailTotalCount = 0;

	// Password Block
	private int passwordBlockCount = 0;
	private int passwordBlockTotalCount = 0;
	private Date lastPasswordBlock;

	// Fraud Block (CIBP-2694)
	private int fraudBlockTotalCount = 0;
	private int fraudUnblockTotalCount = 0;
	private String fraudUpdatedBy;
	private Date lastFraudBlock;
	private Date lastFraudUnblock;

	// ATHM Block
	private int athmBlockTotalCount = 0;
	private int athmUnblockTotalCount = 0;
	private int athmFailTries = 0;
	private String athmUpdatedBy;
	private Date lastAthmBlock;
	private Date lastAthmUnblock;

	// Password Reset
	private int passwordResetCount = 0;
	private Date lastPasswordReset;
	private int passwordResetTotalCount = 0;

	// Password Reset Block
	private int passwordResetBlockCount = 0;
	private Date lastPasswordResetBlock;
	private int passwordResetBlockTotalCount = 0;

	// username block
	private Date firstUsernameBlock;
	private Date lastUsernameBlock;
	private int usernameBlockCount = 0;

	// RSA Question BLOCK
	private Date lastQuestionsUpdate;
	private Date lastQuestionsBlock;
	private int questionBlockCounter = 0;
	private int questionUpdateCounter = 0;

	// RSA enroll
	private Date lastRsaEnroll;
	private int rsaEnrollCount = 0;

	// jocampo FFEIC
	private String lastSignOnSuccessIp;
	private String lastSignOnSuccessDevice;

	private Integer balanceReqStat = 0;
	
	// OOB Recovery Code Block
	private Date firstOobRecCodeFail;
	private Date lastOobRecCodeBlock;
	private int oobRecCodeFailCount = 0;

	// FIN FFEIC

	public int getPasswordResetTotalCount() {
		return passwordResetTotalCount;
	}

	public void setPasswordResetTotalCount(int passwordResetTotalCount) {
		this.passwordResetTotalCount = passwordResetTotalCount;
	}

	public int getPasswordResetBlockTotalCount() {
		return passwordResetBlockTotalCount;
	}

	public void setPasswordResetBlockTotalCount(int passwordResetBlockTotalCount) {
		this.passwordResetBlockTotalCount = passwordResetBlockTotalCount;
	}

	public Date getLastRsaEnroll() {
		return lastRsaEnroll;
	}

	public void setLastRsaEnroll(Date lastRsaEnroll) {
		this.lastRsaEnroll = lastRsaEnroll;
	}

	public int getRsaEnrollCount() {
		return rsaEnrollCount;
	}

	public void setRsaEnrollCount(int rsaEnrollCount) {
		this.rsaEnrollCount = rsaEnrollCount;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public Date getFirstSignOnSuccess() {
		return firstSignOnSuccess;
	}

	public void setFirstSignOnSuccess(Date firstSignOnSuccess) {
		this.firstSignOnSuccess = firstSignOnSuccess;
	}

	public Date getLastSignOnSuccess() {
		return lastSignOnSuccess;
	}

	public void setLastSignOnSuccess(Date lastSignOnSuccess) {
		this.lastSignOnSuccess = lastSignOnSuccess;
	}

	public Date getFirstSignOnFail() {
		return firstSignOnFail;
	}

	public void setFirstSignOnFail(Date firstSignOnFail) {
		this.firstSignOnFail = firstSignOnFail;
	}

	public Date getLastSignOnFail() {
		return lastSignOnFail;
	}

	public void setLastSignOnFail(Date lastSignOnFail) {
		this.lastSignOnFail = lastSignOnFail;
	}

	public int getSignonSucessTotalCount() {
		return signonSucessTotalCount;
	}

	public void setSignonSucessTotalCount(int signonSucessTotalCount) {
		this.signonSucessTotalCount = signonSucessTotalCount;
	}

	public String getLastInteraction() {
		return lastInteraction;
	}

	public void setLastInteraction(String lastInteraction) {
		this.lastInteraction = lastInteraction;
	}

	public Date getLastInteractionDate() {
		return lastInteractionDate;
	}

	public int getPasswordFailCount() {
		return passwordFailCount;
	}

	public void setPasswordFailCount(int passwordFailCount) {
		this.passwordFailCount = passwordFailCount;
	}

	public Date getLastPasswordFail() {
		return lastPasswordFail;
	}

	public void setLastPasswordFail(Date lastPasswordFail) {
		this.lastPasswordFail = lastPasswordFail;
	}

	public int getPasswordFailTotalCount() {
		return passwordFailTotalCount;
	}

	public void setPasswordFailTotalCount(int passwordFailTotalCount) {
		this.passwordFailTotalCount = passwordFailTotalCount;
	}

	public int getPasswordBlockCount() {
		return passwordBlockCount;
	}

	public void setPasswordBlockCount(int passwordBlockCount) {
		this.passwordBlockCount = passwordBlockCount;
	}

	public int getPasswordBlockTotalCount() {
		return passwordBlockTotalCount;
	}

	public void setPasswordBlockTotalCount(int passwordBlockTotalCount) {
		this.passwordBlockTotalCount = passwordBlockTotalCount;
	}

	public Date getLastPasswordBlock() {
		return lastPasswordBlock;
	}

	public void setLastPasswordBlock(Date lastPasswordBlock) {
		this.lastPasswordBlock = lastPasswordBlock;
	}

	public int getFraudBlockTotalCount() {
		return fraudBlockTotalCount;
	}

	public void setFraudBlockTotalCount(int fraudBlockTotalCount) {
		this.fraudBlockTotalCount = fraudBlockTotalCount;
	}

	public String getFraudUpdatedBy() {
		return fraudUpdatedBy;
	}

	public void setFraudUpdatedBy(String fraudUpdatedBy) {
		this.fraudUpdatedBy = fraudUpdatedBy;
	}

	public int getFraudUnblockTotalCount() {
		return fraudUnblockTotalCount;
	}

	public void setFraudUnblockTotalCount(int fraudUnblockTotalCount) {
		this.fraudUnblockTotalCount = fraudUnblockTotalCount;
	}

	public Date getLastFraudBlock() {
		return lastFraudBlock;
	}

	public void setLastFraudBlock(Date lastFraudBlock) {
		this.lastFraudBlock = lastFraudBlock;
	}

	public Date getLastFraudUnblock() {
		return lastFraudUnblock;
	}

	public void setLastFraudUnblock(Date lastFraudUnblock) {
		this.lastFraudUnblock = lastFraudUnblock;
	}

	public int getAthmBlockTotalCount() {
		return athmBlockTotalCount;
	}

	public void setAthmBlockTotalCount(int athmBlockTotalCount) {
		this.athmBlockTotalCount = athmBlockTotalCount;
	}

	public int getAthmUnblockTotalCount() {
		return athmUnblockTotalCount;
	}

	public void setAthmUnblockTotalCount(int athmUnblockTotalCount) {
		this.athmUnblockTotalCount = athmUnblockTotalCount;
	}

	public String getAthmUpdatedBy() {
		return athmUpdatedBy;
	}

	public void setAthmUpdatedBy(String athmUpdatedBy) {
		this.athmUpdatedBy = athmUpdatedBy;
	}

	public Date getLastAthmBlock() {
		return lastAthmBlock;
	}

	public void setLastAthmBlock(Date lastAthmBlock) {
		this.lastAthmBlock = lastAthmBlock;
	}

	public Date getLastAthmUnblock() {
		return lastAthmUnblock;
	}

	public void setLastAthmUnblock(Date lastAthmUnblock) {
		this.lastAthmUnblock = lastAthmUnblock;
	}

	public int getPasswordResetCount() {
		return passwordResetCount;
	}

	public void setPasswordResetCount(int passwordResetCount) {
		this.passwordResetCount = passwordResetCount;
	}

	public Date getLastPasswordReset() {
		return lastPasswordReset;
	}

	public void setLastPasswordReset(Date lastPasswordReset) {
		this.lastPasswordReset = lastPasswordReset;
	}

	public int getPasswordResetBlockCount() {
		return passwordResetBlockCount;
	}

	public void setPasswordResetBlockCount(int passwordResetBlockCount) {
		this.passwordResetBlockCount = passwordResetBlockCount;
	}

	public Date getLastPasswordResetBlock() {
		return lastPasswordResetBlock;
	}

	public void setLastPasswordResetBlock(Date lastPasswordResetBlock) {
		this.lastPasswordResetBlock = lastPasswordResetBlock;
	}

	public Date getFirstUsernameBlock() {
		return firstUsernameBlock;
	}

	public void setFirstUsernameBlock(Date firstUsernameBlock) {
		this.firstUsernameBlock = firstUsernameBlock;
	}

	public Date getLastUsernameBlock() {
		return lastUsernameBlock;
	}

	public void setLastUsernameBlock(Date lastUsernameBlock) {
		this.lastUsernameBlock = lastUsernameBlock;
	}

	public int getUsernameBlockCount() {
		return usernameBlockCount;
	}

	public void setUsernameBlockCount(int usernameBlockCount) {
		this.usernameBlockCount = usernameBlockCount;
	}

	public Date getLastQuestionsUpdate() {
		return lastQuestionsUpdate;
	}

	public void setLastQuestionsUpdate(Date lastQuestionsUpdate) {
		this.lastQuestionsUpdate = lastQuestionsUpdate;
	}

	public Date getLastQuestionsBlock() {
		return lastQuestionsBlock;
	}

	public void setLastQuestionsBlock(Date lastQuestionsBlock) {
		this.lastQuestionsBlock = lastQuestionsBlock;
	}

	public int getQuestionBlockCounter() {
		return questionBlockCounter;
	}

	public void setQuestionBlockCounter(int questionBlockCounter) {
		this.questionBlockCounter = questionBlockCounter;
	}

	public int getQuestionUpdateCounter() {
		return questionUpdateCounter;
	}

	public void setQuestionUpdateCounter(int questionUpdateCounter) {
		this.questionUpdateCounter = questionUpdateCounter;
	}

	public void setLastInteractionDate(Date lastInteractionDate) {
		this.lastInteractionDate = lastInteractionDate;
	}

	public String getLastSignOnSuccessIp() {
		return lastSignOnSuccessIp;
	}

	public void setLastSignOnSuccessIp(String lastSignOnSuccessIp) {
		this.lastSignOnSuccessIp = lastSignOnSuccessIp;
	}

	public String getLastSignOnSuccessDevice() {
		return lastSignOnSuccessDevice;
	}

	public void setLastSignOnSuccessDevice(String lastSignOnSuccessDevice) {
		this.lastSignOnSuccessDevice = lastSignOnSuccessDevice;
	}

	/**
	 * @return the athmFailTries
	 */
	public int getAthmFailTries() {
		return athmFailTries;
	}

	/**
	 * @param athmFailTries
	 *            the athmFailTries to set
	 */
	public void setAthmFailTries(int athmFailTries) {
		this.athmFailTries = athmFailTries;
	}

	public Integer getBalanceReqStat() {
		return balanceReqStat;
	}

	public void setBalanceReqStat(Integer balanceReqStat) {
		this.balanceReqStat = balanceReqStat;
	}

	public Date getFirstOobRecCodeFail() {
		return firstOobRecCodeFail;
	}

	public void setFirstOobRecCodeFail(Date firstOobRecCodeFail) {
		this.firstOobRecCodeFail = firstOobRecCodeFail;
	}

	public Date getLastOobRecCodeBlock() {
		return lastOobRecCodeBlock;
	}

	public void setLastOobRecCodeBlock(Date lastOobRecCodeBlock) {
		this.lastOobRecCodeBlock = lastOobRecCodeBlock;
	}

	public int getOobRecCodeFailCount() {
		return oobRecCodeFailCount;
	}

	public void setOobRecCodeFailCount(int oobRecCodeFailCount) {
		this.oobRecCodeFailCount = oobRecCodeFailCount;
	}

}
