
package com.clinicacliente.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SEARCH_USER_TYPE_REGSResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SEARCH_USER_TYPE_REGSResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://typeUserService.usersinfoService.service.cliniacajavaee.com/}tuserTypeRegsDto" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SEARCH_USER_TYPE_REGSResponse", propOrder = {
    "_return"
})
public class SEARCHUSERTYPEREGSResponse {

    @XmlElement(name = "return")
    protected TuserTypeRegsDto _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link TuserTypeRegsDto }
     *     
     */
    public TuserTypeRegsDto getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link TuserTypeRegsDto }
     *     
     */
    public void setReturn(TuserTypeRegsDto value) {
        this._return = value;
    }

}
