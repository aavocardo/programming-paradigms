package GUI;

import javax.swing.*;
import java.awt.event.*;

public class ButtonListener implements ActionListener {
    private final JButton startButton, stopButton;
    public ButtonListener(JButton startButton, JButton stopButton) {
        this.startButton = startButton;
        this.stopButton = stopButton;
    }
    public void actionPerformed(ActionEvent evt) {
        Object actionSource = evt.getSource();
        if (actionSource == startButton) {
            System.out.println("Start button");
        } else if (actionSource == stopButton) {
            System.out.println("Stop button");
        }
    }
}