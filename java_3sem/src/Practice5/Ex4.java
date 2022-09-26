package Practice5;

import javax.swing.*;

public class Ex4 extends JFrame {
    public static void main(String[] args) {
        new Ex4();
    }
    public Ex4() {
        this.setTitle("Animation");
        this.setSize(620, 640);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(getClass().getResource("cat.gif")));
        this.add(label);
        this.setVisible(true);
    }
}
