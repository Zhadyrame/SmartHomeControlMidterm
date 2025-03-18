package main;
import Adapters.LegacyDeviceAdapter;
import Bathroom.SmartFan;
import Bathroom.WaterHeater;
import Decorators.LoggingDecorator;
import Decorators.ScheduledOperationDecorator;
import Devices.SmartDevice;
import Factories.SmartDeviceFactory;
import Kitchen.CoffeMachine;
import Kitchen.GasSensor;
import Kitchen.LightK;
import LivingRoom.*;
public class Main {
    public static void main(String[] args) {
        SmartDevice fan = SmartDeviceFactory.createDevice("SmartFan");
        SmartDevice heater = SmartDeviceFactory.createDevice("WaterHeater");
        SmartDevice camera = SmartDeviceFactory.createDevice("Camera");
        SmartDevice tv = SmartDeviceFactory.createDevice("SmartTV");
        SmartDevice loggedFan = new LoggingDecorator(fan);
        SmartDevice scheduledHeater = new ScheduledOperationDecorator(heater, 600);
        LegacyDeviceAdapter oldLight = new LegacyDeviceAdapter();
        loggedFan.turnOn();
        scheduledHeater.turnOn();
        camera.turnOn();
        tv.turnOn();
        oldLight.turnOn();
        loggedFan.turnOff();
        scheduledHeater.turnOff();
        camera.turnOff();
        tv.turnOff();
        oldLight.turnOff();
    }
}