package org.example;

import org.example.Devices.IDevice;
import org.example.Devices.SmartLight;
import org.example.Devices.TV;
import org.example.Remotes.Remote;

public class Main {
    public static void main(String[] args) {
        IDevice device = new SmartLight();
        Remote remote = new Remote(device);

        System.out.println(device);

        remote.togglePower();

        System.out.println(device);

        remote.chanelUp();
        remote.chanelUp();
        remote.chanelUp();
        remote.chanelUp();

        System.out.println(device);
    }
}