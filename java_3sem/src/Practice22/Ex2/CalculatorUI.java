package Practice22.Ex2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CalculatorUI extends JFrame {
    JTextField text;
    ArrayList<JButton> buttons = new ArrayList<>(0); // кнопки

    CalculatorUI() {
        super("Калькулятор");
        text = new JTextField();
        JPanel textPanel = new JPanel();
        text.setPreferredSize(new Dimension(250, 20));
        textPanel.add(text);

        ButtonClick buttonClick = new ButtonClick();
        buttons.add(new JButton("7"));
        buttons.add(new JButton("8"));
        buttons.add(new JButton("9"));
        buttons.add(new JButton("/"));
        buttons.add(new JButton("4"));
        buttons.add(new JButton("5"));
        buttons.add(new JButton("6"));
        buttons.add(new JButton("*"));
        buttons.add(new JButton("1"));
        buttons.add(new JButton("2"));
        buttons.add(new JButton("3"));
        buttons.add(new JButton("-"));
        buttons.add(new JButton("0"));
        buttons.add(new JButton("."));
        buttons.add(new JButton("="));
        buttons.add(new JButton("+"));

        JPanel btnsPanel = new JPanel();
        btnsPanel.setLayout(new GridLayout(4,4));
        for(int i = 0; i < buttons.size(); i++) {
            buttons.get(i).addActionListener(buttonClick);
            btnsPanel.add(buttons.get(i));
        }

        JButton space = new JButton("Пробел");
        JButton clear = new JButton("Очистить");
        JButton backspace = new JButton("Удалить");
        space.addActionListener(buttonClick);
        clear.addActionListener(buttonClick);
        backspace.addActionListener(buttonClick);
        JPanel downPanel = new JPanel();
        downPanel.setLayout(new GridLayout(1, 3));
        downPanel.add(space);
        downPanel.add(clear);
        downPanel.add(backspace);


        setLayout(new BorderLayout());
        add(textPanel, BorderLayout.NORTH);
        add(btnsPanel, BorderLayout.CENTER);
        add(downPanel, BorderLayout.SOUTH);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    class ButtonClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("Удалить")) {
                if (!text.getText().isEmpty()) text.setText(text.getText().substring(0, text.getText().length() - 1));
            }
            else if(e.getActionCommand().equals("Пробел")) {
                text.setText(text.getText() + " ");
            } else if (e.getActionCommand().equals("Очистить")) {
                try {
                    text.setText("");
                } catch (StringIndexOutOfBoundsException exception) {
                    text.setText("");
                }
            } else if (e.getActionCommand().equals("=")) {
                text.setText(Calculator.calculate(text.getText()));
            }
            else {
                text.setText(text.getText() + e.getActionCommand());
            }
        }
    }
}