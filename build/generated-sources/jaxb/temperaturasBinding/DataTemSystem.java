//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.26 a las 11:34:52 PM CET 
//


package temperaturasBinding;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="owner" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ownerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="sensor" type="{}sensorType"/&gt;
 *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="serverRegion" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="serverRegionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="sensor" type="{}sensorType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sensorModel" type="{}sensorModelType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "owner",
    "serverRegion",
    "sensorModel"
})
@XmlRootElement(name = "dataTemSystem")
public class DataTemSystem {

    @XmlElement(required = true)
    protected List<DataTemSystem.Owner> owner;
    @XmlElement(required = true)
    protected List<DataTemSystem.ServerRegion> serverRegion;
    @XmlElement(required = true)
    protected List<SensorModelType> sensorModel;

    /**
     * Gets the value of the owner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the owner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataTemSystem.Owner }
     * 
     * 
     */
    public List<DataTemSystem.Owner> getOwner() {
        if (owner == null) {
            owner = new ArrayList<DataTemSystem.Owner>();
        }
        return this.owner;
    }

    /**
     * Gets the value of the serverRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serverRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataTemSystem.ServerRegion }
     * 
     * 
     */
    public List<DataTemSystem.ServerRegion> getServerRegion() {
        if (serverRegion == null) {
            serverRegion = new ArrayList<DataTemSystem.ServerRegion>();
        }
        return this.serverRegion;
    }

    /**
     * Gets the value of the sensorModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sensorModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSensorModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SensorModelType }
     * 
     * 
     */
    public List<SensorModelType> getSensorModel() {
        if (sensorModel == null) {
            sensorModel = new ArrayList<SensorModelType>();
        }
        return this.sensorModel;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ownerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="sensor" type="{}sensorType"/&gt;
     *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ownerID",
        "name",
        "email",
        "phone",
        "sensor",
        "country"
    })
    public static class Owner {

        @XmlElement(required = true)
        protected String ownerID;
        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String email;
        @XmlElement(required = true)
        protected String phone;
        @XmlElement(required = true)
        protected SensorType sensor;
        @XmlElement(required = true)
        protected Object country;

        /**
         * Obtiene el valor de la propiedad ownerID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwnerID() {
            return ownerID;
        }

        /**
         * Define el valor de la propiedad ownerID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwnerID(String value) {
            this.ownerID = value;
        }

        /**
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Obtiene el valor de la propiedad email.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Define el valor de la propiedad email.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Obtiene el valor de la propiedad phone.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Define el valor de la propiedad phone.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
        }

        /**
         * Obtiene el valor de la propiedad sensor.
         * 
         * @return
         *     possible object is
         *     {@link SensorType }
         *     
         */
        public SensorType getSensor() {
            return sensor;
        }

        /**
         * Define el valor de la propiedad sensor.
         * 
         * @param value
         *     allowed object is
         *     {@link SensorType }
         *     
         */
        public void setSensor(SensorType value) {
            this.sensor = value;
        }

        /**
         * Obtiene el valor de la propiedad country.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCountry() {
            return country;
        }

        /**
         * Define el valor de la propiedad country.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCountry(Object value) {
            this.country = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="serverRegionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="sensor" type="{}sensorType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "serverRegionName",
        "sensor"
    })
    public static class ServerRegion {

        @XmlElement(required = true)
        protected String serverRegionName;
        @XmlElement(required = true)
        protected List<SensorType> sensor;

        /**
         * Obtiene el valor de la propiedad serverRegionName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServerRegionName() {
            return serverRegionName;
        }

        /**
         * Define el valor de la propiedad serverRegionName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServerRegionName(String value) {
            this.serverRegionName = value;
        }

        /**
         * Gets the value of the sensor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sensor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSensor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SensorType }
         * 
         * 
         */
        public List<SensorType> getSensor() {
            if (sensor == null) {
                sensor = new ArrayList<SensorType>();
            }
            return this.sensor;
        }

    }

}
