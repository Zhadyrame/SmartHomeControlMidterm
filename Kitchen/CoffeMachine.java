package Kitchen;
import Devices.SmartDevice;

public class CoffeMachine implements SmartDevice {
    private boolean isBrewing = false;

    @Override
    public void turnOn() {
        isBrewing = true;
        System.out.println("Coffee Machine BREWING coffee.");
    }

    @Override
    public void turnOff() {
        isBrewing = false;
        System.out.println("Coffee Machine turned OFF.");
    }

    @Override
    public String getStatus() {
        return "Coffee machine " + (isBrewing ? "BREWING" : "OFF");
    }
}
