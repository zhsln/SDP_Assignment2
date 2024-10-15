package ProxyPattern;

public class RealVideoLecture implements VideoLecture {
    private String videoTitle;

    public RealVideoLecture(String videoTitle) {
        this.videoTitle = videoTitle;
        loadVideo();
    }

    private void loadVideo() {
        System.out.println("Loading video: " + videoTitle);
    }

    @Override
    public void getInfo() {
        System.out.println("Video Title: " + videoTitle);
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + videoTitle);
    }
}
