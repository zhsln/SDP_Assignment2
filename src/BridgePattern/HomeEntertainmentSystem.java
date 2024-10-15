package BridgePattern;

public class HomeEntertainmentSystem {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        RemoteControl basicRemote = new BasicRemote(tv);
        basicRemote.powerButton();
        basicRemote.volumeUp();
        basicRemote.channelUp();

        Device dvd = new DVDDevice();
        AdvancedRemote advancedRemote = new AdvancedRemote(dvd);
        advancedRemote.powerButton();
        advancedRemote.volumeUp();
        advancedRemote.mute();
    }
}
