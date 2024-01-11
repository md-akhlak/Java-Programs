package JavaAWT;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalulator extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JButton btn;
    JTextField t1, t2, t3;

    SimpleCalulator() {
        l1 = new JLabel("Enter first number : ");
        l2 = new JLabel("Enter Second number : ");
        l3 = new JLabel("OUPUT is => ");

        btn = new JButton("ADD");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(btn);

        btn.addActionListener(this);
        setSize(500, 500);
        setLayout(null);
        setTitle("ADDITION");


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        float a = Float.parseFloat(t1.getText());
        float b = Float.parseFloat(t2.getText());

        float c = a + b;

        t3.setText(String.valueOf(c));
    }

    public static void main(String[] args) {
        SimpleCalulator obj = new SimpleCalulator();
        obj.setVisible(true);
        obj.setLocation(500, 500);
    }


}
