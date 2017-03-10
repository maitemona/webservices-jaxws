
package com.ipartek.formacion.ws.coche;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.pojo.Coche;

public class CocheColeccion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Coche> coche;

	public CocheColeccion() {
		super();
		this.coche = new ArrayList<Coche>();
	}

	/**
	 * @return the coche
	 */
	public List<Coche> getCoche() {
		return coche;
	}

	/**
	 * @param coche
	 *            the coche to set
	 */
	public void setCoche(List<Coche> coche) {
		this.coche = coche;
	}

}
