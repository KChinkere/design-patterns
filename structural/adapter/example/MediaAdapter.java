package designpatterns.structural.adapter.example;

public class MediaAdapter implements MediaPlayer {
    private VideoPlayer videoPlayer;

    public MediaAdapter(MediaType mediaType) {
        if(MediaType.MP4 == mediaType) {
            this.videoPlayer = new VideoPlayer();
        }
    }

    @Override
    public void play(MediaType mediaType, String fileName) {
        if(MediaType.MP4 == mediaType) {
            this.videoPlayer.playVideo(mediaType, fileName);
        } else {
            System.out.println("Invalid media type :: " + mediaType + ". Only MP4 is supported.");
        }
    }
}
