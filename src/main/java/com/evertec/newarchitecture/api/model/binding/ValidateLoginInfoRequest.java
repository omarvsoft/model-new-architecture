package com.evertec.newarchitecture.api.model.binding;

import java.io.Serializable;

import javax.persistence.Entity;

import com.evertec.newarchitecture.api.model.customer.CustomerInteractionEvent;
import com.evertec.newarchitecture.api.model.customer.CustomerSignonSource;

@Entity
public class ValidateLoginInfoRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String passwordHash;
	private DeviceRequest deviceRequest;
	private String rsaLang;
	private CustomerSignonSource signonSource;
	// FFEIC
	private String ip;
	private String device;

	// FIN FFEIC

	public String generateAuditReport() {
		return this.toString();
	}

	public String generateErrorReport() {
		return this.toString();
	}

	@Override
	public String toString() {
		String data = "Request Data Received:\n" + "\t Username: " + username + "\n" + "\t Password Hash: "
				+ passwordHash + "\n" + "\t Ip: " + ip + "\n" + "\t Device: " + device + "\n";
		;

		return data;

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public void setSignonSource(CustomerSignonSource signonSource) {
		this.signonSource = signonSource;
	}

	public CustomerSignonSource getSignonSource() {
		return signonSource;
	}

	public ValidateLoginInfoRequest(CustomerInteractionEvent interactionEvent, String username, String passwordHash,
			DeviceRequest deviceRequest) {
		//super(interactionEvent);
		this.username = username;
		this.passwordHash = passwordHash;
		this.deviceRequest = deviceRequest;

	}

	public ValidateLoginInfoRequest(CustomerInteractionEvent interactionEvent, String username, String passwordHash,
			DeviceRequest deviceRequest, CustomerSignonSource signonSource) {
		//super(interactionEvent);
		this.username = username;
		this.passwordHash = passwordHash;
		this.deviceRequest = deviceRequest;
		this.signonSource = signonSource;
	}

	public ValidateLoginInfoRequest(CustomerInteractionEvent interactionEvent, String username, String passwordHash,
			DeviceRequest deviceRequest, String ip, String device) {
		//super(interactionEvent);
		this.username = username;
		this.passwordHash = passwordHash;
		this.deviceRequest = deviceRequest;
		this.ip = ip;
		this.device = device;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public DeviceRequest getDeviceRequest() {
		return deviceRequest;
	}

	public void setDeviceRequest(DeviceRequest deviceRequest) {
		this.deviceRequest = deviceRequest;
	}

	public String getRsaLang() {
		return rsaLang;
	}

	public void setRsaLang(String rsaLang) {
		this.rsaLang = rsaLang;
	}

}
