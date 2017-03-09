package com.ipartek.formacion.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.ipartek.formacion.ws.HelloWorldWS")
public class HelloWorldWSImp implements HelloWorldWS {

	public String obtenerHolaMundo() {
		return "hello world";
	}

}
