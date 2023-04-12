package org.example.Devices;

public interface IDevice {
    boolean getIsOn();
    void turnOn();
    void turnOff();
    int getVolume();
    void setVolume(int volume);
    int getChanel();
    void setChanel(int chanel);
}
