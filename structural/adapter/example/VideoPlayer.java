package designpatterns.structural.adapter.example;

public class VideoPlayer {
    public void playVideo(MediaType mediaType, String fileName) {
        System.out.println("Playing video file. Type : " + mediaType + " file name: " + fileName);
    }
}
