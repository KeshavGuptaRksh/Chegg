package JavaEditor;
import javax.swing.*;
import javax.swing.JMenuBar;
import java.awt.*;

public class MenuBarEditor {

    public static void main(String[] args)
    {
        JFrame myFrame = new JFrame();
        myFrame.setSize(600, 400);
        myFrame.setTitle("Java Editor: Patrick Stauffer 04.02.2022");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu ("File");
        JMenu m2 = new JMenu ("Font");
        JMenu m3 = new JMenu ("Style");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        myFrame.add(scrollPane);

        textArea.setEditable(true);
        textArea.setText("Hello This is my program");
        JavaEditor.MenuBarClass mb1 = new JavaEditor.MenuBarClass();

        myFrame.getContentPane().add(BorderLayout.NORTH, mb1);

        myFrame.setVisible(true);
    }

}
