package Decorators;

import Devices.SmartDevice;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduledOperationDecorator implements SmartDevice {
    private SmartDevice device;
    private int scheduledHour;
    private boolean isOn = false;

    public ScheduledOperationDecorator(SmartDevice device, int scheduledHour) {
        this.device = device;
        this.scheduledHour = scheduledHour;
        scheduleOperation();
    }

    private void scheduleOperation() {
        Timer timer = new Timer(true);
        long delay = calculateDelay();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                device.turnOn();
                isOn = true;
                System.out.println(device.getClass().getSimpleName() + " turned ON at " + scheduledHour + ":00.");
            }
        }, delay);
    }

    private long calculateDelay() {
        int currentHour = LocalTime.now().getHour();
        int hoursUntilStart = (scheduledHour - currentHour + 24) % 24;
        return hoursUntilStart * 3600 * 1000; // Переводим часы в миллисекунды
    }

    @Override
    public void turnOn() {
        device.turnOn();
        isOn = true;
    }

    @Override
    public void turnOff() {
        device.turnOff();
        isOn = false;
    }

    @Override
    public String getStatus() {
        return device.getStatus() + " (Scheduled for " + scheduledHour + ":00)";
    }
}

