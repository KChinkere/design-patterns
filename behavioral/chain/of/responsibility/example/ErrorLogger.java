package designpatterns.behavioral.chain.of.responsibility.example;

public class ErrorLogger extends Logger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("Error : " + message);
    }
}
