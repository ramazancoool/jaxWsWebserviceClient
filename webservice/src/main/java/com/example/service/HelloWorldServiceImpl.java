package com.example.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService(endpointInterface="com.example.service.IHelloWorld")
public class HelloWorldServiceImpl implements IHelloWorld {

	@Resource
	WebServiceContext webServiceContext;
	
	@Override
	public String getHelloWorld(String param) {
		
		return authenticateHeader(param);
	}
	
	private String authenticateHeader(String param){
		MessageContext messageContext = webServiceContext.getMessageContext();
		Map headers = (Map) messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
		List userNameList = (List) headers.get("username");
		List passwordList = (List) headers.get("password");
		
		if(userNameList != null && passwordList != null){
			boolean isValid = isExistingUser((String) userNameList.get(0), (String) passwordList.get(0));
			if(isValid){
				return "Welcome, " + param;
			}
		}
		
		throw new RuntimeException("Invalid User !!!!!!!!!!!");
	}

	private boolean isExistingUser(String userName, String password) {
		
		if(userName.equals("ramazan") && password.equals("1234")){
			return true;
		}
		
		return false;
	}

}
