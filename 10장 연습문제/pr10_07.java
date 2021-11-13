import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class pr10_07 extends JFrame{
    private JLabel la = new JLabel();
    private Container c = getContentPane();

    public pr10_07() {
        setTitle("Key Code 예제: F1키:초록색, % 키노란색");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c.addKeyListener(new MyKeyListener());
        c.add(la);
        setSize(300,150);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }
    class MyKeyListener extends KeyAdapter{
        public void keyPressed(KeyEvent e) {
            la.setText(e.getKeyText(e.getKeyCode()));
            if(e.getKeyChar() == '%')
                c.setBackground(Color.YELLOW);
            else if(e.getKeyCode() == KeyEvent.VK_F1)
                c.setBackground(Color.GREEN);
        }
    }
    public static void main(String [] args) {
        new pr10_07();
    }
}