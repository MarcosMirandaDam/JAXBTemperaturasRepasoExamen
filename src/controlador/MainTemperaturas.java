package controlador;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import modelo.OperacionesTemperaturas;
import temperaturasBinding.DataTemSystem;
import temperaturasBinding.ObjectFactory;

/**
 *
 * @author Marcos Miranda
 */
public class MainTemperaturas {

    public static void main(String[] args) throws IOException {

        try {
            OperacionesTemperaturas operacion = new OperacionesTemperaturas();

            //archivo de entrada
            File ficheroXML = new File("temperatures.xml");
            // archivo de salida
            File ficheroXMLsalida = new File("temperaturesSalida.xml");

            //unmarshalizar
            JAXBElement jaxbElement = operacion.unmarshalizar(ficheroXML);

            ObjectFactory fabrica = new ObjectFactory();
            DataTemSystem raizData = fabrica.createDataTemSystem();
            raizData = (DataTemSystem) jaxbElement.getValue();
            
            ////////////////////////////////////////////////////////////////////
            ///////////COMIENZO DE OPERACIONES//////////////////////////////////
            ////////////////////////////////////////////////////////////////////
            
            //¿Qué sensor ha registrado la temperatura máxima?
            System.out.println(operacion.sensorMaxTemperatura(jaxbElement));
            //System.out.println(operacion.sensorTempMaxima(jaxbElement));
            System.out.println(operacion.datosAnioDeterminado(jaxbElement, BigInteger.ONE));
            System.out.println(operacion.eliminarSensoresPaisDeterminado(jaxbElement, jaxbElement));
            System.out.println(operacion.crearTXTaniosTemperaturaMedia(jaxbElement));

            //marshalizar
            operacion.marshalizar(jaxbElement, ficheroXMLsalida);

        } catch (JAXBException ex) {
            Logger.getLogger(MainTemperaturas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
