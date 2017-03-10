package com.ipartek.formacion.ws.helloworld;

import javax.jws.WebService;

@WebService(endpointInterface = "com.ipartek.formacion.ws.helloworld.HelloWorldWS")
public class HelloWorldWSImp implements HelloWorldWS {

	public String obtenerHolaMundo() {
		return "hello world";
	}

}
