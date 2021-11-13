import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class pr10_04 extends JFrame{
    private JLabel la = new JLabel("Hello");

    pr10_04() {
        setTitle("Mouse 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.addMouseListener(new MyMouseListener());
        c.setLayout(null);
        la.setSize(50, 20);
        la.setLocation(30, 30);
        c.add(la);

        setSize(350, 150);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener{
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x, y);
        }
        public void mouseReleased(MouseEvent e) {}
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    }

    public static void main(String [] args) {
        new pr10_04();
    }
}
