package org.example.Devices;

public class TV implements IDevice{
    private int chanel;
    private int volume;
    private boolean isOn;

    public TV(){
        chanel = 10;
        volume = 50;
        isOn = false;
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
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getChanel() {
        return chanel;
    }

    @Override
    public void setChanel(int chanel) {
        this.chanel = chanel;
    }

    @Override
    public String toString() {
        String output = "TV:\n" +
                "isOn: " + isOn;

        if(isOn){
            output += "\nchanel: " + chanel + "\n" +
                        "volume: " + volume;
        }

        return output;

    }
}
