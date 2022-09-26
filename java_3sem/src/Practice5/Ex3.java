package Practice5;

import javax.swing.*;

public class Ex3 extends JFrame {
    public static void main(String[] args) {
        if (args.length < 1) System.out.println("Error");
        else new Ex3(args[0]);
    }
    public Ex3(String path) {
        this.setTitle("Image");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(getClass().getResource(path)));
        this.add(label);
        this.setVisible(true);
    }
}
