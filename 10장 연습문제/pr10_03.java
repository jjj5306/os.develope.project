import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class pr10_03 extends JFrame{
    pr10_03() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn= new JButton("Action");
        btn.addActionListener(new MyActionListener());
        c.add(btn);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("Action"))
                    b.setText("액션");
                else
                    b.setText("Action");
                setTitle(b.getText());
            }
        });

        setSize(350, 150);
        setVisible(true);
    }

    public static void main(String [] args) {
        new pr10_03();
    }
}
