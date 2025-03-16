package SmartHomeController;
import Devices.SmartDevice;
import java.util.ArrayList;
import java.util.List;

public class SmartController {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnAllOn() {
        System.out.println("Turning ON all devices...");
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    public void turnAllOff() {
        System.out.println("Turning OFF all devices...");
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    public void getSystemStatus() {
        System.out.println("Smart Home System Status:");
        for (SmartDevice device : devices) {
            System.out.println(device.getStatus());
        }
    }
}
