package Decorators;
import Devices.SmartDevice;

public class LoggingDecorator implements SmartDevice {
    private SmartDevice device;

    public LoggingDecorator(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        System.out.println("[LOG] Turning ON device.");
        device.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("[LOG] Turning OFF device.");
        device.turnOff();
    }

    @Override
    public String getStatus() {
        return "[LOG] " + device.getStatus();
    }
}
