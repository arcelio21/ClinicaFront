
package com.clinicacliente.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ttypeUserDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ttypeUserDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idStatusId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nameTypeUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ttypeUserDto", propOrder = {
    "id",
    "idStatusId",
    "nameTypeUser"
})
public class TtypeUserDto {

    protected Integer id;
    protected Integer idStatusId;
    protected String nameTypeUser;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad idStatusId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdStatusId() {
        return idStatusId;
    }

    /**
     * Define el valor de la propiedad idStatusId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdStatusId(Integer value) {
        this.idStatusId = value;
    }

    /**
     * Obtiene el valor de la propiedad nameTypeUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTypeUser() {
        return nameTypeUser;
    }

    /**
     * Define el valor de la propiedad nameTypeUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTypeUser(String value) {
        this.nameTypeUser = value;
    }

}
