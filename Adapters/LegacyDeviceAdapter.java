package Adapters;
import Devices.SmartDevice;

public class LegacyDeviceAdapter implements SmartDevice {
    private boolean powerState = false;

    @Override
    public void turnOn() {
        powerState = true;
        System.out.println("Legacy Device ON.");
    }

    @Override
    public void turnOff() {
        powerState = false;
        System.out.println("Legacy Device OFF.");
    }

    @Override
    public String getStatus() {
        return "Legacy Device " + (powerState ? "ON" : "OFF");
    }
}

