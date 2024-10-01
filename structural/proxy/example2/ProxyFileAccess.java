package designpatterns.structural.proxy.example2;

public class ProxyFileAccess implements FileAccess {
    private RealFileAccess realFileAccess;
    private Roles role;
    private String fileName;

    public ProxyFileAccess(Roles role, String fileName) {
        this.role = role;
        this.fileName = fileName;
    }

    @Override
    public void accessFile() {
        if(Roles.ADMIN == role) {
            realFileAccess = new RealFileAccess(fileName);
            realFileAccess.accessFile();
        } else {
            System.out.println("You donot have required roles to access file " + fileName);
        }
    }
}
