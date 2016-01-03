import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

public class MyFrame extends JPanel {

    private Image tankImg;
    private final static String IMG_ADDR = "tank.png";

    public MyFrame(){
        JFrame frame = new JFrame("New Frame");
        frame.setLocation(300, 300);
        frame.setMinimumSize(new Dimension(500, 250));

        try {
            tankImg = ImageIO.read(new File(IMG_ADDR));
        } catch (IOException e) {
            e.printStackTrace();
        }

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
        g.drawImage(tankImg, 10, 110, new ImageObserver() {
            @Override
            public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
                return false;
            }
        });
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}
