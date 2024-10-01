package designpatterns.behavioral.chain.of.responsibility.example;

public class DebugLogger extends Logger {

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("DEBUG : " + message);
    }
}
