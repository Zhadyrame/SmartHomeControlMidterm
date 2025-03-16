package Factories;
import Devices.SmartDevice;
import LivingRoom.*;

public class SmartDeviceFactory {
    public static SmartDevice createDevice(String type) {
        switch (type) {
            case "Light": return new Light();
            case "Camera": return new Camera();
            case "SmartCurtains": return new SmartCurtains();
            case "SmartThermostat": return new SmartThermostat();
            case "SmartTV": return new SmartTV();
            default: throw new IllegalArgumentException("Unknown device .");
        }
    }
}
