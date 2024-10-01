package designpatterns.behavioral.chain.of.responsibility.example;

public class InfoLogger extends Logger {


    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("INFO : " + message);
    }
}
