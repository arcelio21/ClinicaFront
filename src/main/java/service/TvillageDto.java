
package service;

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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idDistrictId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "id",
    "idDistrictId",
    "nameVillage"
})
public class TvillageDto {

    protected Integer id;
    protected Integer idDistrictId;
    protected String nameVillage;

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
