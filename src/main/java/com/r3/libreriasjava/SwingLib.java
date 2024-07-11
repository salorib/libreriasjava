package com.r3.libreriasjava;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class SwingLib extends JFrame{

    public SwingLib(){
        initComponents();
    }

    public void initComponents(){
        // Crear el frame
        setTitle("Swing");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
        
        // Crear un panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));

        // Crear un Label
        JLabel label = new JLabel("JLabel");
        panel.add(label);

        // Crear un TextField
        JTextField textField = new JTextField();
        textField.setText("JTextField");
        panel.add(textField);

        // Crear un CheckBox
        JCheckBox checkBox = new JCheckBox("JCheckBox");
        panel.add(checkBox);

        // Crear un RadioButton
        JRadioButton radioButton = new JRadioButton("JRadioButton");
        panel.add(radioButton);

        // Crear un ComboBox
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"JComboBox", "Option 2", "Option 3"});
        panel.add(comboBox);

        // Crear un Button
        JButton button = new JButton("JButton");
        panel.add(button);

        // Añadir el panel al frame
        add(panel);
        pack();

    }
    
}
