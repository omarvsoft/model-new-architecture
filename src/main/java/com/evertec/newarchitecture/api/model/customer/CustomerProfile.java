package com.evertec.newarchitecture.api.model.customer;

import java.math.BigInteger;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.evertec.newarchitecture.api.model.customer.flags.UserInterface;
import com.evertec.newarchitecture.api.model.entitlement.EntitlementType;
import com.evertec.newarchitecture.api.model.signup.SignupCampaign;




public class CustomerProfile {
	
	private static final long serialVersionUID = -7651623710466512006L;
	private String profileId;
	private BigInteger permId;
	private String username;
	private CustomerStatus status;
	private CustomerEnrollmentSource enrollmentSource;
	private CustomerAuthMethod authenticationMethod;
	private Set<CustomerFlag> customerFlags;

	private long creationDate;
	private long activationDate;
	private Date birthDate;
	private String taxId;
	private String email;
	private String passwordHash;
	private int passwordSalt;
	private String enrollmentAccountNumber;
	private String enrollmentAccountSubtype;
	private String enrollmentAccountProductId;
	private String firstName;
	private String lastName;
	private String maidenName;
	private String enrollmentApplicationId;
	private CustomerSignonStats signonStats;
	private List<SignupCampaign> signupCampaign;
	private UserInterface userInterface;
	private CustomerUsageStats customerUsageStats;
	
	//keep the mbop id in the session object, not saved in DB for google analytics
	private String mbopId = "";
	//From CIS, new table column
	private String gender;

	public boolean useCommercialInterface() {
		return userInterface == UserInterface.COMMERCIAL ? true : false;

	}

	public UserInterface getUserInterface() {
		return userInterface;
	}

	public void setUserInterface(UserInterface userInterface) {
		this.userInterface = userInterface;
	}

	private Set<CustomerEntitlement> entitlements = null;

	private List<CustomerEntitlement4Hibernate> custEntitlements;

	public CustomerProfile() {
		super();
	}

	public CustomerProfile(CustomerStatus status) {
		super();
		this.status = status;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return this.username;
	}

	public void setStatus(CustomerStatus status) {
		this.status = status;
	}

	public CustomerStatus getStatus() {
		return this.status;
	}

	public void setCreationDate(Date creationDate) {
		if (creationDate == null)
			this.creationDate = 0;
		else
			this.creationDate = creationDate.getTime();
	}

	public Date getCreationDate() {
		if (creationDate == 0)
			return null;
		return new Date(this.creationDate);
	}

	public void setActivationDate(Date activationDate) {
		if (activationDate == null)
			this.activationDate = 0;
		else
			this.activationDate = activationDate.getTime();
	}

	public Date getActivationDate() {
		if (activationDate == 0)
			return null;
		return new Date(this.activationDate);
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getPasswordHash() {
		return this.passwordHash;
	}

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String ssn) {
		this.taxId = ssn;
	}

	public BigInteger getPermId() {
		return permId;
	}

	public void setPermId(BigInteger permId) {
		this.permId = permId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCreationDate(long creationDate) {
		this.creationDate = creationDate;
	}

	public void setPasswordSalt(int passwordSalt) {
		this.passwordSalt = passwordSalt;
	}

	public int getPasswordSalt() {
		return passwordSalt;
	}

	public String getEnrollmentAccountNumber() {
		return enrollmentAccountNumber;
	}

	public void setEnrollmentAccountNumber(String enrollmentAccountNumber) {
		this.enrollmentAccountNumber = enrollmentAccountNumber;
	}

	public String getEnrollmentAccountSubtype() {
		return enrollmentAccountSubtype;
	}

	public void setEnrollmentAccountSubtype(String enrollmentAccountSubtype) {
		this.enrollmentAccountSubtype = enrollmentAccountSubtype;
	}

	public String getEnrollmentAccountProductId() {
		return enrollmentAccountProductId;
	}

	public void setEnrollmentAccountProductId(String enrollmentAccountProductId) {
		this.enrollmentAccountProductId = enrollmentAccountProductId;
	}

	public void setActivationDate(long activationDate) {
		this.activationDate = activationDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMaidenName() {
		return maidenName;
	}

	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public Set<CustomerFlag> getCustomerFlags() {
		return customerFlags;
	}

	public void setCustomerFlags(Set<CustomerFlag> customerFlags) {
		this.customerFlags = customerFlags;
	}

	public boolean isCustomerFlagged() {
		return customerFlags != null && customerFlags.size() > 0;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((profileId == null) ? 0 : profileId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final CustomerProfile other = (CustomerProfile) obj;
		if (profileId == null) {
			if (other.profileId != null)
				return false;
		} else if (!profileId.equals(other.profileId))
			return false;
		return true;
	}

	public boolean hasFlag(CustomerFlagType type) {
		if (isCustomerFlagged()) {
			for (Iterator<CustomerFlag> iterator = customerFlags.iterator(); iterator.hasNext();) {
				CustomerFlag name = (CustomerFlag) iterator.next();
				if (name.getType().getType().equals(type))
					return true;
			}
		}
		return false;
	}

	public CustomerFlag getCustomerFlagbyType(CustomerFlagType type) {
		if (isCustomerFlagged()) {
			for (Iterator<CustomerFlag> iterator = customerFlags.iterator(); iterator.hasNext();) {
				CustomerFlag name = (CustomerFlag) iterator.next();
				if (name.getType().getType().equals(type))
					return name;
			}
		}
		return null;
	}

	public Set<CustomerEntitlement> getEntitlements() {
		List<CustomerEntitlement> newEntitlementList = new LinkedList<CustomerEntitlement>();
		if (this.custEntitlements != null && this.custEntitlements.size() > 0) {

			for (Iterator<CustomerEntitlement4Hibernate> iterator = this.custEntitlements.iterator(); iterator
					.hasNext();) {
				CustomerEntitlement4Hibernate entitlement = (CustomerEntitlement4Hibernate) iterator.next();
				if (entitlement != null) {
					CustomerEntitlement newEntitlement = new CustomerEntitlement();
					newEntitlement.setProfileId(entitlement.getProfileId());
					//newEntitlement.setId(entitlement.getId());
					newEntitlement.setGlobalEntitlement(entitlement.getGlobalEntitlement());
					newEntitlement.setCustomerEntitlementStatus(entitlement.getCustomerEntitlementStatus());
					//newEntitlement.setAttributeData(entitlement.getAttributeData());
					//newEntitlement.setCustomerProfile(this);
					newEntitlementList.add(newEntitlement);
				}
			}
		}
		return new HashSet<CustomerEntitlement>(newEntitlementList);
	}

	/*
	 * public void setEntitlements(Set<CustomerEntitlement> entitlements) {
	 * this.entitlements = entitlements; }
	 */

	public CustomerEntitlement getEntitlementByType(EntitlementType type) {
		entitlements = this.getEntitlements();
		if (entitlements != null) {
			for (Iterator<CustomerEntitlement> iterator = entitlements.iterator(); iterator.hasNext();) {
				CustomerEntitlement ent = (CustomerEntitlement) iterator.next();
				if (ent.getGlobalEntitlement().getType().equals(type)) {
					return ent;
				}
			}
		}
		return null;

	}

	public boolean hasEntitlement(EntitlementType type) {
		return getEntitlementByType(type) != null;

	}

	public String getFullName() {

//		StringBuffer sb = new StringBuffer();
//		//sb.append(StringUtils.trimToEmpty(firstName));
//		sb.append(" ");
//		//sb.append(StringUtils.trimToEmpty(lastName));
//		//if (StringUtils.isNotEmpty(maidenName)) {
//			sb.append(" ");
//			sb.append(maidenName);
//		}
		return null;

	}

	public boolean isPendingAccountApplication() {
		return hasFlag(CustomerFlagType.PENDING_ACCOUNT_APPLICATION);
	}

	public boolean isPendingExternalAccountValidation() {
		return hasFlag(CustomerFlagType.PENDING_EXT_ACCT_VALIDATION);

	}

	public CustomerEnrollmentSource getEnrollmentSource() {
		return enrollmentSource;
	}

	public void setEnrollmentSource(CustomerEnrollmentSource enrollmentSource) {
		this.enrollmentSource = enrollmentSource;
	}

	public String getEnrollmentApplicationId() {
		return enrollmentApplicationId;
	}

	public void setEnrollmentApplicationId(String enrollmentApplicationId) {
		this.enrollmentApplicationId = enrollmentApplicationId;
	}

	public CustomerAuthMethod getAuthenticationMethod() {
		return authenticationMethod;
	}

	public void setAuthenticationMethod(CustomerAuthMethod customerAuthMethod) {
		this.authenticationMethod = customerAuthMethod;
	}

	public CustomerSignonStats getSignonStats() {
		return signonStats;
	}

	public void setSignonStats(CustomerSignonStats signonStats) {
		this.signonStats = signonStats;
	}

	/*
	 * public void removeCustomerFlag(CustomerFlagType flagType) {
	 * 
	 * if(customerFlags== null) return;
	 * 
	 * CustomerFlag customerFlagbyType = getCustomerFlagbyType(flagType);
	 * 
	 * if(customerFlagbyType!=null) customerFlags.remove(customerFlagbyType);
	 * 
	 * }
	 * 
	 * 
	 * public void addCustomerFlag(CustomerFlagType flagType) { if(customerFlags
	 * == null) customerFlags = new HashSet<CustomerFlag>();
	 * 
	 * if(getCustomerFlagbyType(flagType)!=null) return;
	 * 
	 * customerFlags.add(new CustomerFlag(flagType)); }
	 */

	public void setSignupCampaign(List<SignupCampaign> signupCampaign) {
		this.signupCampaign = signupCampaign;
	}

	public List<SignupCampaign> getSignupCampaign() {
		return signupCampaign;
	}

	public void setCustEntitlements(List<CustomerEntitlement4Hibernate> custEntitlements) {
		this.custEntitlements = custEntitlements;
	}

	public List<CustomerEntitlement4Hibernate> getCustEntitlements() {
		return custEntitlements;
	}

	/**
	 * @return the customerUsageStats
	 */
	public CustomerUsageStats getCustomerUsageStats() {
		return customerUsageStats;
	}

	/**
	 * @param customerUsageStats
	 *            the customerUsageStats to set
	 */
	public void setCustomerUsageStats(CustomerUsageStats customerUsageStats) {
		this.customerUsageStats = customerUsageStats;
	}
	
	public String getMbopId() {
		return mbopId;
	}

	public void setMbopId(String mbopId) {
		this.mbopId = mbopId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
