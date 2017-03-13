package com.ipartek.formacion.ws.pelicula;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import com.ipartek.formacion.pojo.Pelicula;
import com.ipartek.formacion.service.PeliculaService;
import com.ipartek.formacion.service.PeliculaServiceImp;

@WebService(serviceName = "peliculasservice", portName = "", targetNamespace = "http://com.ipartek.formacion/types")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public class PeliculasServiceWSImp {

	@Resource
	WebServiceContext webServiceContext;

	@WebMethod(operationName = "obtenerporid")
	public PeliculaMensaje getById(@WebParam(name = "codigo") int codigo) {
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
		Map<?, ?> encabezados = (Map<?, ?>) contextoMensajes.get(MessageContext.HTTP_REQUEST_HEADERS);
		// el nombre del atributo de "encabezados" se llama asi pq asi se decide
		// es una lista pq asi lo decidimos
		List<?> listaparamtros = (List<?>) encabezados.get("sessionId");
		// cogemos un identificador
		final String sessionId = "ipsession";

		if (listaparamtros != null) {
			// Aqui hariamos o produciriamos cualquier validacion compleja
			if (sessionId.equals(listaparamtros.get(0).toString())) {
				valida = true;
			}
		}

		return valida;
	}
	
	@Resource
	public Pelicula getAll(){
	
		return null;
	}
}
