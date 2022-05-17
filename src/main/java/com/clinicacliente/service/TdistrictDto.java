
package com.clinicacliente.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdistrictDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tdistrictDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idDistrict" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nameDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="provincesIdProvince" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tdistrictDto", propOrder = {
    "idDistrict",
    "nameDistrict",
    "provincesIdProvince"
})
public class TdistrictDto {

    protected Long idDistrict;
    protected String nameDistrict;
    protected Long provincesIdProvince;

    /**
     * Obtiene el valor de la propiedad idDistrict.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDistrict() {
        return idDistrict;
    }

    /**
     * Define el valor de la propiedad idDistrict.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDistrict(Long value) {
        this.idDistrict = value;
    }

    /**
     * Obtiene el valor de la propiedad nameDistrict.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameDistrict() {
        return nameDistrict;
    }

    /**
     * Define el valor de la propiedad nameDistrict.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameDistrict(String value) {
        this.nameDistrict = value;
    }

    /**
     * Obtiene el valor de la propiedad provincesIdProvince.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProvincesIdProvince() {
        return provincesIdProvince;
    }

    /**
     * Define el valor de la propiedad provincesIdProvince.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProvincesIdProvince(Long value) {
        this.provincesIdProvince = value;
    }

}
