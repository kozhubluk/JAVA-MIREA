package Practice15;

import javax.swing.*;
import java.awt.*;

public class Ex3 extends JFrame {
    // кнопки
    JButton btn1 = new JButton("button 1");
    JButton btn2 = new JButton("button 2");

    JTextField jta = new JTextField("this is area you can write text");

    JMenu fileMenu = new JMenu("File");
    JMenu editMenu = new JMenu("Edit");
    JMenu helpMenu = new JMenu("Help");
    JMenuBar mainMenuBar = new JMenuBar();
    JMenuItem save = new JMenuItem("Save");
    JMenuItem exit = new JMenuItem("Exit");
    JMenuItem copy = new JMenuItem("Copy");
    JMenuItem cut = new JMenuItem("Cut");
    JMenuItem paste = new JMenuItem("Paste");

    Ex3() {
        super("Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(200, 200);

        // добавляем основные элементы в окно

        add(mainMenuBar);
        mainMenuBar.add(fileMenu);
        fileMenu.add(save);
        fileMenu.add(exit);
        mainMenuBar.add(editMenu);
        editMenu.add(copy);
        editMenu.add(paste);
        editMenu.add(cut);
        mainMenuBar.add(helpMenu);
        add(btn1);
        add(btn2);
        add(jta);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex3();
    }
}