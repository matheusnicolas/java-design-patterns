package example.design.patterns.bridge;

import example.design.patterns.bridge.devices.Device;
import example.design.patterns.bridge.devices.Radio;
import example.design.patterns.bridge.devices.Tv;
import example.design.patterns.bridge.remotes.AdvancedRemote;
import example.design.patterns.bridge.remotes.BasicRemote;

public class Main {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
