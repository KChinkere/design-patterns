package designpatterns.structural.facade.example;

public class HomeTheatreFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheatreFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie) {
        System.out.println("Getting ready to watch a movie...");
        dvdPlayer.on();
        projector.on();
        soundSystem.on();
        soundSystem.setVolume(20);
        dvdPlayer.playing(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down theatre...");
        dvdPlayer.off();
        projector.off();
        soundSystem.off();
    }
}
