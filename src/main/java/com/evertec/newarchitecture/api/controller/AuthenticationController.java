package com.evertec.newarchitecture.api.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.evertec.newarchitecture.api.model.EnrollableAccount;
import com.evertec.newarchitecture.api.model.binding.DeviceRequest;
import com.evertec.newarchitecture.api.model.binding.ResultStatus;
import com.evertec.newarchitecture.api.model.binding.SimpleEnrollableResponse;
import com.evertec.newarchitecture.api.model.binding.SimpleUsernameValidationResponse;
import com.evertec.newarchitecture.api.model.binding.UsernameValidationResponse;
import com.evertec.newarchitecture.api.model.binding.ValidateLoginInfoRequest;
import com.evertec.newarchitecture.api.model.customer.CustomerEntitlement4Hibernate;
import com.evertec.newarchitecture.api.model.customer.CustomerProfile;
import com.evertec.newarchitecture.api.service.LoginService;

@RestController
public class AuthenticationController implements LoginService{
	
	private UsernameValidationResponse user = new
			UsernameValidationResponse();
	
	private List<EnrollableAccount> listEnrollable = 
			new ArrayList<EnrollableAccount>(); 
	
	private List<CustomerEntitlement4Hibernate> listEntitlement = 
			new ArrayList<CustomerEntitlement4Hibernate>(); 
	
	
	private EnrollableAccount enrollableAccountA = new
			EnrollableAccount();
	
	private EnrollableAccount enrollableAccountB = new
			EnrollableAccount();
	
	private EnrollableAccount enrollableAccountC = new
			EnrollableAccount();
	
	private CustomerEntitlement4Hibernate entiA =
			new CustomerEntitlement4Hibernate();
	
	private CustomerEntitlement4Hibernate entiB =
			new CustomerEntitlement4Hibernate();
	
	private CustomerEntitlement4Hibernate entiC =
			new CustomerEntitlement4Hibernate();
	
	private DeviceRequest deviceRequest = new DeviceRequest();
	
	private CustomerProfile customerProfile = new CustomerProfile();
	
	@PostConstruct
	public void init() {
		
		enrollableAccountA.setAccountId("AAA");
		enrollableAccountA.setAccountType("AHORROS");
		enrollableAccountA.setProductId("01");
		
		enrollableAccountB.setAccountId("BBB");
		enrollableAccountB.setAccountType("AHORROS");
		enrollableAccountB.setProductId("01");
		
		enrollableAccountC.setAccountId("CCC");
		enrollableAccountC.setAccountType("CHEQUES");
		enrollableAccountC.setProductId("02");
		
		deviceRequest.setBeaconId("01");
		deviceRequest.setDevicePrint("a098437");
		deviceRequest.setHttpAcceptEncoding("UTF-8");
		deviceRequest.setUserAgent("Mozilla/5.0 (Windows; U; Windows NT 6.1; rv:2.2) Gecko/20110201");
		
		entiA.setAttributeData("a");
		entiA.setId("001");
		entiA.setProfileId("a1");
		
		entiB.setAttributeData("b");
		entiB.setId("002");
		entiB.setProfileId("a2");
		
		entiC.setAttributeData("c");
		entiC.setId("003");
		entiC.setProfileId("a3");
		
		listEnrollable.add(enrollableAccountA);
		listEnrollable.add(enrollableAccountB);
		listEnrollable.add(enrollableAccountC);
		
		listEntitlement.add(entiA);
		listEntitlement.add(entiB);
		listEntitlement.add(entiC);
		
		customerProfile.setEmail("omarvsoft@gmail.com");
		customerProfile.setEnrollmentAccountNumber("a");
		customerProfile.setFirstName("Erick Omar");
		customerProfile.setLastName("Vargas Alvarez");
		//customerProfile.setCustEntitlements(listEntitlement);
		
		user.setAccountsToValidate(listEnrollable);
		user.setDeviceRequest(deviceRequest);
		user.setCustomerProfile(customerProfile);
		
	}

	@Override
	@RequestMapping(
	                value = "api/b1/login/username", 
	                method = RequestMethod.GET)
	@ResponseBody
	public UsernameValidationResponse validateUserName() {		
		return user;
	}
	
	@RequestMapping(
            value = "api/b2/login/username", 
            method = RequestMethod.GET)
	@ResponseBody
	public SimpleUsernameValidationResponse byStepValidateUserName() {	

		SimpleUsernameValidationResponse simple =
				new SimpleUsernameValidationResponse(ResultStatus.SUCCESS,
						"asewrew21s12312ada2sw4q35");
		return simple;
	}
	
	@RequestMapping(
            value = "api/b2/login/enrollable/{id}", 
            method = RequestMethod.GET)
	@ResponseBody
	public SimpleEnrollableResponse byStepGetEnrollable(@PathVariable String id) {	
		
		List<EnrollableAccount> listEnrollableFinal = 
					new ArrayList<EnrollableAccount>();
		
		if ("01".compareTo(id) == 0) {
			listEnrollableFinal.add(enrollableAccountA);
			listEnrollableFinal.add(enrollableAccountB);
		} else if ("02".compareTo(id) == 0) {
			listEnrollableFinal.add(enrollableAccountC);
		} else {
			listEnrollableFinal.addAll(listEnrollable);
		}
		
		SimpleEnrollableResponse simple =
				new SimpleEnrollableResponse(ResultStatus.SUCCESS,
						listEnrollableFinal);
		return simple;
	}
	

}
