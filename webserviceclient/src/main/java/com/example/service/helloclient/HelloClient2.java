package com.example.service.helloclient;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;

import com.example.service.HelloWorldServiceImplService;
import com.example.service.IHelloWorld;


public class HelloClient2 {

//	@WebServiceRef(wsdlLocation="http://localhost:8080/ws/hello?wsdl")
//	static IHelloWorld service;
	private static String WEB_SERVICE_WSDL_URL = "http://localhost:8090/ws/hello?wsdl";
	
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL(WEB_SERVICE_WSDL_URL);
		QName qname = new QName("http://service.example.com/", "HelloWorldServiceImplService");
		Service service = Service.create(url, qname);
		
		IHelloWorld port = service.getPort(IHelloWorld.class);
		
//		HelloWorldServiceImplService serviceFirst = new HelloWorldServiceImplService();
//		IHelloWorld port = serviceFirst.getHelloWorldServiceImplPort();
		
		Map<String, Object> req_ctx = ((BindingProvider) port).getRequestContext();

		Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put("Username", Collections.singletonList("ramazan"));
        headers.put("Password", Collections.singletonList("1234"));
        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		
		String serviceResponse = port.getHelloWorld("ramazan");
		
		System.out.println(serviceResponse);
	}
	
}
