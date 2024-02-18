package JavaAWT;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class JavaApplet extends Applet implements ActionListener {

    TextField t1 = new TextField(10);
    Label l1 = new Label("Enter number");
    TextField t2 = new TextField(10);
    Label l2 = new Label("The number is");
    Button b = new Button("Check");

    public void init() {
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            int n1 = Integer.parseInt(t1.getText());
            int count = 0;
            for (int i = 0; i < n1; i++) {
                if (n1 % i == 0) {
                    count++;
                }
                if (count == 2) {
                    t2.setText("Number is prime ");
                } else {
                    t2.setText("Number is not prime");
                }
            }

        }

    }

    public void start() {
        // Start code
    }

    public void stop() {
        // Stop code
    }

    public void destroy() {
        // Destruction code
    }

    public void paint(Graphics g) {
        // Drawing code
        g.drawString("Hello, World!", 20, 20);
    }

}
