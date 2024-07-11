package com.r3.libreriasjava;

import io.qt.core.QStringList;
import io.qt.widgets.QCheckBox;
import io.qt.widgets.QComboBox;
import io.qt.widgets.QLabel;
import io.qt.widgets.QLineEdit;
import io.qt.widgets.QPushButton;
import io.qt.widgets.QRadioButton;
import io.qt.widgets.QVBoxLayout;
import io.qt.widgets.QWidget;

public class QtJambiLib extends QWidget {
    public QtJambiLib() {
        QVBoxLayout layout = new QVBoxLayout(this);

        // Crear un Label
        QLabel label = new QLabel("QLabel");
        layout.addWidget(label);

        // Crear un TextField
        QLineEdit textField = new QLineEdit();
        textField.setText("QLineEdit");
        layout.addWidget(textField);

        // Crear un CheckBox
        QCheckBox checkBox = new QCheckBox("QCheckBox");
        layout.addWidget(checkBox);

        // Crear un RadioButton
        QRadioButton radioButton = new QRadioButton("QRadioButton");
        layout.addWidget(radioButton);

        // Crear un ComboBox
        QComboBox comboBox = new QComboBox();
        QStringList options = new QStringList("QComboBox","Option 1","Option 2");
        comboBox.addItems(options);
        layout.addWidget(comboBox);

        // Crear un Button
        QPushButton button = new QPushButton("QPushButton");
        layout.addWidget(button);

        setLayout(layout);
        setWindowTitle("QtJambi");
        resize(300, 200);
        
    }
}
