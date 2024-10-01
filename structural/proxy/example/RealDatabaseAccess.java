package designpatterns.structural.proxy.example;

public class RealDatabaseAccess implements DatabaseAccess {
    private String data;

    public RealDatabaseAccess() {
        loadDataFromDatabase();
    }

    private void loadDataFromDatabase() {
        System.out.println("Fetching data from the database...");
        this.data = "Database Records";
    }

    @Override
    public void fetchData() {
        System.out.println("Data: " + data);
    }
}
