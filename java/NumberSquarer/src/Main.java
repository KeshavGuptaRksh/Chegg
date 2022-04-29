import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Creating JFrame with title of Application
        JFrame frame = new JFrame("Number Sqaurer");
        //Creating Label
        JLabel label = new JLabel("Enter a number and Press OK to get square");
        //Creating TextField
        JTextField textField = new JTextField();
        //Creating Button with title OK
        JButton button = new JButton("OK");
        // Defining position of label within the frame
        label.setBounds(40,40,500,30);
        //Positioning text field inside our frame
        textField.setBounds(40,90,100,30);
        // Setting position of button inside the frame
        button.setBounds(40,140,100,30);
        //Add all the elements in the frame using add function
        frame.add(label);
        frame.add(textField);
        frame.add(button);

        // Defining the functionality of OK button which will generate square of a number on clicking the button
        button.addActionListener(e->{
            double num = Double.parseDouble(textField.getText());
            JOptionPane.showMessageDialog(frame,num*num);
        });
        //Setting layout of frame and its size
        frame.setSize(600,300);
        frame.setLayout(null);
        // Setting visibility of frame
        frame.setVisible(true);
        // Defining what will happen we press close button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
