
package com.ipartek.formacion.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ipartek.formacion.pojo.Coche;

@XmlRootElement(name = "obtenerCocheporCodigoResponse", namespace = "http://com.ipartek.formacion/types")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerCocheporCodigoResponse", namespace = "http://com.ipartek.formacion/types")
public class GetByIdResponse {

    @XmlElement(name = "return", namespace = "")
    private Coche _return;

    /**
     * 
     * @return
     *     returns Coche
     */
    public Coche getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Coche _return) {
        this._return = _return;
    }

}
