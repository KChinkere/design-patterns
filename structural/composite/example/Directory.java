package designpatterns.structural.composite.example;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent fileSystemComponent) {
        components.add(fileSystemComponent);
    }

    public void remove(FileSystemComponent fileSystemComponent) {
        components.remove(fileSystemComponent);
    }

    @Override
    public void showDetails() {
        System.out.println("Showing file details of directory " + name);
        components.forEach(FileSystemComponent::showDetails);
    }
}
