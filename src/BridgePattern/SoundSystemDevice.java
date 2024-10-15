package BridgePattern;

public class SoundSystemDevice implements Device {
    @Override
    public void powerOn() {
        System.out.println("Sound System is ON.");
    }

    @Override
    public void powerOff() {
        System.out.println("Sound System is OFF.");
    }

    @Override
    public void setChannel(int channel) {
        //Don't think that it should work with channels...
        System.out.println("Sound System channel is set to " + channel + ".");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Sound System volume set to " + volume + ".");
    }
}
