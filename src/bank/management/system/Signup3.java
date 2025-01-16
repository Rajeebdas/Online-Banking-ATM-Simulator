package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class Signup3 extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton Submit, cancel;
     String formno;
    Signup3(String formno){
        this.formno= formno;
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/backgrd3.png"));
        Image i2 = il.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 850, 800);
        add(label);
        
        ImageIcon l5 = new ImageIcon(ClassLoader.getSystemResource("icons/sidelogo2.png"));
        Image l2 = l5.getImage().getScaledInstance(150, 60, Image.SCALE_DEFAULT);
        ImageIcon l3 = new ImageIcon(l2);
        JLabel label1 = new JLabel(l3);
        label1.setBounds(0, 0, 150, 60);
        label.add(label1);
        
        
        
        
        // Set the title of the frame
        setTitle("Signup Page 3");
        setLayout(null);
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //lebal
        JLabel l1=new JLabel("Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 18));
        l1.setForeground(Color.WHITE);
        l1.setBounds(100, 80, 400, 30);
        label.add(l1);
        
        //Account type
        JLabel type=new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setForeground(Color.WHITE);
        type.setBounds(100, 140, 400, 40);
        label.add(type);
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 180, 200, 20);
        label.add(r1);
        
        r2=new JRadioButton("Fixed Deposite Account");
        r2.setFont(new Font("Raleway", Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(450, 180, 200, 20);
        label.add(r2);
        
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 220, 200, 20);
        label.add(r3);
        
        r4=new JRadioButton("Recurring Deposite Account");
        r4.setFont(new Font("Raleway", Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(450, 220, 200, 20);
        label.add(r4);
        
        ButtonGroup accType= new ButtonGroup();
        accType.add(r1);
        accType.add(r2);
        accType.add(r3);
        accType.add(r4);
        
        
        //card number
         JLabel card=new JLabel("Card Number");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setForeground(Color.WHITE);
        card.setBounds(100, 300, 200, 30);
        label.add(card);
        
         //  number
        JLabel number=new JLabel("XXX-XXXX-XXXX-4105");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setForeground(Color.WHITE);
        number.setBounds(420, 300, 300, 40);
        label.add(number);
        
        //  cardnumber
        JLabel cardnumber=new JLabel("This 16 Digit Card Number");
        cardnumber.setFont(new Font("Raleway", Font.BOLD, 12));
        cardnumber.setForeground(Color.WHITE);
        cardnumber.setBounds(100, 330, 300, 20);
        label.add(cardnumber);
        
         //pin number
         JLabel pin=new JLabel("Pin: ");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 370, 200, 30);
        pin.setForeground(Color.WHITE);
        label.add(pin);
        
         //  number
        JLabel pnumber=new JLabel("XXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(420, 370, 300, 30);
        pnumber.setForeground(Color.WHITE);
        label.add(pnumber);
        
        //  cardnumber
        JLabel pinnumber=new JLabel("This 4 Digit Pin Number");
        pinnumber.setFont(new Font("Raleway", Font.BOLD, 12));
        pinnumber.setForeground(Color.WHITE);
        pinnumber.setBounds(100, 400, 300, 20);
        label.add(pinnumber);
        
        //services required
         JLabel services=new JLabel("Rervices Required ");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setForeground(Color.WHITE);
        services.setBounds(100, 450, 250, 30);
        label.add(services);
        
        c1=new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD,16));
        c1.setBounds(100, 500, 200, 30);
        label.add(c1);
        
        c2=new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD,16));
        c2.setBounds(100, 530, 200, 30);
        label.add(c2);
        
        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD,16));
        c3.setBounds(450, 500, 200, 30);
        label.add(c3);
        
        c4=new JCheckBox("Email & SMS Alert");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD,16));
        c4.setBounds(450, 530, 200, 30);
        label.add(c4);
        
        c5=new JCheckBox("Check Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD,16));
        c5.setBounds(100, 560, 200, 30);
        label.add(c5);
        
        c6=new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD,16));
        c6.setBounds(450, 560, 200, 30);
        label.add(c6);
        
        c7=new JCheckBox("I hereby declare that the above entered details are correct to the best of my mind");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD,12));
        c7.setBounds(80, 640, 600, 30);
        label.add(c7);
        
        
        //submit button
        Submit=new JButton("Submit");
        Submit.setBackground(Color.BLUE);
        Submit.setForeground(Color.WHITE);
        Submit.setFont(new Font("Ralway", Font.BOLD,14));
        Submit.setBounds(250,720,100,30);
        Submit.addActionListener(this);
        label.add(Submit);
         Submit.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        Submit.setBackground(Color.WHITE);
        Submit.setForeground(Color.BLACK);
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        Submit.setBackground(Color.BLUE);
        Submit.setForeground(Color.WHITE);
    }
});
        
        //cancel button
        cancel=new JButton("Cancel");
        cancel.setBackground(Color.BLUE);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Ralway", Font.BOLD,14));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        label.add(cancel);
         cancel.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        cancel.setBackground(Color.WHITE);
        cancel.setForeground(Color.BLACK);
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        cancel.setBackground(Color.BLUE);
        cancel.setForeground(Color.WHITE);
    }
});
        // Revalidate and repaint the frame to ensure all components are rendered
        revalidate();
        repaint();
 
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == Submit){
            String type=null;
            if(r1.isSelected()){
                type="Saving Account";
            }else if (r2.isSelected()){
                type="Fixed Deposite Account";
            }else if (r3.isSelected()){
                type="Current Account";
            }else if (r4.isSelected()){
                type="Recurring Deposite Account";
            } 
            
            Random random=new Random();
            String cardnumber=" "+Math.abs((random.nextLong() % 90000000L)+5040936000000000L);
            String pinnumber=" "+Math.abs((random.nextLong() % 9000L)+1000L);
            
            String facility=" ";
            if(c1.isSelected()){
                facility =facility+"ATM Card";
            }else  if(c2.isSelected()){
                facility =facility+"Internet Banking";
            }else if(c3.isSelected()){
                facility =facility+"Mobile Banking";
            }else if(c4.isSelected()){
                facility =facility+"Email & SMS Alert";
            }else if(c5.isSelected()){
                facility =facility+"Check Book";
            }else if(c6.isSelected()){
                facility =facility+"E-Statement";
            } 
            
            try{
                if(type.equals("")){
                    JOptionPane.showMessageDialog(null, "All fields are required");
                }else{
                     
                    Cong c=new Cong();
                    String query = "INSERT INTO Signup3 values ('" + formno + "', '" + type + "', '" + cardnumber + "', '" + pinnumber + "', '" + facility+ "')";
                    String query2 = "INSERT INTO login values ('"+formno+"','"+cardnumber +"','"+pinnumber+"')";

                    c.s.executeUpdate(query);
                    c.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Form Submitted Successfully");
                    JOptionPane.showMessageDialog(null, "Card Number: "+cardnumber+"\n Pin: "+pinnumber);
                
                    setVisible(false);
                    new Deposite(pinnumber).setVisible(true);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }else if (ae.getSource() == cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    public static void main(String args[]){
        new Signup3("");
    }
}
