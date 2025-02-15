package itec3030.assignment2;

import newtemp.NewTempSensor.NewTempSensorDriver;
import newtemp.NewTempSensor.Observer;

/**
 * An adapter class for {@link NewTempSensorDriver}
 */
public class NewTempSensorAdapter implements AbstractNewTempSensorAdapter, Observer {

    private NewTempSensorDriver adatptee;
    private String id;
    private int lastReading;

    /**
     * Constructs a new {@link NewTempSensorAdapter}.
     * <p>
     * Initializes the {@link NewTempSensorDriver} instance and registers this adapter as an observer.
     */
    public NewTempSensorAdapter() {
        this.adatptee = new NewTempSensorDriver();
        adatptee.registerObserver(this);
    }

    /**
     * Returns the {@link NewTempSensorDriver} instance associated with this adapter.
     *
     * @return the {@link NewTempSensorDriver} instance.
     */
    public NewTempSensorDriver getAdatptee() {
        return adatptee;
    }

    /**
     * Sets the unique identifier for this sensor.
     *
     * @param id the unique identifier to be set.
     */
    public void setID(String id) {
        this.id = id;
    }

    /**
     * Retrieves the latest temperature reading received by the adapter.
     *
     * @return the last temperature reading.
     */
    public int getReading() {
        return lastReading;
    }

    /**
     * Updates the temperature reading when notified by the {@link NewTempSensorDriver}.
     *
     * @param i the new temperature value.
     */
    @Override
    public void update(int i) {
        lastReading = i;
        System.out.println("Sensor(" + id + ") receiving new temperature: " + i);
    }

    /**
     * Set a new temperature being sent to the driver, updating the temperature reading.
     *
     * @param temperature the new temperature value.
     */
    public void newTemperature(int temperature) {
        lastReading = temperature;
        System.out.println("Sensor(" + id + ") receiving new temperature: " + temperature);
    }
}
