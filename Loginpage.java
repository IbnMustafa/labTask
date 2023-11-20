package LabAssignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Loginpage extends JFrame implements ActionListener {
    private static   JLabel userLabel=new JLabel();
    private static JLabel  passLabel=new JLabel();
    private static JTextField userText=new JTextField();
    private static JPasswordField passText=new JPasswordField();
    private static JButton loginButton=new JButton();

    Loginpage(){
        userLabel = new JLabel("Username:");
        userLabel.setBounds(10, 10, 80, 25);
        add(userLabel);
        passLabel = new JLabel("Password:");
        passLabel.setBounds(10, 40, 80, 25);
        passLabel.add(passLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        userText.add(userText);

        passText = new JPasswordField(20);
        passText.setBounds(100, 40, 160, 25);
        add(passText);

        loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(this);
        loginButton.add(loginButton);

        setTitle("Login Form");
        setSize(300, 150);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String pass = new String(passText.getPassword());

        if (user.equals("ibnMustafa") && pass.equals("12345678")) {
            JOptionPane.showMessageDialog(this, "Login successful!");
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password.");
        }
    }


}
