package Practice15.Ex4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JPanel {
    JTextField txt1 = null;
    double res = 0;
    double res1 = 0;
    String op = "";

    public App()
    {
        try
        {
            setLayout(null);

            // Расположение элементов
            final TextField txt1 = new TextField();
            txt1.setBounds(10, 10, 235, 30);

            JButton b0 = new JButton("0");
            b0.setBounds(10, 270, 50, 50);

            JButton b1 = new JButton("1");
            b1.setBounds(10, 190, 50, 50);

            JButton b2 = new JButton("2");
            b2.setBounds(60, 190, 50, 50);

            JButton b3 = new JButton("3");
            b3.setBounds(110, 190, 50, 50);

            JButton b4 = new JButton("4");
            b4.setBounds(10, 110, 50, 50);

            JButton b5 = new JButton("5");
            b5.setBounds(60, 110, 50, 50);

            JButton b6 = new JButton("6");
            b6.setBounds(110, 110, 50, 50);

            JButton b7 = new JButton("7");
            b7.setBounds(10, 40, 50, 50);

            JButton b8 = new JButton("8");
            b8.setBounds(60, 40, 50, 50);

            JButton b9 = new JButton("9");
            b9.setBounds(110, 40, 50, 50);

            JButton bRes = new JButton("=");
            bRes.setBounds(110, 270, 50, 50);

            JButton bPoint = new JButton(".");
            bPoint.setBounds(60, 270, 50, 50);

            JButton bPlus = new JButton("+");
            bPlus.setBounds(160, 40, 50, 50);

            JButton bMinus = new JButton("-");
            bMinus.setBounds(160, 110, 50, 50);

            JButton bMulti = new JButton("*");
            bMulti.setBounds(160, 190, 50, 50);

            JButton bDivision = new JButton("/");
            bDivision.setBounds(160, 270, 50, 50);

            // добавляем кнопки
            add(txt1);
            add(b0);
            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            add(b7);
            add(b8);
            add(b9);
            add(bRes);
            add(bPoint);
            add(bPlus);
            add(bMinus);
            add(bMulti);
            add(bDivision);

            // при нажатии кнопок в textarea добавляются числа

            b1.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 1);
                    double temp = Double.parseDouble(txt1.getText().trim());
                    if (res==0) res = temp;
                    else res1 = temp;
                }
            });

            b2.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 2);
                    double temp = Double.parseDouble(txt1.getText().trim());
                    if (res==0) res = temp;
                    else res1 = temp;
                }
            });

            b3.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 3);
                    double temp = Double.parseDouble(txt1.getText().trim());
                    if (res==0) res = temp;
                    else res1 = temp;
                }
            });

            b4.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 4);
                    double temp = Double.parseDouble(txt1.getText().trim());
                    if (res==0) res = temp;
                    else res1 = temp;
                }
            });

            b5.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 5);
                    double temp = Double.parseDouble(txt1.getText().trim());
                    if (res==0) res = temp;
                    else res1 = temp;
                }
            });

            b6.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 6);
                    double temp = Double.parseDouble(txt1.getText().trim());
                    if (res==0) res = temp;
                    else res1 = temp;
                }
            });

            b7.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 7);
                    double temp = Double.parseDouble(txt1.getText().trim());
                    if (res==0) res = temp;
                    else res1 = temp;
                }
            });

            b8.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 8);
                    double temp = Double.parseDouble(txt1.getText().trim());
                    if (res==0) res = temp;
                    else res1 = temp;
                }
            });

            b9.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 9);
                    double temp = Double.parseDouble(txt1.getText().trim());
                    if (res==0) res = temp;
                    else res1 = temp;
                }
            });

            bPoint.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    if ((!(txt1.getText().contains(".")))&&(!(txt1.getText().isEmpty()))) txt1.setText(txt1.getText() + "."); // невозможно добавить несколько разделителей
                }
            });

            b0.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 0);
                    double temp = Double.parseDouble(txt1.getText().trim());
                    if (res==0) res = temp;
                    else res1 = temp;
                }
            });

            bPlus.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Double.parseDouble(txt1.getText());
                    txt1.setText("");
                    op = "+";
                }
            });

            bMinus.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Double.parseDouble(txt1.getText());
                    txt1.setText("");
                    op = "-";
                }
            });

            bMulti.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Double.parseDouble(txt1.getText());
                    txt1.setText("");
                    op = "*";
                }
            });

            bDivision.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Double.parseDouble(txt1.getText());
                    txt1.setText("");
                    op = "/";
                }
            });

            bRes.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg0)
                {
                    System.out.println(res + " " + op + " " + res1);
                    double num = res;
                    double num1 = res1;
                    String strOp = op;
                    methodCalc mc = new methodCalc();
                    String strRes = String.valueOf(mc.calc(num, strOp, num1));
                    txt1.setText(strRes);
                }
            });
        }
        catch (ArithmeticException exception)
        {
        }
    }
}