import javax.swing.*;

public class MyFrame extends JFrame {

    MyFrame(String title) {
        this.setTitle(title);
        this.setSize(800, 600);
        this.setLocation(300, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame("Window");
        frame.setVisible(true);
    }
}
