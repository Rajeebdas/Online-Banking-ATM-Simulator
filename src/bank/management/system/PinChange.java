package bank.management.system;
import javax.swing.*;
 import java.awt.*;
import java.awt.event.*;
public class PinChange extends JFrame implements ActionListener {
    JButton change,back;
    JPasswordField pin,repin;
    String pinnumber;
    PinChange(String pinnumber) {
        this.pinnumber=pinnumber;
        setLayout(null);
        setSize(900,900);
        setUndecorated(true);
        setLocation(300,0);
        
        //background image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        //label
        JLabel text= new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        text.setBounds(250,280,500,35);
        image.add(text);
        
        //pintext label
        JLabel pintext= new JLabel("New PIN:");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System", Font.BOLD,16));
        pintext.setBounds(165,320,500,35);
        image.add(pintext);
        
          pin=new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(330,320,180,25);
        image.add(pin);
        
        //re pintext label
        JLabel repintext= new JLabel("Re-Enter PIN:");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System", Font.BOLD,16));
        repintext.setBounds(165,360,500,35);
        image.add(repintext);
        
          repin=new JPasswordField();
        repin.setFont(new Font("Raleway",Font.BOLD,25));
        repin.setBounds(330,360,180,25);
        image.add(repin);
        
          change= new JButton("CHANGE");
        change.setBounds(355,485,150,30);
        change.addActionListener(this);
        image.add(change);
        
          back=new JButton("BACK");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==change){
        try{
           String npin = pin.getText().trim();
           String rpin = repin.getText().trim();

            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                return;
            }
            if(npin.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter new PIN  ");
                return;
            }
            if(rpin.equals("")){
                JOptionPane.showMessageDialog(null,"Please re-enter new PIN  ");
                return;
            }
            
            Cong conn= new Cong();
            String query1="update bank set pinnumber='"+rpin+"' where pinnumber='"+pinnumber+"'";
            String query2="update login set pinnumber='"+rpin+"' where pinnumber='"+pinnumber+"'";
            String query3="update signup3 set pinnumber='"+rpin+"' where pinnumber='"+pinnumber+"'";

            conn.s.executeUpdate(query1);
            conn.s.executeUpdate(query2);
            conn.s.executeUpdate(query3);
            JOptionPane.showMessageDialog(null,"PIN Changed successfully");
            setVisible(false);
            new Transaction(rpin).setVisible(true);
        }catch(Exception e){
            System.out.print(e);
        }
        }else{
            setVisible(false);
            new Transaction( pinnumber).setVisible(true);
        }
    }
    
     

    public static void main(String args[]){
        new PinChange("").setVisible(true);
    }
}
 