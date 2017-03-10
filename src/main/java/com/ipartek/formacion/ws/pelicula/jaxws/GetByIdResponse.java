
package com.ipartek.formacion.ws.pelicula.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ipartek.formacion.ws.pelicula.PeliculaMensaje;

@XmlRootElement(name = "obtenerporidResponse", namespace = "http://com.ipartek.formacion/types")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerporidResponse", namespace = "http://com.ipartek.formacion/types")
public class GetByIdResponse {

    @XmlElement(name = "return", namespace = "")
    private PeliculaMensaje _return;

    /**
     * 
     * @return
     *     returns PeliculaMensaje
     */
    public PeliculaMensaje getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(PeliculaMensaje _return) {
        this._return = _return;
    }

}
