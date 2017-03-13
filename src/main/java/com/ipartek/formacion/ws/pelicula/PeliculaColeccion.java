package com.ipartek.formacion.ws.pelicula;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import com.ipartek.formacion.pojo.Pelicula;

public class PeliculaColeccion implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Pelicula> pelicula;
	
	public PeliculaColeccion() {
		super();
		this.pelicula = new ArrayList<Pelicula>();
		
	}

	public List<Pelicula> getPelicula() {
		return pelicula;
	}

	public void setPelicula(List<Pelicula> pelicula) {
		this.pelicula = pelicula;
	}

	
}
