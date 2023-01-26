//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.26 a las 11:34:52 PM CET 
//


package temperaturasBinding;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sensorType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sensorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sensorID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ownerID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="modelCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="data" type="{}dataType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sensorType", propOrder = {
    "sensorID",
    "ownerID",
    "modelCode",
    "data",
    "location"
})
public class SensorType {

    @XmlElement(required = true)
    protected BigInteger sensorID;
    @XmlElement(required = true)
    protected BigInteger ownerID;
    @XmlElement(required = true)
    protected String modelCode;
    @XmlElement(required = true)
    protected List<DataType> data;
    @XmlElement(required = true)
    protected String location;

    /**
     * Obtiene el valor de la propiedad sensorID.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSensorID() {
        return sensorID;
    }

    /**
     * Define el valor de la propiedad sensorID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSensorID(BigInteger value) {
        this.sensorID = value;
    }

    /**
     * Obtiene el valor de la propiedad ownerID.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOwnerID() {
        return ownerID;
    }

    /**
     * Define el valor de la propiedad ownerID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOwnerID(BigInteger value) {
        this.ownerID = value;
    }

    /**
     * Obtiene el valor de la propiedad modelCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelCode() {
        return modelCode;
    }

    /**
     * Define el valor de la propiedad modelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelCode(String value) {
        this.modelCode = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataType }
     * 
     * 
     */
    public List<DataType> getData() {
        if (data == null) {
            data = new ArrayList<DataType>();
        }
        return this.data;
    }

    /**
     * Obtiene el valor de la propiedad location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

}
