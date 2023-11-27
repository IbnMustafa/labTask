
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 public class Loginpage extends JFrame implements ActionListener {
          JLabel userLabel,passLabel;
         JTextField userText;
         JPasswordField passText;
         JButton loginButton;
         Loginpage(){
            userLabel = new JLabel("Username:");
            setBounds(10, 10, 80, 25);
            add(userLabel);
            passLabel = new JLabel("Password:");
            passLabel.setBounds(10, 40, 80, 25);
            add(passLabel);
            userText = new JTextField(20);
            userText.setBounds(100, 10, 160, 25);
            add(userText);
            passText = new JPasswordField(20);
            passText.setBounds(100, 40, 160, 25);
            add(passText);
            loginButton = new JButton("Login");
            loginButton.setBounds(10, 80, 80, 25);
            loginButton.addActionListener(this);
            add(loginButton);
            setTitle("Login Form");
            setSize(300, 150);
            setLayout(null);
            setVisible(true);
        }
        public void actionPerformed(ActionEvent e) {
            String user = userText.getText();
            String pass = new String(passText.getPassword());
            if (user.equals("Abdullah") && pass.equals("12345678")) {
                JOptionPane.showMessageDialog(this, "Login successful!");
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.");
            }
        }
        public static void main(String[] args) {
         Loginpage loginpage=new Loginpage();
     }
 }