package org.example.Remotes;

import org.example.Devices.IDevice;
import org.example.Devices.TV;

public class Remote {
    private IDevice device;

    public Remote(){
        device = new TV();
    }

    public Remote(IDevice device){
        this.device = device;
    }

    public void setDevice(IDevice device) {
        this.device = device;
    }

    public void togglePower(){
        if(device.getIsOn()){
            device.turnOff();
        }
        else {
            device.turnOn();
        }
    }

    public void volumeDown(){
        device.setVolume(device.getVolume() - 1);
    }

    public void volumeUp(){
        device.setVolume(device.getVolume() + 1);
    }

    public void chanelDown(){
        device.setChanel(device.getChanel() - 1);
    }

    public void chanelUp(){
        device.setChanel(device.getChanel() + 1);
    }

    public void setChanel(int chanel){
        device.setChanel(chanel);
    }
}
