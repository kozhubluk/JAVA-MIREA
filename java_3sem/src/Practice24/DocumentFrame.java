package Practice24;

import javax.swing.*;

public class DocumentFrame extends JFrame { // Каркас оперирует одним экземпляром IDocument и одним
                                            // экземпляром ICreateDocument
    private IDocument document;
    private ICreateDocument createDocument;
    private JMenuBar menu;
    private JMenu fileMenu;
    private JMenuItem newMenuItem;
    private JMenuItem openMenuItem;
    private JMenuItem saveMenuItem;
    private JMenuItem exitMenuItem;
    private JMenuItem editMenuItem;
    private JMenuItem viewMenuItem;
    private JMenuItem helpMenuItem;


    public DocumentFrame() {
        menu = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenuItem = new JMenuItem("Edit");
        newMenuItem = new JMenuItem("New");
        openMenuItem = new JMenuItem("Open");
        saveMenuItem = new JMenuItem("Save");
        exitMenuItem = new JMenuItem("Exit");
        viewMenuItem = new JMenuItem("View");
        helpMenuItem = new JMenuItem("Help");

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);
        menu.add(fileMenu);
        menu.add(editMenuItem);
        menu.add(viewMenuItem);
        menu.add(helpMenuItem);
        setJMenuBar(menu);
    }

    public void getDocument(ICreateDocument createDoc) {
        createDocument = createDoc;
    }

    public void functional() {
        newMenuItem.addActionListener(e -> {
            document = createDocument.CreateNew();
            document.DoNew();
        });
        openMenuItem.addActionListener(e -> {
            document = createDocument.CreateOpen();
            document.DoOpen();
        });
        saveMenuItem.addActionListener(e -> {
            document.DoSave();
        });
        exitMenuItem.addActionListener(e -> {
            document.DoExit();
            System.exit(0);
        });
    }

    public static void main(String[] args) {
        // продемонстрировать работу каркаса на примере текстового док-а
        DocumentFrame docFrame = new DocumentFrame();
        docFrame.getDocument(new CreateTextDocument()); // текстовый документ
        docFrame.functional();
        docFrame.setSize(200, 200);
        docFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        docFrame.setVisible(true);
    }
}