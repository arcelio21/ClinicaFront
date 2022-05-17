
package com.clinicacliente.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tuserTypeRegsDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tuserTypeRegsDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idStatusId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idTypeUserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idUserRegId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tuserTypeRegsDto", propOrder = {
    "id",
    "idStatusId",
    "idTypeUserId",
    "idUserRegId"
})
public class TuserTypeRegsDto {

    protected Long id;
    protected Integer idStatusId;
    protected Integer idTypeUserId;
    protected Long idUserRegId;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
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
     * Obtiene el valor de la propiedad idTypeUserId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTypeUserId() {
        return idTypeUserId;
    }

    /**
     * Define el valor de la propiedad idTypeUserId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTypeUserId(Integer value) {
        this.idTypeUserId = value;
    }

    /**
     * Obtiene el valor de la propiedad idUserRegId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdUserRegId() {
        return idUserRegId;
    }

    /**
     * Define el valor de la propiedad idUserRegId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdUserRegId(Long value) {
        this.idUserRegId = value;
    }

}
