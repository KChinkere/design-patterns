package designpatterns.structural.proxy.example;

public class ProxyDatabase implements DatabaseAccess {
    private RealDatabaseAccess realDatabaseAccess;

    @Override
    public void fetchData() {
        if(realDatabaseAccess == null) {
            realDatabaseAccess = new RealDatabaseAccess();
        }
        realDatabaseAccess.fetchData();
    }
}
