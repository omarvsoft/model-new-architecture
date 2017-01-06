package com.evertec.newarchitecture.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;


public class SecurityConfiguration {
	
	@EnableAuthorizationServer
	protected static class OAuth2Config extends AuthorizationServerConfigurerAdapter {
		@Autowired
		private AuthenticationManager authenticationManager;

		@Override
		public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
			endpoints.authenticationManager(authenticationManager);
		}

		//Client's credentials
		@Override
		public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
			clients
				.inMemory()
				.withClient("MiBancoWebClient")
				.secret("MiBancoWebSecret")
				.authorizedGrantTypes("password","refresh_token")
				.scopes("MiBancoMicroServices")
				//.accessTokenValiditySeconds(3)
				//.refreshTokenValiditySeconds(1)
				;
		}
	}
	
	@Configuration
	@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
	protected static class SecurityConfiguration extends WebSecurityConfigurerAdapter {

		//Owners's credentials
	    @Autowired
	    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	            auth
	            	.inMemoryAuthentication()
	                .withUser("MiBancoMSUser")
	                .password("MiBancoMSPass")
	                .roles("USER_MIBANCO")
	                .and()
	                .withUser("IOSMiBancoUser")
	                .password("IOSMiBancoPass")
	                .roles("USER_IOSMIBANCO");
	    }
	}

}
