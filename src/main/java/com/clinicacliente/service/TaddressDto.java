
package com.clinicacliente.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para taddressDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="taddressDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="distritoIdDistrict" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idAddress" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tprovinceIdProvince" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="villageIdVillage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taddressDto", propOrder = {
    "addressSpec",
    "distritoIdDistrict",
    "idAddress",
    "tprovinceIdProvince",
    "villageIdVillage"
})
public class TaddressDto {

    protected String addressSpec;
    protected Long distritoIdDistrict;
    protected Long idAddress;
    protected Long tprovinceIdProvince;
    protected Long villageIdVillage;

    /**
     * Obtiene el valor de la propiedad addressSpec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressSpec() {
        return addressSpec;
    }

    /**
     * Define el valor de la propiedad addressSpec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressSpec(String value) {
        this.addressSpec = value;
    }

    /**
     * Obtiene el valor de la propiedad distritoIdDistrict.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDistritoIdDistrict() {
        return distritoIdDistrict;
    }

    /**
     * Define el valor de la propiedad distritoIdDistrict.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDistritoIdDistrict(Long value) {
        this.distritoIdDistrict = value;
    }

    /**
     * Obtiene el valor de la propiedad idAddress.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAddress() {
        return idAddress;
    }

    /**
     * Define el valor de la propiedad idAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAddress(Long value) {
        this.idAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad tprovinceIdProvince.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTprovinceIdProvince() {
        return tprovinceIdProvince;
    }

    /**
     * Define el valor de la propiedad tprovinceIdProvince.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTprovinceIdProvince(Long value) {
        this.tprovinceIdProvince = value;
    }

    /**
     * Obtiene el valor de la propiedad villageIdVillage.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVillageIdVillage() {
        return villageIdVillage;
    }

    /**
     * Define el valor de la propiedad villageIdVillage.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVillageIdVillage(Long value) {
        this.villageIdVillage = value;
    }

}
