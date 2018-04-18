package com.example.service.helloclient;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import com.example.service.HelloWorldServiceImplService;
import com.example.service.IHelloWorld;


public class HelloClient {

	public static void main(String[] args) {
		HelloWorldServiceImplService serviceFirst = new HelloWorldServiceImplService();
		IHelloWorld port = serviceFirst.getHelloWorldServiceImplPort();
		
		Map<String, Object> req_ctx = ((BindingProvider) port).getRequestContext();

		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		//If you write different username or password, it throw invalid user exception.
        headers.put("Username", Collections.singletonList("Jack"));
        headers.put("Password", Collections.singletonList("1234"));
        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		
		String serviceResponse = port.getHelloWorld("Jack");
		
		System.out.println(serviceResponse);
	}
	
}
