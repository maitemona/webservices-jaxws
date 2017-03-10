package com.ipartek.formacion.ws.pelicula;

import java.io.Serializable;

import com.ipartek.formacion.pojo.Pelicula;

public class PeliculaMensaje implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Pelicula pelicula;
	String mensaje;

	public PeliculaMensaje() {
		super();
		this.pelicula = null;
		this.mensaje = "";
	}

	/**
	 * @return the pelicula
	 */
	public Pelicula getPelicula() {
		return pelicula;
	}

	/**
	 * @param pelicula
	 *            the pelicula to set
	 */
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensaje
	 *            the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
