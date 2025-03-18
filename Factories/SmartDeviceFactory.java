package Factories;
import Devices.SmartDevice;
import LivingRoom.*;
import Bathroom.SmartFan;
import Bathroom.WaterHeater;

public class SmartDeviceFactory {
    public static SmartDevice createDevice(String type) {
        type = type.trim();
        switch (type) {
            case "Light": return new Light();
            case "Camera": return new Camera();
            case "SmartCurtains": return new SmartCurtains();
            case "SmartThermostat": return new SmartThermostat();
            case "SmartTV": return new SmartTV();
            case "SmartFan": return new SmartFan();
            case "WaterHeater": return new WaterHeater();
            default: throw new IllegalArgumentException("Unknown device: " + type);
        }
    }
}

