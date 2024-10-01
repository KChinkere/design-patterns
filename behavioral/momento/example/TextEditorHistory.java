package designpatterns.behavioral.momento.example;

import java.util.Stack;

public class TextEditorHistory {
    private Stack<TextMomento> undoStack = new Stack<>();
    private Stack<TextMomento> redoStack = new Stack<>();

    public void save(TextMomento textMomento) {
        undoStack.push(textMomento);
        redoStack.clear();
    }

    public TextMomento undo() {
        if(!undoStack.isEmpty()) {
            redoStack.push(undoStack.pop());
            if(!undoStack.isEmpty()) {
                return undoStack.peek();
            }
        }
        return null;
    }

    public TextMomento redo() {
        if(!redoStack.isEmpty()) {
            TextMomento textMomento = redoStack.pop();
            undoStack.push(textMomento);
            return textMomento;
        }

        return null;
    }
}
