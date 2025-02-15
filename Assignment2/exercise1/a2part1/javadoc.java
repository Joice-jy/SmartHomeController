package itec3030.assignments.a2;

import oldtempinc.drivers.OldTempSensor;
import itec3030.smarthome.standards.TemperatureSensor;

/**
 * This class connects an OldTempSensor to the standard system.
 */
public class OldTempSensorAdapter implements TemperatureSensor {

    private OldTempSensor adaptee; // The sensor we are adapting
    private String id; // The ID for this sensor

    /**
     * Creates a new adapter for the OldTempSensor.
     */
    public OldTempSensorAdapter() {
        this.adaptee = new OldTempSensor();
    }

    /**
     * Gets the temperature from the old sensor.
     */
    public int getReading() {
        return (int) adaptee.getTemperature();
    }

    /**
     * Updates the temperature in the old sensor.
     */
    public void newTemperature(int temperature) {
        adaptee.newTemperature((float) temperature);
    }

    /**
     * Sets the ID for this sensor.
     */
    public void setID(String id) {
        this.id = id;
    }

    /**
     * Enables the sensor. (From the interface, not set up yet.)
     */
    public void enable() {
        // Not done yet
    }

    /**
     * Disables the sensor. (From the interface, not set up yet.)
     */
    public void disable() {
        // Not done yet
    }

    /**
     * Checks if the sensor is on. (From the interface, always false for now.)
     */
    public boolean enabled() {
        return false;
    }

    /**
     * Gets the ID of this sensor.
     */
    public String getID() {
        return this.id;
    }

    /**
     * Links this sensor to a controller. (From the interface, not set up yet.)
     */
    public void setController(itec3030.smarthome.standards.ControllerInterface controller) {
        // Not done yet
    }

    /**
     * Gets the controller for this sensor. (From the interface, always null for now.)
     */
    public itec3030.smarthome.standards.ControllerInterface getController() {
        return null;
    }
}
