package designpatterns.structural.proxy.example2;

public class ProxyPatternExample {
    public static void main(String[] args) {
        FileAccess fileAccess = new ProxyFileAccess(Roles.ADMIN, "text.txt");
        fileAccess.accessFile();

        FileAccess fileAccess1 = new ProxyFileAccess(Roles.USER, "text.txt");
        fileAccess1.accessFile();
    }
}
