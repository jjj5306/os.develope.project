import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex10_02 extends JFrame{
    JPanel contentPane = new JPanel();
    ex10_02(){
        setTitle("드래깅동안 YELLO");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(contentPane);
        contentPane.setBackground(Color.GREEN);

        contentPane.addMouseMotionListener(new MyMouseMotionAdapter());

        contentPane.addMouseListener(new MyMouseAdapter2());
        setSize(400,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ex10_02();
    }

    class MyMouseMotionAdapter extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            // 마우스가 드래그되는 동안
            contentPane.setBackground(Color.YELLOW);
        }
    }

    class MyMouseAdapter2 extends MouseAdapter {
        public void mouseReleased(MouseEvent e) {
            contentPane.setBackground(Color.GREEN);
        }
    }
}