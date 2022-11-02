package Practice16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex2 extends JFrame {
    Font fontItems[] = {
            new Font("Times new roman", Font.BOLD, 20),
            new Font("MS Sans Serif", Font.BOLD, 20),
            new Font("Courier New", Font.BOLD, 20)
    };
    String[] colorList = {"black", "red", "blue"};
    String[] fontList = {"Times new roman", "MS Sans Serif", "Courier New"};
    JComboBox color = new JComboBox(colorList);
    JComboBox font = new JComboBox(fontList);
    JTextArea area = new JTextArea("Многострочное поле", 10, 10);
    public Ex2() {
        super("Задание 2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(300, 300);
        add(color);
        add(font);
        add(area);

        area.setLineWrap(true); // для переноса строк
        area.setWrapStyleWord(true);

        area.setFont(fontItems[0]); // шрифт по умолчанию

        color.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String item = (String) color.getSelectedItem();
                switch (item) {
                    case "black":
                        area.setForeground(Color.BLACK);
                        break;
                    case "red":
                        area.setForeground(Color.RED);
                        break;
                    case "blue":
                        area.setForeground(Color.BLUE);
                        break;
                }
            }
        });
        font.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String item = (String) font.getSelectedItem();
                switch (item) {
                    case "Times new roman":
                        area.setFont(fontItems[0]);
                        break;
                    case "MS Sans Serif":
                        area.setFont(fontItems[1]);
                        break;
                    case "Courier New":
                        area.setFont(fontItems[2]);
                        break;
                }
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        new Ex2();
    }
}
