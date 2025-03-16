package LivingRoom;
import Devices.SmartDevice;

public class SmartThermostat implements SmartDevice {
    private int temperature = 22; // Стандартная температура

    public void setTemperature(int temp) {
        if (temp >= 18 && temp <= 24) {
            temperature = temp;
            System.out.println("Thermostat set to " + temperature + "°C.");
        } else {
            System.out.println("Temperature out of range! Set between 18°C and 24°C.");
        }
    }

    @Override
    public void turnOn() {
        System.out.println("Thermostat  ON, current temperature: " + temperature + "°C.");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat  OFF.");
    }

    @Override
    public String getStatus() {
        return "Thermostat  set to " + temperature + "°C.";
    }
}

