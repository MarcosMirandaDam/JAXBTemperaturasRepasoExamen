//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.26 a las 11:34:52 PM CET 
//


package temperaturasBinding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sensorModelType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sensorModelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="modelCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="modelName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="minTemperatureRange" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="maxTemperatureRange" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sensorModelType", propOrder = {
    "modelCode",
    "modelName",
    "manufacturer",
    "minTemperatureRange",
    "maxTemperatureRange"
})
public class SensorModelType {

    @XmlElement(required = true)
    protected String modelCode;
    @XmlElement(required = true)
    protected String modelName;
    @XmlElement(required = true)
    protected String manufacturer;
    protected float minTemperatureRange;
    protected float maxTemperatureRange;

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
     * Obtiene el valor de la propiedad modelName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Define el valor de la propiedad modelName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Obtiene el valor de la propiedad manufacturer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Define el valor de la propiedad manufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Obtiene el valor de la propiedad minTemperatureRange.
     * 
     */
    public float getMinTemperatureRange() {
        return minTemperatureRange;
    }

    /**
     * Define el valor de la propiedad minTemperatureRange.
     * 
     */
    public void setMinTemperatureRange(float value) {
        this.minTemperatureRange = value;
    }

    /**
     * Obtiene el valor de la propiedad maxTemperatureRange.
     * 
     */
    public float getMaxTemperatureRange() {
        return maxTemperatureRange;
    }

    /**
     * Define el valor de la propiedad maxTemperatureRange.
     * 
     */
    public void setMaxTemperatureRange(float value) {
        this.maxTemperatureRange = value;
    }

}
