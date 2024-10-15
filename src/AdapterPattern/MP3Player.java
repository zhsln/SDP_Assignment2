package AdapterPattern;

public class MP3Player implements AudioPlayer {
    @Override
    public void play(String audioType, String fileName) {
        // For a case, if we put "mp3" audioType and file that's not MP3.
        if (!fileName.endsWith("." + audioType)) {
            System.out.println("File extension does not match the audio type.");
            return;
        }

        if (audioType.equalsIgnoreCase("mp3"))
            System.out.println("Playing mp3 file: " + fileName);
        else
            System.out.println("MP3 format supported only.");
    }
}
