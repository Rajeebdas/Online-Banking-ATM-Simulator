 
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Transaction extends JFrame implements ActionListener{
    JButton deposite,withdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
    String pinnumber;
    Transaction(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true); 

        //background image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text=new JLabel("Please select your transaction");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Ralway", Font.BOLD,16));
        image.add(text);
        
        // buutton
          deposite = new JButton("Deposite");
          deposite.setFont(new Font("Ralway", Font.BOLD,14));
        deposite.setBounds(170, 415, 150, 30);
        deposite.addActionListener(this);
        image.add(deposite);
          
        
        // cash withdrawll
          withdrawl = new JButton("Cash Withdrawl");
           withdrawl.setFont(new Font("Ralway", Font.BOLD,14));
        withdrawl.setBounds(355, 415, 150, 30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        // buutton
          fastcash = new JButton("Fast Cash");
           fastcash.setFont(new Font("Ralway", Font.BOLD,14));
        fastcash.setBounds(170, 450, 150, 30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
//        // cash withdrawll
//          ministatement = new JButton("Mini Statement");
//        ministatement.setBounds(355, 450, 150, 30);
//        ministatement.addActionListener(this);
//        image.add(ministatement);
        
         // cash withdrawll
          pinchange = new JButton("Pin Change");
           pinchange.setFont(new Font("Ralway", Font.BOLD,14));
        pinchange.setBounds(170, 485, 150, 30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
         // cash withdrawll
        balanceenquiry = new JButton("Balance Enquiry");
         balanceenquiry.setFont(new Font("Ralway", Font.BOLD,14));
        balanceenquiry.setBounds(355, 450, 150, 30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
         // cash withdrawll
        exit = new JButton("Exit");
         exit.setFont(new Font("Ralway", Font.BOLD,14));
        exit.setBounds(355, 485, 150, 30);
        exit.addActionListener(this);
        image.add(exit);


    // Revalidate and repaint the frame to ensure all components are rendered
        revalidate();
        repaint();
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== exit){
            System.exit(0);
        }else if(ae.getSource()==deposite){
            setVisible(false);
            new Deposite(pinnumber).setVisible(true);
        }else if(ae.getSource() == withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if(ae.getSource()== fastcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }else if(ae.getSource()==pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }if(ae.getSource()==balanceenquiry){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }
    }
    public static void main (String args[]){
        new Transaction("");
    }
}
