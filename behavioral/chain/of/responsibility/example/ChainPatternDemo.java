package designpatterns.behavioral.chain.of.responsibility.example;

public class ChainPatternDemo {
    public static void main(String[] args) {
        Logger chainOfLogger = getChainOfLoggers();

        System.out.println("Logging INFO logger message : ");
        chainOfLogger.logMessage(Logger.INFO, "This is informational message.");

        System.out.println("Logging DEBUG logger message : ");
        chainOfLogger.logMessage(Logger.DEBUG, "This is debug message.");

        System.out.println("Logging ERROR logger message : ");
        chainOfLogger.logMessage(Logger.ERROR, "This is error message");
    }

    private static Logger getChainOfLoggers() {
        var infoLogger = new InfoLogger(Logger.INFO);
        var debugLogger = new DebugLogger(Logger.DEBUG);
        var errorLogger = new ErrorLogger(Logger.ERROR);

        infoLogger.nextLogger(debugLogger);
        debugLogger.nextLogger(errorLogger);

        return infoLogger;
    }
}
