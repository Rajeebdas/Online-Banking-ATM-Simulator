 
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Date;
public class FastCash extends JFrame implements ActionListener{
    JButton deposite,withdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
    String pinnumber;
    FastCash(String pinnumber){
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
        
        JLabel text=new JLabel("Select Withdrawl Amount");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Ralway", Font.BOLD,16));
        image.add(text);
        
        // buutton
          deposite = new JButton("Rs 100");
        deposite.setBounds(170, 415, 150, 25);
        deposite.addActionListener(this);
        image.add(deposite);
        
        // cash withdrawll
          withdrawl = new JButton("Rs 500");
        withdrawl.setBounds(355, 415, 150, 25);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        // buutton
          fastcash = new JButton("Rs 1000");
        fastcash.setBounds(170, 450, 150, 25);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        // cash withdrawll
          ministatement = new JButton("Rs 2000");
        ministatement.setBounds(355, 450, 150, 25);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
         // cash withdrawll
          pinchange = new JButton("Rs 5000");
        pinchange.setBounds(170, 485, 150, 25);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
         // cash withdrawll
        balanceenquiry = new JButton("Rs 10000");
        balanceenquiry.setBounds(355, 485, 150, 25);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
         // cash withdrawll
        exit = new JButton("Back");
        exit.setBounds(355, 520, 150, 25);
        exit.addActionListener(this);
        image.add(exit);


    // Revalidate and repaint the frame to ensure all components are rendered
        revalidate();
        repaint();
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== exit){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }else{
            String amount= ((JButton) ae.getSource()).getText().substring(3);
            Cong c=new Cong();
            try{
                ResultSet rs=c.s.executeQuery("select * from bank where pinnumber = '"+pinnumber+"'");
                int balance=0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposite")){
                    balance +=Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(ae.getSource() != exit && balance <Integer.parseInt(amount)){
                  JOptionPane.showMessageDialog(null, "Insufficient Balance");
                  return;
                }
                Date date=new Date();
                String query="insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+amount+"')";
                c.s.execute(query);
                JOptionPane.showMessageDialog(null, "Rs "+amount+" Debited Sucessfully");
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
            }catch (Exception e){
                System.out.print(e);
            }
          } 
    }
    public static void main (String args[]){
        new FastCash("");
    }
}
