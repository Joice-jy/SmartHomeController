/*
 *  Template Developed by Sotirios Liaskos for the needs of
 *   ITEC3030 Systems Architecture.
 *  @ All Rights Reserved
 */
package itec3030.assignment2;


import newtemp.NewTempSensor.NewTempSensorDevice;
import itec3030.smarthome.standards.TemperatureSensor;
import newtemp.NewTempSensor.NewTempSensorDriver;
import oldtempinc.hardware.OldSensorDevice;


/**
 *
 * @author Sotirios
 */
public class Main {
    Main p = new Main();

    public static void main(String[] args) throws InterruptedException {

        

       
        
        // ***
        // SCENARIO 2 - Exercise 2
        // ***
        
        //Creating the adapter


        NewTempSensorAdapter o2 = new NewTempSensorAdapter();
        o2.setID("o2");
      
        //Creating a new NewTemp Hardware Device and passing a NewTempSensor in it.
        NewTempSensorDevice newdev = new NewTempSensorDevice(o2.getAdatptee());
        
        // Part 1: Play the device scenario
        newdev.start();
        // Part 2: Get the last reading
        System.out.println("Last reading sent from device was " + o2.getReading());
        // Part 3: Trigger your own temperature event:
        o2.newTemperature(35);
        
        
        

    }
}