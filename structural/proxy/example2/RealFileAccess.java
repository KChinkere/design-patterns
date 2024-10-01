package designpatterns.structural.proxy.example2;

public class RealFileAccess implements FileAccess {
    private String name;

    public RealFileAccess(String name) {
        this.name = name;
    }

    @Override
    public void accessFile() {
        System.out.println("Accessing file:: " + name);
    }
}
