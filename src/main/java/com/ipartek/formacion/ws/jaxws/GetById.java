
package com.ipartek.formacion.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "obtenerCocheporCodigo", namespace = "http://com.ipartek.formacion/types")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerCocheporCodigo", namespace = "http://com.ipartek.formacion/types")
public class GetById {

    @XmlElement(name = "codigo", namespace = "", required = true)
    private Integer codigo;

    /**
     * 
     * @return
     *     returns Integer
     */
    public Integer getCodigo() {
        return this.codigo;
    }

    /**
     * 
     * @param codigo
     *     the value for the codigo property
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

}
