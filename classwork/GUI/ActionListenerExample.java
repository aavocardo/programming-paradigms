package GUI;

import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample implements ActionListener {
    TextField tf;
    Button b, b2;
        public static void main(String[] args) {
            ActionListenerExample ai = new ActionListenerExample();
            Frame f=new Frame("ActionListener Example");
            ai.tf=new TextField();
            ai.tf.setBounds(50,50, 150,20);
            ai.b=new Button("Click Here");
            ai.b.setBounds(100,100,150,30);
            ai.b.addActionListener(ai);


            ai.b2 = new Button("Click this too");
            ai.b2.setBounds(100, 50, 150, 30);
            ai.b2.addActionListener(ai);

            f.add(ai.b);
            f.add(ai.b2);
            f.add(ai.tf);
            f.setSize(400,400);
            f.setLayout(null);
            f.setVisible(true);
        }
        public void actionPerformed(ActionEvent e){
            if (e.getSource().equals(b)){
                this.tf.setText("Welcome to Javatpoint.");
            }else if(e.getSource().equals(b2)){this.tf.setText("b2");}


        }
    }