package ua.com.threads;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

public class Hang extends JFrame {
    public Hang() {
        init();
        pack();
        setVisible(true);
    }

    private void init() {
        JButton b1 = new JButton("Sleep");
        JButton b2 = new JButton("Hello");

        b1.addActionListener(this::handleButtonHello);
        b2.addActionListener((e) -> System.out.println("Hello world"));

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(b1);
        getContentPane().add(b2);
    }

    private void handleButtonHello(ActionEvent event) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Hang();
    }
}
