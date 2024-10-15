package ProxyPattern;

public class LearningPlatformApp {
    public static void main(String[] args) {
        OnlineCourse course = new OnlineCourse();

        course.addLecture(new ProxyVideoLecture("1. Introduction to Frontend"));
        course.addLecture(new ProxyVideoLecture("2. HTML."));
        course.addLecture(new ProxyVideoLecture("3. CSS"));

        course.showLecturesInfo();

        System.out.println("\nPlaying the first lecture:");
        course.playLecture(0);

        System.out.println("\nPlaying the second lecture:");
        course.playLecture(1);
    }
}
