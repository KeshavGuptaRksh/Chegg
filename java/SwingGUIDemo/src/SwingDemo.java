import javax.swing.*;



public class SwingDemo {

    SwingDemo() {
        JFrame f = new JFrame();
        JLabel l1 = new JLabel("Simple Calculator");
        JLabel label_n1 = new JLabel("First Number");
        JLabel label_n2 = new JLabel("Second Number");
        JLabel label_ans = new JLabel("");
        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();
        l1.setBounds(20, 20, 200, 30);
        label_n1.setBounds(20, 70, 100, 30);
        tf1.setBounds(140, 70, 100, 30);
        label_n2.setBounds(20, 120, 100, 30);
        tf2.setBounds(140, 120, 100, 30);
        label_ans.setBounds(150, 170, 100, 30);
        JButton btn1 = new JButton("Add");
        btn1.setBounds(150, 300, 100, 30);
        btn1.addActionListener(e -> {
            int num1, num2, r;
            num1 = Integer.parseInt(tf1.getText());
            num2 = Integer.parseInt(tf2.getText());
            r = num1 + num2;
            label_ans.setText(Integer.toString(r));
        });

        f.setTitle("My Frame");
        f.setSize(400, 400);
        f.setLayout(null);
        f.add(l1);
        f.add(label_n1);
        f.add(label_n2);
        f.add(tf1);
        f.add(tf2);
        f.add(label_ans);
        f.add(btn1);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
         new SwingDemo();
    }
}
