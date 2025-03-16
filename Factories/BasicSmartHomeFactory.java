package Factories;

import Devices.SmartDevice;
import LivingRoom.*;
import Kitchen.*;
import Bathroom.*;

public class BasicSmartHomeFactory {
    public static SmartDevice createBasicDevice(String type) {
        switch (type) {
            case "Light": return new Light();
            case "Camera": return new Camera();
            case "SmartCurtains": return new SmartCurtains();
            case "SmartThermostat": return new SmartThermostat();
            case "SmartTV": return new SmartTV();
            case "CoffeMachine": return new CoffeMachine();
            case "GasSensor": return new GasSensor();
            case "LightK": return new LightK();
            case "SmartFan": return new SmartFan();
            case "WaterHeater": return new WaterHeater();
            default: throw new IllegalArgumentException("Unknown device.");
        }
    }
}
