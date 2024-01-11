package JavaAWT;

import javax.swing.*;
import java.awt.*;

public class BasicAWT extends JFrame {

    BasicAWT() {
        Button btn = new Button("Click me");
        btn.setBounds(50, 100, 50, 50);
        setSize(100, 100);
        setLayout(null);
        setVisible(true);
        add(btn);

    }

    public static void main(String[] args) {

        BasicAWT obj = new BasicAWT();


    }


}

