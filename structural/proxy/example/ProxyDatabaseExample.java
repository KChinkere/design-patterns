package designpatterns.structural.proxy.example;

public class ProxyDatabaseExample {
    public static void main(String[] args) {
        DatabaseAccess dbAccess = new ProxyDatabase();
        System.out.println("Calling fetch data for the first time.");
        dbAccess.fetchData();

        System.out.println("Calling database again");
        dbAccess.fetchData();
    }
}
