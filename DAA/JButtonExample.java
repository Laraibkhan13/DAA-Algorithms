import javax.swing.*;
import java.awt.event.*;
public class JButtonExample
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("ActionListener Example");
        JButton btn = new JButton("JAIN");
        btn.setBounds(70,80,100,50);
        //Change button text on click
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                btn.setText("WELCOME TO CSE");
            }
        });
        frame.add(btn);
        frame.setSize(250,250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}