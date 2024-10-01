package designpatterns.structural.adapter.example;

public class AdapterPatternExample {
    public static void main(String[] args) {

        MediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.play(MediaType.MP3, "hosanna.mp3");
        mediaPlayer.play(MediaType.MP4, "Ghajini.mp4");
        mediaPlayer.play(MediaType.AVI, "Ghajini.avi");

    }
}
