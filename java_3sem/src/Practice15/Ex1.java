package Practice15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex1 extends JFrame {
    JTextField jta1 = new JTextField(10); // текстовое поле
    JTextField jta2 = new JTextField(10); // текстовое поле
    JButton button = new JButton("+"); // кнопки
    JButton button1 = new JButton("*");
    JButton button2 = new JButton("/");
    JButton button3 = new JButton("-");
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    // Конструктор Ex1
    Ex1() {
        super("Calculator");
        setLayout(new FlowLayout());
        setSize(450, 150);
        // Добавляем текстовые поля
        add(new JLabel("1st Number"));
        add(jta1);
        add(new JLabel("2nd Number"));
        add(jta2);

        // Добавляем кнопки
        add(button);
        add(button1);
        add(button2);
        add(button3);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //добавляем слушателей к кнопкам
        button.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 * x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 / x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 - x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true); // делаем видимым
    }


    public static void main(String[] args) {
        new Ex1();
    }
}
