import javax.swing.*;
import java.awt.*;

public class MyFrame extends JPanel {

    public MyFrame(){
        JFrame frame = new JFrame("New Frame");
        frame.setLocation(300, 300);
        frame.setMinimumSize(new Dimension(500, 250));
        frame.add(this);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.drawOval(100, 50, 100, 100);
        g.setColor(Color.RED);
        g.drawOval(170, 50, 100, 100);
        g.setColor(Color.BLACK);
        g.drawOval(240, 50, 100, 100);
        g.setColor(Color.YELLOW);
        g.drawOval(130, 100, 100, 100);
        g.setColor(Color.BLUE);
        g.drawOval(200, 100, 100, 100);
        g.setFont(new Font("Serif", Font.BOLD, 16));
        g.setColor(Color.GREEN);
        g.drawString("Circle", 100, 100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();

    }
}
