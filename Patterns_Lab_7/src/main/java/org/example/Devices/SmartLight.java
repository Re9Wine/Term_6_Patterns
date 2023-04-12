package org.example.Devices;

public class SmartLight implements IDevice{
    private boolean isOn;

    public SmartLight(){
        isOn = true;
    }

    @Override
    public boolean getIsOn() {
        return isOn;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public int getVolume() {
        return 0;
    }

    @Override
    public void setVolume(int volume) {

    }

    @Override
    public int getChanel() {
        return 0;
    }

    @Override
    public void setChanel(int chanel) {

    }

    @Override
    public String toString() {
        return "SmartLight:\n" +
                "isOn: " + isOn;
    }
}
