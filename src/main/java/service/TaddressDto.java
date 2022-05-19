
package service;

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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idDistrictId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idProvinceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idVillageId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tuserregId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
    "id",
    "idDistrictId",
    "idProvinceId",
    "idVillageId",
    "tuserregId"
})
public class TaddressDto {

    protected String addressSpec;
    protected Long id;
    protected Integer idDistrictId;
    protected Integer idProvinceId;
    protected Integer idVillageId;
    protected Long tuserregId;

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
     * Obtiene el valor de la propiedad idDistrictId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdDistrictId() {
        return idDistrictId;
    }

    /**
     * Define el valor de la propiedad idDistrictId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdDistrictId(Integer value) {
        this.idDistrictId = value;
    }

    /**
     * Obtiene el valor de la propiedad idProvinceId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdProvinceId() {
        return idProvinceId;
    }

    /**
     * Define el valor de la propiedad idProvinceId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdProvinceId(Integer value) {
        this.idProvinceId = value;
    }

    /**
     * Obtiene el valor de la propiedad idVillageId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdVillageId() {
        return idVillageId;
    }

    /**
     * Define el valor de la propiedad idVillageId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdVillageId(Integer value) {
        this.idVillageId = value;
    }

    /**
     * Obtiene el valor de la propiedad tuserregId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTuserregId() {
        return tuserregId;
    }

    /**
     * Define el valor de la propiedad tuserregId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTuserregId(Long value) {
        this.tuserregId = value;
    }

}
