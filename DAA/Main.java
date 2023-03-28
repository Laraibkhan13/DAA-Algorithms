
import java.awt.*;
import java .awt.event.*;
public class Main
{
    public static void main(String []args)
    {
        Frame f=new Frame("calculator");
        TextField tf1=new TextField();
        tf1.setBounds(100,50,85,20);
        TextField tf2=new TextField();
        tf2.setBounds(100,100,85,20);
        Label l1=new Label();
        l1.setBounds(100,120,100,20);
        Button b=new Button("ADD");
        b.setBounds(110,120,50,50);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(tf1.getText());
                int b=Integer.parseInt(tf2.getText());
                int c=a+b;
                l1.setText("Their sum is= "+String.valueOf(c));
            }
        });
        f.add(tf1);
        f.add(tf2);
        f.add(l1);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);

    }
}