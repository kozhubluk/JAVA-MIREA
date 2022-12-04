package Practice24;

public class TextDocument extends IDocument {
    protected void DoOpen() {
        System.out.println("Open (TextDocument)");
    }
    protected void DoNew() {
        System.out.println("Create new (TextDocument)");
    }
    protected void DoSave() {
        System.out.println("Save (TextDocument)");
    }
    protected void DoExit() {
        System.out.println("Exit (TextDocument)");
    }
}