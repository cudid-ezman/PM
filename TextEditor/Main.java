package TextEditor;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.write("Hadid ");
        editor.write("Ganteng");

        editor.show(); 

        editor.undo();
        editor.show(); 

        editor.redo();
        editor.show();

        editor.undo();
        editor.show();

        editor.undo();
        editor.show();

        editor.undo();

        editor.redo();
        editor.show();
    }
}