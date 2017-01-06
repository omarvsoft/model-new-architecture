package com.evertec.newarchitecture.api.model.customer;

import java.io.Serializable;
import java.util.Calendar;


public class CustomerInteractionEvent implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7937321641480900796L;
	private String id;
	private CustomerInteractionEventType interaction;
	private InteractionSeverity severity;
	private Calendar eventTime;
	private String ip;
	private String sessionId;
	private String username;
	private String profileId;
	private String server;

	public CustomerInteractionEventType getInteraction() {
		return interaction;
	}

	public void setInteraction(CustomerInteractionEventType interaction) {
		this.interaction = interaction;
	}

	public Calendar getEventTime() {
		return eventTime;
	}

	public void setEventTime(Calendar eventTime) {
		this.eventTime = eventTime;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public InteractionSeverity getSeverity() {
		return severity;
	}

	public void setSeverity(InteractionSeverity severity) {
		this.severity = severity;
	}

	public CustomerInteractionEvent(String ip, String sessionId, String username, String profileId, String server) {
		super();
		this.ip = ip;
		this.sessionId = sessionId;
		this.username = username;
		this.profileId = profileId;
		this.server = server;

	}

	public CustomerInteractionEvent() {
		super();
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

//	public void setCustomStringData(String key, String data) {
//		super.putString(key.toUpperCase(), data);
//	}
//
//	public String getCustomStringData(String key) {
//		if (super.isSet(key))
//			return super.getString(key);
//		else
//			return null;
//	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
//	public boolean equals(Object objeto) {
//		boolean resultado;
//
//		if (!(objeto instanceof CustomerInteractionEvent))
//			resultado = false;
//		else {
//			CustomerInteractionEvent vc = (CustomerInteractionEvent) objeto;
//			resultado = new EqualsBuilder().append(this.getId(), vc.getId()).isEquals();
//		}
//
//		return resultado;
//	}
//
//	/**
//	 * @see java.lang.Object#hashCode()
//	 */
//	public int hashCode() {
//		return new HashCodeBuilder().append(getId()).toHashCode();
//	}

}
