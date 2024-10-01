package designpatterns.structural.facade.example;

public class FacadePatternExample {
    public static void main(String[] args) {
        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(new DVDPlayer(), new Projector(), new SoundSystem());
        homeTheatreFacade.watchMovie("Fantastic Four");
        homeTheatreFacade.endMovie();
    }
}
