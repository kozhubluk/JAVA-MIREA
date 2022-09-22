package Practice5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex1 {
    public static void main(String[] args) {
        final int[] first = {0};
        final int[] second = {0};
        JFrame frame = new JFrame("GAME"); // создание окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // реакция на закрытие по умолчанию
        frame.setSize(240, 240); // размер окна
        // кнопки
        JButton firstButton = new JButton("AC Milan");
        JButton secondButton = new JButton("Real Madrid");
        JPanel panel = new JPanel(); // создание панели
        panel.setBackground(Color.GRAY); // цвет фона

        // Надписи
        JLabel result = new JLabel("Result 0 X 0");
        JLabel lastScore = new JLabel("Last score: N/A");
        JLabel winner = new JLabel("Winner: DRAW");

        // слушатели событий
        ActionListener milanListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first[0]++;
                result.setText("Result: " + first[0] + " X " + second[0]);
                lastScore.setText("Last score: AC Milan");
                if (first[0] > second[0]) winner.setText("Winner: AC Milan");
                else if (first[0] < second[0]) winner.setText("Winner: Real Madrid");
                else winner.setText("Winner: DRAW");
            }
        };
        ActionListener madridListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                second[0]++;
                result.setText("Result: " + first[0] + " X " + second[0]);
                lastScore.setText("Last score: RealMadrid");
                if (first[0] > second[0]) winner.setText("Winner: AC Milan");
                else if (first[0] < second[0]) winner.setText("Winner: Real Madrid");
                else winner.setText("Winner: DRAW");
            }
        };

        firstButton.addActionListener(milanListener);
        secondButton.addActionListener(madridListener);

        panel.add(firstButton);
        panel.add(secondButton);
        panel.add(result);
        panel.add(lastScore);
        panel.add(winner);

        frame.getContentPane().add(panel);
        frame.setVisible(true); // делаем окно видимым
    }
}
