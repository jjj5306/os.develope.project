import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex10_06 extends JFrame{
    public ex10_06() {
        setTitle("클릭 연습 용 응용프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(null);

        JLabel j=new JLabel("c");
        j.setBounds(100,100,10,10);
        j.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int x=(int)(Math.random()*c.getWidth());
                int y=(int)(Math.random()*c.getHeight());
                j.setLocation(x,y);
            }
        });

        c.add(j);

        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ex10_06();
    }
}
