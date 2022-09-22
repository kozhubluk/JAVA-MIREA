package Practice5;

import javax.swing.*;

public class Ex1 {
    public static void main(String[] args) {
        int first, second; // счет 1ой и 2ой команд
        JFrame frame = new JFrame("GAME");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(240, 240);
        JButton firstButton = new JButton("AC Milan");
        JButton secondButton = new JButton("Real Madrid");
        JPanel panel = new JPanel();
        panel.add(firstButton);
        panel.add(secondButton);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

}
