package itec3030.assignments.a1;

import itec3030.assignments.a1.sensors.thermoset.ThermoSetX19FrontEnd.FrontEnd;
import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.Thermostat;

public class ThermoSetX19 implements Thermostat {

    private int temperature;
    private ControllerInterface controllerInterface;
    private String id;
    private boolean enabled;

    /**
     * Default constructor
     */
    public ThermoSetX19() {
        FrontEnd gui = new FrontEnd(this);
        gui.pack();
        gui.setVisible(true);
    }

    /**
     * Set a new temperature
     * @param temperature The new temperature
     */
    @Override
    public void newTemperature(int temperature) {
        this.temperature = temperature;
    }


    /**
     * Get the temperature controller interface
     * @return the controllerInterface
     */
    @Override
    public ControllerInterface getController() {
        return controllerInterface;
    }

    /**
     * Set a new Controller Interface
     * @param controllerInterface the controller interface.
     */
    @Override
    public void setController(ControllerInterface controllerInterface) {
        this.controllerInterface = controllerInterface;
    }

    /**
     * Get the ID.
     * @return id
     */
    @Override
    public String getID() {
        return id;
    }

    /**
     * To set the ID
     * @param id the ID
     */
    @Override
    public void setID(String id) {
        this.id = id;
    }

    /**
     * Enable the thermostat
     */
    @Override
    public void enable() {
        enabled = true;
    }

    /**
     * Disable the thermostat
     */
    @Override
    public void disable() {
        enabled = false;
    }

    /**
     * Check if the thermostat is enabled or not
     * @return true if enabled, false otherwise
     */
    @Override
    public boolean enabled() {
        return enabled;
    }

    /**
     * Fet the current set temperature
     * @return temperature
     */
    @Override
    public int getReading() {
        return temperature;
    }
}
