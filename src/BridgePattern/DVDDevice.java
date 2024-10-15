package BridgePattern;

public class DVDDevice implements Device {
    @Override
    public void powerOn() {
        System.out.println("DVD device is ON.");
    }

    @Override
    public void powerOff() {
        System.out.println("DVD device is OFF.");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("DVD device channel is set to " + channel + ".");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("DVD device volume is set to " + volume + ".");
    }
}
