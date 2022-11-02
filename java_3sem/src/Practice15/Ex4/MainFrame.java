package Practice15.Ex4;



import javax.swing.*;

public class MainFrame extends JFrame
{
    public MainFrame()
    {
        setBounds(100, 100, 265, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add( new App());
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new MainFrame();
    }
}