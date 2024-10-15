package BridgePattern;

public class BasicRemote extends RemoteControl {

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void powerButton() {
        System.out.println("Basic Remote: Power button pressed.");
        device.powerOn();
    }

    @Override
    public void volumeUp() {
        System.out.println("Basic Remote: Volume up button pressed.");
        device.setVolume(10);
    }

    @Override
    public void volumeDown() {
        System.out.println("Basic Remote: Volume down button pressed.");
        device.setVolume(5);
    }

    @Override
    public void channelUp() {
        System.out.println("Basic Remote: Channel up button pressed.");
        device.setChannel(1);
    }

    @Override
    public void channelDown() {
        System.out.println("Basic Remote: Channel down button pressed.");
        device.setChannel(0);
    }
}
