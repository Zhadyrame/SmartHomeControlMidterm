package LivingRoom;
import Devices.SmartDevice;
import java.time.LocalTime;

public class SmartTV implements SmartDevice {
    private boolean isOn = false;

    public void scheduleViewing(int hour) {
        if (hour >= 0 && hour <= 23) {
            System.out.println("Smart TV will turn ON at " + hour + ":00.");
        } else {
            System.out.println("Invalid time for scheduling.");
        }
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Smart TV  ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Smart TV  OFF.");
    }

    @Override
    public String getStatus() {
        return "Smart TV  " + (isOn ? "ON" : "OFF");
    }
}
