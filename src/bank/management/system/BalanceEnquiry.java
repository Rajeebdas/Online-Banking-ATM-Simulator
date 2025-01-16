 
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class BalanceEnquiry extends JFrame implements ActionListener{
    JButton back;
    String pinnumber;
    BalanceEnquiry(String pinnumber){
        this.pinnumber=pinnumber;
        //image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0, 900,900);
        add(image);
        
        //back button
        back=new JButton("Back");
        back.setBounds(355, 520,150, 30);
        back.addActionListener(this);
        image.add(back);
        
        //show balance
        Cong c=new Cong();
           int balance=0;
        try{
                ResultSet rs=c.s.executeQuery("select * from bank where pinnumber = '"+pinnumber+"'");
                while(rs.next()){
                    if(rs.getString("type").equals("Deposite")){
                    balance +=Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
        }catch(Exception e){
                  System.out.print(e);
        }
        
        JLabel text=new JLabel("Your Current Account balance is");
        text.setFont(new Font("System", Font.BOLD,16));
        text.setForeground(Color.WHITE);
        text.setBounds(200,350,400,30);
        image.add(text);
        
        JLabel text1=new JLabel("Rs: "+balance);
        text1.setFont(new Font("System", Font.BOLD,20));
        text1.setForeground(Color.WHITE);
        text1.setBounds(290,380,400,30);
        image.add(text1);
        
      setSize(900,900);
      setLocation(300,0);
      setUndecorated(true);
      setLayout(null);
      setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transaction(pinnumber).setVisible(true);
    }
    
    public static void main(String args[]){
    new BalanceEnquiry("");
}
}
