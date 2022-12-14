package Practice30;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainFrame extends JFrame {



    Order currentInternetOrder = new InternetOrder();

    TableOrder currentTableOrder = new TableOrder();
    TableOrdersManager tm = new TableOrdersManager();
    InternetOrdersManager im = new InternetOrdersManager();
    int SelectedTable = -1;


    MainFrame(){
        super("Заказ");


        setSize(new Dimension(720,480));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(3,3));

        JTextArea currentOrderText = new JTextArea("Заказ: ");
        currentOrderText.setEditable(false);

        JTextArea allOrdersText = new JTextArea("Количество интернет-заказов: ");
        JTextArea allOrdersText2 = new JTextArea("Количество заказов в ресторане: ");
        allOrdersText2.setEditable(false);

        Map<String,Dish> dishesForOrder = new HashMap<>();
        dishesForOrder.put("Цезарь", new Dish(500, "Цезарь", "Описание 1"));
        dishesForOrder.put("Пельмени", new Dish(200,"Пельмени", "Описание 2"));
        dishesForOrder.put("Хачапури", new Dish(300,"Хачапури", "Описание 3"));

        Map<String, Drink> drinksForOrder = new HashMap<>();
        drinksForOrder.put("Чай черный", new Drink(500,"Черный чай", "Описание 4",0,  DrinkTypeEnum.BLACK_TEA));
        drinksForOrder.put("Святой источник", new Drink(400,"Святой источни", "Описание 5", 0,  DrinkTypeEnum.WATER));
        drinksForOrder.put("Липтон лимон", new Drink(300,"Липтон лимон", "Описание 6", 0,  DrinkTypeEnum.GREEN_TEA));

        JComboBox dishesOrderComboBox = new JComboBox(dishesForOrder.keySet().toArray());
        dishesOrderComboBox.setMaximumSize(new Dimension(200,200));
        dishesOrderComboBox.setBackground(Color.white);

        JComboBox drinksOrderComboBox = new JComboBox(drinksForOrder.keySet().toArray());
        drinksOrderComboBox.setMaximumSize(new Dimension(200,200));
        drinksOrderComboBox.setBackground(Color.white);

        JButton btnCreateOrder = new JButton("Добавить заказ");

        // выбор заказа
        JRadioButton btnInternetOrder = new JRadioButton("Интернет заказ");
        btnInternetOrder.setSelected(true);
        JRadioButton btnTableOrder = new JRadioButton("Заказ в ресторане");
        btnTableOrder.setSelected(false);
        ButtonGroup chooseType = new ButtonGroup();
        chooseType.add(btnTableOrder);
        chooseType.add(btnInternetOrder);

        JComboBox tables = new JComboBox(Arrays.toString(tm.freeTableNumbers()).split("[\\[\\]]")[1].split(", "));
        tables.setVisible(false);
        tables.setBackground(Color.white);

        add(btnInternetOrder);
        add(btnTableOrder);
        add(tables);
        add(dishesOrderComboBox);
        add(drinksOrderComboBox);
        add(currentOrderText);
        add(btnCreateOrder);
        add(allOrdersText);
        add(allOrdersText2);

        btnCreateOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btnInternetOrder.isSelected()){
                    if (currentInternetOrder.itemsQuantity() == 0) return;
                    im.addOrder(currentInternetOrder);
                    allOrdersText2.setText("Количество интернет-заказов: "+Integer.toString(im.ordersQuantity()));
                    currentInternetOrder = new InternetOrder();
                }
                if (btnTableOrder.isSelected()){
                    if (currentTableOrder.itemsQuantity() == 0) return;
                    tm.add(currentTableOrder, Integer.parseInt(String.valueOf(tables.getSelectedItem())));
                    allOrdersText.setText("Количество заказов в ресторане: "+Integer.toString(tm.ordersQuantity()));
                    currentTableOrder = new TableOrder();
                }
                currentOrderText.setText("Заказ:\n");
            }
        });



        tables.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String option = (String) ((JComboBox) e.getSource()).getSelectedItem();
                SelectedTable = Integer.parseInt(option );
            }
        });
        btnTableOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tables.setVisible(true);
                currentInternetOrder = new InternetOrder();
                currentOrderText.setText("Заказ: ");
                currentOrderText.setText("Заказ: ");
            }
        });

        btnInternetOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tables.setVisible(false);
                currentTableOrder = new TableOrder();
                currentOrderText.setText("Заказ: ");
            }
        });

        dishesOrderComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String option = ((JComboBox)e.getSource()).getSelectedItem().toString();
                if (btnTableOrder.isSelected())
                    currentTableOrder.add(dishesForOrder.get(option));
                else
                    currentInternetOrder.add(dishesForOrder.get(option));

                currentOrderText.append("\n" + dishesForOrder.get(option).getInfo() + "\n");
            }
        });

        drinksOrderComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String option = ((JComboBox)e.getSource()).getSelectedItem().toString();
                if (btnTableOrder.isSelected())
                    currentTableOrder.add(drinksForOrder.get(option));
                else
                    currentInternetOrder.add(drinksForOrder.get(option));

                currentOrderText.append("\n" + drinksForOrder.get(option).getInfo() + "\n");
            }
        });



    }

    public static void main(String[] args) {
        new MainFrame().setVisible(true);
    }


}