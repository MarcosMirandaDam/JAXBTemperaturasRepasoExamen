//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.26 a las 11:34:52 PM CET 
//


package temperaturasBinding;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the temperaturasBinding package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: temperaturasBinding
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataTemSystem }
     * 
     */
    public DataTemSystem createDataTemSystem() {
        return new DataTemSystem();
    }

    /**
     * Create an instance of {@link DataTemSystem.Owner }
     * 
     */
    public DataTemSystem.Owner createDataTemSystemOwner() {
        return new DataTemSystem.Owner();
    }

    /**
     * Create an instance of {@link DataTemSystem.ServerRegion }
     * 
     */
    public DataTemSystem.ServerRegion createDataTemSystemServerRegion() {
        return new DataTemSystem.ServerRegion();
    }

    /**
     * Create an instance of {@link SensorModelType }
     * 
     */
    public SensorModelType createSensorModelType() {
        return new SensorModelType();
    }

    /**
     * Create an instance of {@link SensorType }
     * 
     */
    public SensorType createSensorType() {
        return new SensorType();
    }

    /**
     * Create an instance of {@link DataType }
     * 
     */
    public DataType createDataType() {
        return new DataType();
    }

}
