package ProxyPattern;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {
    private List<VideoLecture> videoLectures = new ArrayList<>();

    public void addLecture(VideoLecture videoLecture) {
        videoLectures.add(videoLecture);
    }

    public void showLecturesInfo() {
        for (VideoLecture videoLecture : videoLectures)
            videoLecture.getInfo();
    }

    public void playLecture(int index) {
        if (index >= 0 && index < videoLectures.size())
            videoLectures.get(index).play();
        else
            System.out.println("Invalid lecture index.");
    }
}
