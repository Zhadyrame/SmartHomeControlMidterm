package Bathroom;
import Devices.SmartDevice;

public class WaterHeater implements SmartDevice {
    private boolean isHeating = false;

    @Override
    public void turnOn() {
        isHeating = true;
        System.out.println("Water Heater HEATING.");
    }

    @Override
    public void turnOff() {
        isHeating = false;
        System.out.println("Water Heater OFF.");
    }

    @Override
    public String getStatus() {
        return "Water Heater" + (isHeating ? "HEATING" : "OFF");
    }
}

