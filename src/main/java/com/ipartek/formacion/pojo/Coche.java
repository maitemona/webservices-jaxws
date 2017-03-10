
package com.ipartek.formacion.pojo;

import java.io.Serializable;

public class Coche implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codigo;
	private String nombre;

	public Coche() {
		super();
		this.codigo = 00;
		this.nombre = "";
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
