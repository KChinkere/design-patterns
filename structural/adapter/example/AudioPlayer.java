package designpatterns.structural.adapter.example;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(MediaType mediaType, String fileName) {
        if(MediaType.MP3 == mediaType) {
            System.out.println("Playing mp3 file. File name" + fileName);
        } else if(MediaType.MP4 == mediaType) {
            mediaAdapter = new MediaAdapter(mediaType);
            mediaAdapter.play(mediaType, fileName);
        } else {
            System.out.println("Invalid media type. " + mediaType + ". Only MP3 and MP4 are allowed.");
        }
    }
}
