package com.example.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IHelloWorld {

	@WebMethod
	String getHelloWorld(String param);
}
