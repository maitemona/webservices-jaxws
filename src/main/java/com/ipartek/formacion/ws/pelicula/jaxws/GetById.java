
package com.ipartek.formacion.ws.pelicula.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "obtenerporid", namespace = "http://com.ipartek.formacion/types")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerporid", namespace = "http://com.ipartek.formacion/types")
public class GetById {

    @XmlElement(name = "codigo", namespace = "")
    private int codigo;

    /**
     * 
     * @return
     *     returns int
     */
    public int getCodigo() {
        return this.codigo;
    }

    /**
     * 
     * @param codigo
     *     the value for the codigo property
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
