package JavaAWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWT {

//    public AWT() {  // need to extends Frame class
//
//        Button button = new Button("click me");
//        button.setBounds(40, 60, 80, 20);
//        button.setBackground(Color.pink);
//        add(button);
//
//        TextArea textField = new TextArea("Enter");
//        button.setBounds(40,80,80,20);
//        textField.setBackground(Color.pink);
//        add(textField);
//
//        setLayout(null);
//        setSize(400, 300);
//        setVisible(true);
//
//        addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                Frame frame = (Frame) e.getSource();
//                frame.dispose();
//            }
//        });
//
//
//    }

    public AWT() { // no need to extends Frame class
        Frame frame = new Frame("AWT GUI");


        Label label = new Label("please enter");
        label.setBackground(Color.pink);
        label.setForeground(Color.black);
        label.setBounds(40, 100, 100, 30);

        Button button = new Button("click");
        button.setBackground(Color.pink);
        button.setForeground(Color.black);
        button.setBounds(40, 60, 80, 30);


        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Clicked sucessfully");
                button.setBackground(Color.yellow);
            }

        });

        frame.setSize(700, 500);

        frame.add(button);
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new AWT();
    }
}
