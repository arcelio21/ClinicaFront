
package service;

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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idProvinceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nameDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "id",
    "idProvinceId",
    "nameDistrict"
})
public class TdistrictDto {

    protected Integer id;
    protected Integer idProvinceId;
    protected String nameDistrict;

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

}
