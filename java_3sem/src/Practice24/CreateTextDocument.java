package Practice24;

public class CreateTextDocument extends ICreateDocument {
    public IDocument CreateNew() {
        return new TextDocument();
    }
    public IDocument CreateOpen() {
        return new TextDocument();
    }
}