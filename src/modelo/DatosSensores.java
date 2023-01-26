
package modelo;

import java.math.BigInteger;

/**
 *
 * @author Marcos Miranda
 */
public class DatosSensores {
    
    BigInteger sensorID;
    float temperature;

    public DatosSensores(BigInteger sensorID, float temperature) {
        this.sensorID = sensorID;
        this.temperature = temperature;
    }

    public BigInteger getSensorID() {
        return sensorID;
    }

    public void setSensorID(BigInteger sensorID) {
        this.sensorID = sensorID;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "DatosSensores{" + "sensorID=" + sensorID + ", temperature=" + temperature + '}';
    }
    
    
}
