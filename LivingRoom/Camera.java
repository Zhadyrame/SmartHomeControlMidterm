package LivingRoom;
import Devices.SmartDevice;

public class Camera implements SmartDevice {
    private boolean isRecording = false;

    @Override
    public void turnOn() {
        isRecording = true;
        System.out.println("Camera now RECORDING.");
    }

    @Override
    public void turnOff() {
        isRecording = false;
        System.out.println("Camera has STOPPED recording.");
    }

    @Override
    public String getStatus() {
        return "Camera" + (isRecording ? "RECORDING" : "OFF");
    }
}
