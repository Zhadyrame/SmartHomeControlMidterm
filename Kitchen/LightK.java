package Kitchen;
import Devices.SmartDevice;

public class LightK implements SmartDevice {
    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Kitchen Light ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Kitchen Light OFF.");
    }

    @Override
    public String getStatus() {
        return "Kitchen Light " + (isOn ? "ON" : "OFF");
    }
}

