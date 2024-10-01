package designpatterns.behavioral.momento.example;

public class MomentoPatternDemo {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextEditorHistory textEditorHistory = new TextEditorHistory();

        textEditor.type("Hello, ");
        textEditorHistory.save(textEditor.save());

        textEditor.type("world! ");
        textEditorHistory.save(textEditor.save());

        System.out.println("Current Text: " + textEditor.getText());

        textEditor.restore(textEditorHistory.undo());
        System.out.println("After undo: " + textEditor.getText());

        textEditor.restore(textEditorHistory.redo());
        System.out.println("After redo: " + textEditor.getText());
    }
}
