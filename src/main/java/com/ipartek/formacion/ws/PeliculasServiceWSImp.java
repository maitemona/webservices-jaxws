package com.ipartek.formacion.ws;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import com.ipartek.formacion.pojo.Pelicula;
import com.ipartek.formacion.service.PeliculaService;
import com.ipartek.formacion.service.PeliculaServiceImp;

@WebService(serviceName = "peliculasservice", portName = "", targetNamespace = "")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public class PeliculasServiceWSImp {

	@Resource
	WebServiceContext webServiceContext;

	@WebMethod(operationName = "obtenerporid")
	public PeliculaMensaje getById(int codigo) {
		PeliculaMensaje pm = new PeliculaMensaje();

		if (validarPeticion()) {

			PeliculaService pS = new PeliculaServiceImp();
			Pelicula pelicula = pS.getById(codigo);
			if (pelicula == null) {
				pm.setMensaje("El codigo enviado no corresponde a ninguna pelicula: " + codigo);
			} else {
				pm.setPelicula(pelicula);
			}
		} else {
			pm.setMensaje("La contraseña enviada no es correcta");
		}

		return pm;

	}

	private boolean validarPeticion() {
		boolean valida = false;
		// WS-Security
		MessageContext contextoMensajes = webServiceContext.getMessageContext();

		return valida;
	}
}
