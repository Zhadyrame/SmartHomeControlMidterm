package LivingRoom;
import Devices.SmartDevice;

public class Light implements SmartDevice {
    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light turned OFF.");
    }

    @Override
    public String getStatus() {
        return "Light " + (isOn ? "ON" : "OFF");
    }
}

