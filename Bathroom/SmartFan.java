package Bathroom;
import Devices.SmartDevice;

public class SmartFan implements SmartDevice {
    private boolean isRunning = false;

    @Override
    public void turnOn() {
        isRunning = true;
        System.out.println("Smart Fan RUNNING.");
    }

    @Override
    public void turnOff() {
        isRunning = false;
        System.out.println("Smart Fan OFF.");
    }

    @Override
    public String getStatus() {
        return "Smart Fan" + (isRunning ? "ON" : "OFF");
    }
}
