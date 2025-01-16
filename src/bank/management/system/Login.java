 
package bank.management.system;


import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton loginButton, signupButton, clearButton;
        JTextField carTextField;
        JPasswordField pinTextField;
    Login(){
           
         // login popup image
        setLayout(null);
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/backgrd3.png"));
        Image i2 = il.getImage().getScaledInstance(800, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 800, 400);
        add(label);
        
        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icons/sidelogo2.png"));
        Image l2 = l1.getImage().getScaledInstance(150, 60, Image.SCALE_DEFAULT);
        ImageIcon l3 = new ImageIcon(l2);
        JLabel label1 = new JLabel(l3);
        label1.setBounds(0, 0, 150, 60);
        label.add(label1);
 
 
        // welcome to sbi
        JLabel text = new JLabel("Welcome to SBI");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setForeground(Color.WHITE);
        text.setBounds(280, 40, 400, 40);
        label.add(text);
        
        
        // card number
        JLabel cardno = new JLabel("Card No.");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setForeground(Color.WHITE);
        cardno.setBounds(120, 150, 150, 30);
       label.add(cardno);
        
        // card text field
        carTextField = new JTextField();
        carTextField.setBounds(300, 150, 250, 30);
        carTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(carTextField);
        
        // pin
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setForeground(Color.WHITE);
        pin.setBounds(120, 210, 250, 30);
        label.add(pin);
        
         // pin text field
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 210, 250, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);
        
        // sign in button
        loginButton = new JButton("SIGN IN");
        loginButton.setBounds(300, 260, 100, 30);
        loginButton.setBackground(Color.BLUE);
        loginButton.setForeground(Color.WHITE);
        loginButton.addActionListener(this);
        label.add(loginButton);
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        loginButton.setBackground(Color.WHITE);
        loginButton.setForeground(Color.BLACK);
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        loginButton.setBackground(Color.BLUE);
        loginButton.setForeground(Color.WHITE);
    }
});

       
        
        // clear button
        clearButton = new JButton("CLEAR");
        clearButton.setBounds(450, 260, 100, 30);
        clearButton.setBackground(Color.BLUE);
        clearButton.setForeground(Color.WHITE);
        clearButton.addActionListener(this);
        label.add(clearButton);
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        clearButton.setBackground(Color.WHITE);
        clearButton.setForeground(Color.BLACK);
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        clearButton.setBackground(Color.BLUE);
        clearButton.setForeground(Color.WHITE);
    }
});
        
        // sign up button
        signupButton = new JButton("SIGN UP");
        signupButton.setBounds(300, 310, 250, 30);
        signupButton.setBackground(Color.BLUE);
        signupButton.setForeground(Color.WHITE);
        signupButton.addActionListener(this);
        label.add(signupButton);
        signupButton.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        signupButton.setBackground(Color.WHITE);
        signupButton.setForeground(Color.BLACK);
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        signupButton.setBackground(Color.BLUE);
        signupButton.setForeground(Color.WHITE);
    }
});
        
        // set background color
        getContentPane().setBackground(Color.WHITE);
        // login popup frame
        setTitle("SBI");
        setSize(800, 400);
        setVisible(true);
        setLocation(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == clearButton) {
        carTextField.setText("");
        pinTextField.setText("");
    } else if (ae.getSource() == signupButton) {
        setVisible(false);
        new Signup1().setVisible(true);
    } else if (ae.getSource() == loginButton) {
      
        Cong conn = new Cong();
        String cardnumber = carTextField.getText().trim();
        String pinnumber = pinTextField.getText().trim();
        String query= "SELECT * FROM login WHERE TRIM(cardnumber) = '"+cardnumber+"' AND TRIM(pinnumber) = '"+pinnumber+"'";
        if (cardnumber.isEmpty() || pinnumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields.");
            return;
        }
        
        try {
          ResultSet rs = conn.s.executeQuery(query);
            if (rs.next()) {
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

       
    public static void main(String[] args) {
        new Login();
    }
}

