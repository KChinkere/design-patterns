package designpatterns.structural.composite.example;

public class CompositePatternExample {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("file1.txt");
        FileSystemComponent file2 = new File("file2.txt");

        Directory directory1 = new Directory("directory1");
        Directory directory2 = new Directory("directory2");
        directory1.add(file1);
        directory1.add(file2);
        FileSystemComponent file3 = new File("file3.txt");

        directory2.add(file3);
        directory2.add(directory1);


        directory2.showDetails();
    }
}
