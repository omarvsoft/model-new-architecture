package com.evertec.newarchitecture.api.service;

import com.evertec.newarchitecture.api.model.binding.UsernameValidationResponse;
import com.evertec.newarchitecture.api.model.binding.ValidateLoginInfoRequest;

public interface LoginService {
	UsernameValidationResponse validateUserName(/*ValidateLoginInfoRequest msg*/);
}
