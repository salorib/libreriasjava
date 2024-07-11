package com.r3.libreriasjava;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import io.qt.widgets.QApplication;
import javafx.application.Application;


public class Main{
    
    public static void main(String[] args) {

        JFrame frame = new JFrame("Librerias de interfaz Grafica");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton btnSwing = new JButton("Swing");
        JButton btnQtJambi = new JButton("QtJambi");
        JButton btnJavaFX = new JButton("JavaFX");

        btnSwing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             new SwingLib();
            }
        });

        btnQtJambi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                QApplication.initialize(args);
                QtJambiLib qtjambi = new QtJambiLib();
                qtjambi.show();
                QApplication.exec();
                QApplication.shutdown();
            }
        });

        btnJavaFX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Application.launch(JavaFXLib.class);
                System.out.println("Hello FX");
            }
        });

        panel.add(btnSwing);
        panel.add(btnQtJambi);
        panel.add(btnJavaFX);

        frame.add(panel);
        frame.setVisible(true);
        frame.pack();

    }

}