package com.ipartek.formacion.pojo;

import java.io.Serializable;
import java.util.Date;

public class Pelicula implements Serializable, Comparable<Pelicula> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int codigo;
	private String titulo;
	private Date festreno;
	private Genero genero;

	public Pelicula() {
		super();
		this.codigo = 00;
		this.titulo = "";
		this.festreno = null;
		this.genero = null;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo
	 *            the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the festreno
	 */
	public Date getFestreno() {
		return festreno;
	}

	/**
	 * @param festreno
	 *            the festreno to set
	 */
	public void setFestreno(Date festreno) {
		this.festreno = festreno;
	}

	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * @param genero
	 *            the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Pelicula)) {
			return false;
		}
		Pelicula other = (Pelicula) obj;
		if (codigo != other.codigo) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Pelicula o) {
		// Comparable --> Sort > 0; = 0; < 0
		//
		// Comparamos por titulo de pelicula para que lo ordene
		return this.titulo.compareToIgnoreCase(o.titulo);
	}

}
