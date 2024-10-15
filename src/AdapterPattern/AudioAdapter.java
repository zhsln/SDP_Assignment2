package AdapterPattern;

public class AudioAdapter implements AudioPlayer {
    private AdvancedAudioPlayer advancedAudioPlayer;

    public AudioAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("wav"))
            advancedAudioPlayer = new AdvancedAudioPlayer();
        else if (audioType.equalsIgnoreCase("aac"))
            advancedAudioPlayer = new AdvancedAudioPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        // For a case, if we put "wav" or "aac" audioType and a file that's not wav or aac.
        if (!fileName.endsWith("." + audioType)) {
            System.out.println("File extension does not match the audio type.");
            return;
        }

        if (audioType.equalsIgnoreCase("wav"))
            advancedAudioPlayer.playWAV(fileName);
        else if (audioType.equalsIgnoreCase("aac"))
            advancedAudioPlayer.playAAC(fileName);
    }
}
