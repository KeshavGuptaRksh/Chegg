import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling implements ActionListener {
    static JFrame frame = new JFrame("My Frame");
    JButton button_blue=new JButton("Blue");
    JButton button_red = new JButton("Red");
    JButton button_green = new JButton("Green");
    JButton button_yellow = new JButton("Yellow");
    JButton reset_color = new JButton("Reset");
    EventHandling() {


        button_blue.setBounds(30,30,100,50);
        button_green.setBounds(150,30,100,50);
        button_red.setBounds(270,30,100,50);
        button_yellow.setBounds(390,30,100,50);
        reset_color.setBounds(510,30,100,50);

        button_blue.addActionListener(this);
        button_green.addActionListener(this);
        button_red.addActionListener(this);
        button_yellow.addActionListener(this);
        reset_color.addActionListener(this);

        frame.add(button_blue);
        frame.add(button_green);
        frame.add(button_red);
        frame.add(button_yellow);
        frame.add(reset_color);
        frame.setSize(700, 500);
        frame.setLayout(null);
        frame.setLocation(100, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button_blue)
            frame.getContentPane().setBackground(Color.BLUE);
        else if(e.getSource()==button_green)
            frame.getContentPane().setBackground(Color.GREEN);
        else if(e.getSource()==button_red)
            frame.getContentPane().setBackground(Color.RED);
        else if(e.getSource()==button_yellow)
            frame.getContentPane().setBackground(Color.YELLOW);
        else
            frame.getContentPane().setBackground(Color.WHITE);
    }
}
