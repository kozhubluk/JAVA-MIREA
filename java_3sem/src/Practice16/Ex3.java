package Practice16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ex3 extends JFrame {
    String truePass;
    JTextField jta1 = new JTextField(10); // текстовое поле
    JTextField jta2 = new JPasswordField(10); // текстовое поле
    JButton button = new JButton("Войти"); // кнопка

    // Конструктор Ex1
    Ex3() {
        super("Вход");
        truePass = "qwerty"; // верный пароль
        setLayout(new GridLayout(3,1, 10, 10));
        setSize(300, 150);
        // Добавляем текстовые поля
        add(new JLabel("логин"));
        add(jta1);
        add(new JLabel("пароль"));
        add(jta2);
        add(button, BorderLayout.PAGE_END);
        String message;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //добавляем слушателя к кнопке
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String entry = (String)jta2.getText();
                if (jta1.getText().isEmpty() || jta2.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Введите логин и пароль!", "Что-то пошло не так", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    if (entry.equals(truePass)) {
                        JOptionPane.showMessageDialog(null, "Пароль введен правильно!", "Успешно", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Неверный пароль!", "Что-то пошло не так", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });
        setVisible(true); // делаем видимым
    }


    public static void main(String[] args) {
        new Ex3();
    }
}
