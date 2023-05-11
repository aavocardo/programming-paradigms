package GUI;

import java.awt.*;
import javax.swing.*;

public class ButtonDemo extends JFrame {
    protected JButton startButton, stopButton;
    public ButtonDemo() {
        super("Button demo");
        setSize(400, 200);
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        contentPane.add(startButton);
        contentPane.add(stopButton);

        ButtonListener myButtonListener = new ButtonListener(startButton, stopButton);
        startButton.addActionListener(myButtonListener);
        stopButton.addActionListener(myButtonListener);
    }
    public static void main(String [] args){
        ButtonDemo bd = new ButtonDemo();
        bd.setVisible(true);
    }
}