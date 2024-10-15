package BridgePattern;

public class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void powerButton() {
        System.out.println("Advanced Remote: Power button pressed.");
        device.powerOff();
    }

    @Override
    public void volumeUp() {
        System.out.println("Advanced Remote: Volume up button pressed.");
        device.setVolume(20);
    }

    @Override
    public void volumeDown() {
        System.out.println("Advanced Remote: Volume down button pressed.");
        device.setVolume(15);
    }

    @Override
    public void channelUp() {
        System.out.println("Advanced Remote: Channel up button pressed.");
        device.setChannel(2);
    }

    @Override
    public void channelDown() {
        System.out.println("Advanced Remote: Channel down button pressed.");
        device.setChannel(1);
    }

    public void mute() {
        System.out.println("Advanced Remote: Mute button pressed.");
        device.setVolume(0);
    }
}
