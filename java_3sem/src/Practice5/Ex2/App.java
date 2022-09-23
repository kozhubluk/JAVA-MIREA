package Practice5.Ex2;


import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

    JPanel bottomPanel = new JPanel(); // нижняя панель
    JComboBox shapesList = new JComboBox(new String[]{"Прмоугольник", "Круг"}); // комбобокс с выбором фигуры

    DrawPanel draw = new DrawPanel(); // верхняя панель, рисунки фигур

    public static void main(String args[]) {
        new App();
    }

    public App() {
        super("FiguresDrawer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(520, 420); // размер окна

        bottomPanel.add(shapesList);

        JButton addShapes = new JButton("Добавить выбранную фигуру"); // кнопка 1
        addShapes.addActionListener(e -> onAddClick());
        bottomPanel.add(addShapes);

        JButton addRandomShapes = new JButton("Добавить 20 фигур"); // кнопка 2
        addRandomShapes.addActionListener(e -> onAddShapesClick());
        bottomPanel.add(addRandomShapes);

        this.add(bottomPanel, BorderLayout.SOUTH);
        this.add(draw, BorderLayout.CENTER);

        setVisible(true);


    }
    private void onAddClick() {
        if (shapesList.getSelectedItem().toString() == "Круг") {
            draw.drawCircle();
        }
        else {
            draw.drawRect();
        }
        repaint();
    }
    private void onAddShapesClick() {
        draw.drawRandom();
        repaint();
    }
}
