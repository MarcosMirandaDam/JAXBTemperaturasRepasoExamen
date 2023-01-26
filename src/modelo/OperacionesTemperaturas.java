package modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import temperaturasBinding.DataTemSystem;
import temperaturasBinding.DataType;
import temperaturasBinding.ObjectFactory;
import temperaturasBinding.SensorType;

/**
 *
 * @author Marcos Miranda
 */
public class OperacionesTemperaturas {

    ObjectFactory fabrica = new ObjectFactory();

    /**
     * metodo unmarshalizar
     *
     * @param ficheroXML
     * @return
     * @throws JAXBException
     */
    public JAXBElement unmarshalizar(File ficheroXML) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance("temperaturasBinding");
        //Objeto unmarshall instanciado 
        Unmarshaller unmarshall = jaxbContext.createUnmarshaller();
        //
        JAXBElement jaxbElement = unmarshall.unmarshal(new StreamSource(ficheroXML), DataTemSystem.class);
        return jaxbElement;
    }

    /**
     * metodo marshalizar
     */
    public void marshalizar(JAXBElement jaxbElement, File ficheroXMLsalida) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance("temperaturasBinding");  //<-----nombre del paquete creado
        Marshaller m = jaxbContext.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(jaxbElement, ficheroXMLsalida);
    }

    /**
     * ¿Qué sensor ha registrado la temperatura máxima?
     */
    public String sensorMaxTemperatura(JAXBElement jaxbElement) {
        String resultado = "";
        List<DataType> listaRecopilatoria = new ArrayList<>();

        DataTemSystem raizData = fabrica.createDataTemSystem();
        raizData = (DataTemSystem) jaxbElement.getValue();
        //rama serverRegions
        List<DataTemSystem.ServerRegion> listaRegiones = raizData.getServerRegion();
        for (DataTemSystem.ServerRegion region : listaRegiones) {
            List<SensorType> listaSensores = region.getSensor();
            for (SensorType sensor : listaSensores) {
                List<DataType> listaData = sensor.getData();
                for (DataType dataType : listaData) {
                    listaRecopilatoria.add(dataType);           //añadimos los datos a la listaRecopilatoria
                }

            }
        }
        //rama owners
        List<DataTemSystem.Owner> listaOwners = raizData.getOwner();
        for (DataTemSystem.Owner owner : listaOwners) {
            List<DataType> listaData = owner.getSensor().getData();
            for (DataType dataType : listaData) {
                listaRecopilatoria.add(dataType);
            }
        }

        Comparator<DataType> comparator = (DataType d1, DataType d2) -> (int) (d1.getTemperature() - d2.getTemperature());

        listaRecopilatoria.sort(comparator);

        for (DataType dataType : listaRecopilatoria) {
            String sensorMaxTemp = "";
            float temperaturaMax = 0;
            if (dataType.getTemperature() > temperaturaMax) {
                temperaturaMax = dataType.getTemperature();
            }
            resultado += dataType.getTemperature();
        }

        return resultado;

    }

    /**
     * ¿Qué sensor ha registrado la temperatura máxima?
     */
    public List<String> sensorTempMaxima(JAXBElement jaxbElement) {
        Map<BigInteger, Float> mapSensorTempMaxima = new HashMap<>();
        DataTemSystem raizData = fabrica.createDataTemSystem();
        raizData = (DataTemSystem) jaxbElement.getValue();
        List<DataTemSystem.ServerRegion> listaRegiones = raizData.getServerRegion();
        for (DataTemSystem.ServerRegion region : listaRegiones) {
            List<SensorType> listaSensores = region.getSensor();
            for (SensorType sensor : listaSensores) {
                List<DataType> data = sensor.getData();
                for (DataType dataType : data) {
                    mapSensorTempMaxima.put(sensor.getSensorID(), dataType.getTemperature());
                }

            }
        }
        float max = Collections.max(mapSensorTempMaxima.values());
        List<String> sensoresMaxTemp = new ArrayList<>();
        for (Map.Entry<BigInteger, Float> entry : mapSensorTempMaxima.entrySet()) {
            if (Objects.equals(entry.getValue(), max)) {
                sensoresMaxTemp.add(String.valueOf(entry.getKey()));
            }
        }
        return sensoresMaxTemp;

    }

    /**
     * ¿Crear un Hashmap con K=year V= todos los datos de ese año
     */
    public HashMap<BigInteger, List<DataType>> datosAnioDeterminado(JAXBElement jaxbElement, BigInteger anioDeseado) {
        DataTemSystem raizData = fabrica.createDataTemSystem();
        raizData = (DataTemSystem) jaxbElement.getValue();
        HashMap<BigInteger, List<DataType>> mapDatosAnioDeterminado = new HashMap<>();
        List<DataTemSystem.ServerRegion> listaRegiones = raizData.getServerRegion();
        for (DataTemSystem.ServerRegion region : listaRegiones) {
            List<SensorType> listaSensores = region.getSensor();
            for (SensorType sensor : listaSensores) {
                List<DataType> listaDatos = sensor.getData();
                for (DataType dato : listaDatos) {
                    if (dato.getYear().equals(anioDeseado)) {
                        mapDatosAnioDeterminado.put(anioDeseado, listaDatos);
                    }
                }
            }
        }
        return mapDatosAnioDeterminado;
    }

    /**
     * Borrar todos los sensores de un determinado país (country).como objeto
     *
     * @param jaxbElement
     * @param countryEliminar
     * @return
     */
    public boolean eliminarSensoresPaisDeterminado(JAXBElement jaxbElement, Object countryEliminar) {
        boolean eliminado = false;
        DataTemSystem raizData = fabrica.createDataTemSystem();
        raizData = (DataTemSystem) jaxbElement.getValue();
        List<DataTemSystem.Owner> listaOwner = raizData.getOwner();
        for (Iterator<DataTemSystem.Owner> iterator = listaOwner.iterator(); iterator.hasNext();) {
            DataTemSystem.Owner next = iterator.next();
            SensorType sensorBorrar = next.getSensor();
            if (next.getCountry().equals(countryEliminar)) {
                iterator.remove();
                eliminado = true;
            }
        }
        return eliminado;
    }

    /**
     * En qué región hay más sensores?
     */
    /**
     * Mover todos los sensores de la región “Portugal” y “España” a una nueva
     * “Península Ibérica”
     */
    /**
     * Crear un txt con todas los años seguidos de la temperatura medida.
     *
     * @param jaxbElement
     * @return
     * @throws java.io.IOException
     */
    public boolean crearTXTaniosTemperaturaMedia(JAXBElement jaxbElement) throws IOException {
        DataTemSystem raizData = fabrica.createDataTemSystem();
        raizData = (DataTemSystem) jaxbElement.getValue();
        
        String nombreArchivo = "temperaturasAnios.txt";
        BufferedWriter bw = null;
        try {
            Map<BigInteger, List<DataType>> mapaAniosTemperaturas = new HashMap<>();
            List<Float> listaTemperaturas = new ArrayList<>();
            List<DataTemSystem.ServerRegion> listaServerRegions = raizData.getServerRegion();
            for (DataTemSystem.ServerRegion listaServerRegion : listaServerRegions) {
                List<SensorType> listaSensores = listaServerRegion.getSensor();
                for (SensorType sensor : listaSensores) {
                    List<DataType> listaDatos = sensor.getData();
                    for (DataType dato : listaDatos) {
                        listaTemperaturas.add(dato.getTemperature());
                        mapaAniosTemperaturas.put(BigInteger.TEN, listaDatos);
                    }

                }
            }
            bw = new BufferedWriter(new FileWriter(nombreArchivo));
            for (Map.Entry<BigInteger, List<DataType>> entry : mapaAniosTemperaturas.entrySet()) {
                BigInteger key = entry.getKey();
                List<DataType> value = entry.getValue();
                bw.write(key +"--->"+value+ "\n");

            }
        } catch (IOException ex) {

        } finally {
            try {
                bw.close();
            } catch (IOException iOException) {

            }
        }

        return true;
    }

}
