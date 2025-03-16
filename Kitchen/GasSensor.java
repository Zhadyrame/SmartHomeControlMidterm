package Kitchen;
import Devices.SmartDevice;

public class GasSensor implements SmartDevice {
    private boolean isDetecting = false;

    @Override
    public void turnOn() {
        isDetecting = true;
        System.out.println("Gas Sensor MONITORING gas levels.");
    }

    @Override
    public void turnOff() {
        isDetecting = false;
        System.out.println("Gas Sensor OFF.");
    }

    @Override
    public String getStatus() {
        return "Gas Sensor" + (isDetecting ? "ACTIVE" : "OFF");
    }
}
