
package com.clinicacliente.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tvillageDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tvillageDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="districtIdDistrict" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idVillage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nameVillage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tvillageDto", propOrder = {
    "districtIdDistrict",
    "idVillage",
    "nameVillage"
})
public class TvillageDto {

    protected Long districtIdDistrict;
    protected Long idVillage;
    protected String nameVillage;

    /**
     * Obtiene el valor de la propiedad districtIdDistrict.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDistrictIdDistrict() {
        return districtIdDistrict;
    }

    /**
     * Define el valor de la propiedad districtIdDistrict.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDistrictIdDistrict(Long value) {
        this.districtIdDistrict = value;
    }

    /**
     * Obtiene el valor de la propiedad idVillage.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdVillage() {
        return idVillage;
    }

    /**
     * Define el valor de la propiedad idVillage.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdVillage(Long value) {
        this.idVillage = value;
    }

    /**
     * Obtiene el valor de la propiedad nameVillage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameVillage() {
        return nameVillage;
    }

    /**
     * Define el valor de la propiedad nameVillage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameVillage(String value) {
        this.nameVillage = value;
    }

}
