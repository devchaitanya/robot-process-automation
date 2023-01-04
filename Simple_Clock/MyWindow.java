package Simple_Clock;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyWindow extends JFrame {
    private JLabel heading;
    private JLabel clockLabel;

    private Font font = new Font("",Font.BOLD,35);
    MyWindow(){
        super.setTitle("My Clock");//title of the window
        super.setSize(400,400);//size of the window
        super.setLocation(400,400);//location of the window in the screen
        this.createGUI();
        this.startClock();
        super.setVisible(true);//visible if it is set true
    }
    public void createGUI(){
        heading = new JLabel("My Clock",SwingConstants.CENTER);//used to create label and then add them into the grid
        clockLabel = new JLabel("Clock",SwingConstants.CENTER);
        heading.setFont(font);
        clockLabel.setFont(font);

        this.setLayout(new GridLayout(2,1));

        this.add(heading);
        this.add(clockLabel);
    }
    public void startClock(){
        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String dateTime =new Date().toString();
//                String dateTime =new Date().toLocaleString();
                Date d = new Date();
                SimpleDateFormat sfd = new SimpleDateFormat("hh : mm : ss : SS");
                String dateTime = sfd.format(d);
                clockLabel.setText(dateTime);
            }
        });
        timer.start();
    }
}
