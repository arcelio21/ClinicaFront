
package com.clinicacliente.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tprovinceDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tprovinceDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idProvince" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nameProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tprovinceDto", propOrder = {
    "idProvince",
    "nameProvince"
})
public class TprovinceDto {

    protected Long idProvince;
    protected String nameProvince;

    /**
     * Obtiene el valor de la propiedad idProvince.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdProvince() {
        return idProvince;
    }

    /**
     * Define el valor de la propiedad idProvince.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdProvince(Long value) {
        this.idProvince = value;
    }

    /**
     * Obtiene el valor de la propiedad nameProvince.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameProvince() {
        return nameProvince;
    }

    /**
     * Define el valor de la propiedad nameProvince.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameProvince(String value) {
        this.nameProvince = value;
    }

}
