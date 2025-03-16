package LivingRoom;
import Devices.SmartDevice;
import java.time.LocalTime;

public class SmartCurtains implements SmartDevice {
    private boolean isOpen = false;

    @Override
    public void turnOn() {
        int hour = LocalTime.now().getHour();
        if (hour >= 8 && hour < 20) {
            isOpen = true;
            System.out.println("Smart Curtains are OPEN.");
        } else {
            System.out.println("Cannot open curtains at this time.");
        }
    }

    @Override
    public void turnOff() {
        isOpen = false;
        System.out.println("Smart Curtains are CLOSED.");
    }

    @Override
    public String getStatus() {
        return "Smart Curtains are " + (isOpen ? "OPEN" : "CLOSED");
    }
}
