
package service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tstatusDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tstatusDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nameStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ttypeUserIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tuserTypeRegIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tstatusDto", propOrder = {
    "id",
    "nameStatus",
    "ttypeUserIds",
    "tuserTypeRegIds"
})
public class TstatusDto {

    protected Integer id;
    protected String nameStatus;
    @XmlElement(nillable = true)
    protected List<Integer> ttypeUserIds;
    @XmlElement(nillable = true)
    protected List<Long> tuserTypeRegIds;

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
     * Obtiene el valor de la propiedad nameStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameStatus() {
        return nameStatus;
    }

    /**
     * Define el valor de la propiedad nameStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameStatus(String value) {
        this.nameStatus = value;
    }

    /**
     * Gets the value of the ttypeUserIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ttypeUserIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtypeUserIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getTtypeUserIds() {
        if (ttypeUserIds == null) {
            ttypeUserIds = new ArrayList<Integer>();
        }
        return this.ttypeUserIds;
    }

    /**
     * Gets the value of the tuserTypeRegIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tuserTypeRegIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTuserTypeRegIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getTuserTypeRegIds() {
        if (tuserTypeRegIds == null) {
            tuserTypeRegIds = new ArrayList<Long>();
        }
        return this.tuserTypeRegIds;
    }

}
