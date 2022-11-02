package Practice15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex2 extends JFrame {
    String[] items = {
            "Австралия",
            "Китай",
            "Россия",
            "Англия"
    };
    String[] itemsDescription = {
            "Австралия – это страна, занимающая одноименный материк, который омывается Индийским и Тихим океанами.",
            "Китай – густонаселенная страна в Восточной Азии с разнообразными ландшафтами и рельефом. Здесь можно найти луга, пустыни, горы, озера, реки и побережья протяженностью более 14 тыс. км.",
            "Россия — государство в Восточной Европе и Северной Азии.",
            "Англия, родина Шекспира и группы The Beatles, входит в состав Соединенного Королевства Великобритании и Северной Ирландии. Она расположена на Британских островах и граничит с Шотландией и Уэльсом."
    };
    JButton button = new JButton("Показать информацию о стране"); // кнопка
    JComboBox Country = new JComboBox(items);

    public Ex2() {
        super("Страны");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(450, 150);
        add(Country); // добавляем комбобокс
        add(button);
        setVisible(true); // делаем видимым
        //jComboBox1.getSelectedItem()
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                  String item = (String)Country.getSelectedItem();
                switch (item) {
                    case "Австралия":
                        JOptionPane.showMessageDialog(null, itemsDescription[0], "Alert", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "Китай":
                        JOptionPane.showMessageDialog(null, itemsDescription[1], "Alert", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "Россия":
                        JOptionPane.showMessageDialog(null, itemsDescription[2], "Alert", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "Англия":
                        JOptionPane.showMessageDialog(null, itemsDescription[3], "Alert", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            }
        });
    }
    public static void main(String[] args) {
        new Ex2();
    }
}
