import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex10_04  extends JFrame{
    JLabel label;
    String text = "Love Java";

    ex10_04(){
        setTitle("Left 키로 문자열 이동");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(new FlowLayout());

        JLabel j=new JLabel("Love Java");
        c.add(j);
        c.setFocusable(true);
        c.requestFocus();
        c.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_LEFT) {
                    String text=j.getText();
                    j.setText(text.substring(1)+text.charAt(0));
                }
            }
        });

        setSize(300,100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ex10_04();
    }
}
