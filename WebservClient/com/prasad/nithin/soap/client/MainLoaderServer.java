package com.prasad.nithin.soap.client;

import javax.xml.ws.Endpoint;

public class MainLoaderServer {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:7779/ws/hello", new UserOperations());  
	}

}
