package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JTextField textField1;
    private JTextField textField2;
    private JButton ingresarButton;
    public JPanel mainPanel;
    private JLabel validar;
    private JPasswordField passwordField1;

    public form1() {
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = textField1.getText();
                String passw = passwordField1.getText();
                if(usuario.equals("Vargas") && passw.equals("Vargas123")){
                        validar.setText("INGRESO EXITOSO");
                }
                else {
                    validar.setText("ACCESO DENEGADO");
                }
            }
        });
    }
}
