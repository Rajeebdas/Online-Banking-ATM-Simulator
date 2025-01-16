 
package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Deposite extends JFrame implements ActionListener{
    JTextField amount;
    JButton deposite, back;
    String pinnumber;
    Deposite(String pinnumber){
        this.pinnumber=pinnumber;
        ImageIcon il=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=il.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0, 0,900,900);
        add(image);
        
        //label
        JLabel text = new JLabel("Enter the amount you want to Deposite");
        text.setFont(new Font("System",Font.BOLD,16));
        text.setForeground(Color.WHITE);
        text.setBounds(180,280, 400,20);
        image.add(text);
        
        //text fill
          amount = new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(170, 340, 320, 25);
        image.add(amount);
        
        //button deposte
          deposite= new JButton("Deposite");
        deposite.setBounds(355, 460, 150, 30);
        deposite.addActionListener(this);
        image.add(deposite);
        
         //button back
          back= new JButton("Back");
        back.setBounds(355, 492, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
                        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == deposite){
            String number= amount.getText();
            Date date=new Date();
            if(number.equals("")){
               JOptionPane.showMessageDialog(null, "Enter the Amount");
            }else{
                try{
                Cong conn=new Cong();
                String query = "INSERT INTO bank VALUES ('" + pinnumber + "', '" + date + "', 'Deposite', '" + number + "')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+number+" Deposited Successfully");
               setVisible(false);
               new Transaction(pinnumber).setVisible(true);
                }catch(Exception e){
                    System.out.print(e);
                }
            }
        }else if(ae.getSource() == back){
            setVisible(false);
          new Transaction(pinnumber).setVisible(true);
        }
    }
    public static void main(String args[]){
       new Deposite("");
    }
            
}