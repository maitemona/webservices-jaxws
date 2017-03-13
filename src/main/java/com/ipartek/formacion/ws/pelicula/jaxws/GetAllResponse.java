
package com.ipartek.formacion.ws.pelicula.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ipartek.formacion.ws.pelicula.PeliculaColeccion;

@XmlRootElement(name = "getAllResponse", namespace = "http://com.ipartek.formacion/types")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllResponse", namespace = "http://com.ipartek.formacion/types")
public class GetAllResponse {

    @XmlElement(name = "return", namespace = "")
    private PeliculaColeccion _return;

    /**
     * 
     * @return
     *     returns PeliculaColeccion
     */
    public PeliculaColeccion getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(PeliculaColeccion _return) {
        this._return = _return;
    }

}
