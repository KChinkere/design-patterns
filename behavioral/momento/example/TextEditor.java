package designpatterns.behavioral.momento.example;

public class TextEditor {

    private StringBuilder currentText;

    public TextEditor() {
        this.currentText = new StringBuilder();
    }

    public void type(String text) {
        this.currentText.append(text);
    }

    public TextMomento save() {
        return new TextMomento(this.currentText.toString());
    }

    public void restore(TextMomento textMomento) {
        currentText = new StringBuilder(textMomento.getText());
    }

    public String getText() {
        return currentText.toString();
    }

}
