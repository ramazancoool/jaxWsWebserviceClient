package com.example.service;

import javax.xml.ws.Endpoint;

public class HelloPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/ws/hello", new HelloWorldServiceImpl());
	}

}
