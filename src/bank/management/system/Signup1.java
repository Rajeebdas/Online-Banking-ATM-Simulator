 
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
 
public class Signup1 extends JFrame implements ActionListener{
    Long random;
    JTextField nameTextField,fnameTextField,emailtextfield,Addresstextfield,citytextfield,statetextfield,Pincodetextfield;
    JButton next;
    JRadioButton male, female, married, unmarried;
    JDateChooser dateChooser;
    
    Signup1(  ) {
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/backgrd3.png"));
        Image i2 = il.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 850, 800);
        add(label);
        
        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icons/sidelogo2.png"));
        Image l2 = l1.getImage().getScaledInstance(150, 60, Image.SCALE_DEFAULT);
        ImageIcon l3 = new ImageIcon(l2);
        JLabel label1 = new JLabel(l3);
        label1.setBounds(0, 0, 150, 60);
        label.add(label1);
        
        // random from number
        Random ran = new Random();
          random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        // label of form
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 20));
        formno.setForeground(Color.WHITE);
        formno.setBounds(290, 15, 600, 40);
        label.add(formno);

        // peronal details
        JLabel personaldetails = new JLabel("Personal Details");
        personaldetails.setFont(new Font("Raleway", Font.BOLD, 18));
        personaldetails.setForeground(Color.WHITE);
        personaldetails.setBounds(100, 80, 400, 30);
         label.add(personaldetails);

        // name
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 22));
        name.setForeground(Color.WHITE);
        name.setBounds(100, 140, 100, 30);
         label.add(name);

        // name textfield
          nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 350, 30);
        add(nameTextField);

        // fathers name
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 22));
        fname.setForeground(Color.WHITE);
        fname.setBounds(100, 190, 200, 30);
         label.add(fname);

        // fathers name textfield
          fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 350, 30);
        add(fnameTextField);

        // dob
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 22));
        dob.setForeground(Color.WHITE);
        dob.setBounds(100, 240, 200, 30);
         label.add(dob);

        // dob textfield
           dateChooser = new JDateChooser();
         dateChooser.setFont(new Font("Raleway", Font.BOLD, 14));
         dateChooser.setForeground(new Color(105,105,105));
         dateChooser.setBounds(300, 240, 350, 30);
          label.add(dateChooser);

        // gender
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 22));
        gender.setForeground(Color.WHITE);
        gender.setBounds(100, 290, 200, 30);
         label.add(gender);
        
        // gender textfield
          male = new JRadioButton("Male");
        male.setBounds(300, 290, 150, 30);
        male.setBackground(Color.WHITE);
         label.add(male);
        
          female = new JRadioButton("Female");
        female.setBounds(500, 290, 150, 30);
        female.setBackground(Color.WHITE);
         label.add(female);

        ButtonGroup gendegroup= new ButtonGroup();
        gendegroup.add(male);
        gendegroup.add(female);
        // email
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 22));
        email.setForeground(Color.WHITE);
        email.setBounds(100, 340, 200, 30);
         label.add(email);

        // email textfield
          emailtextfield = new JTextField();
        emailtextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        emailtextfield.setBounds(300, 340, 350, 30);
         label.add(emailtextfield);

        // Marital Status
        JLabel MaritalStatus = new JLabel("Marital Status:");
        MaritalStatus.setFont(new Font("Raleway", Font.BOLD, 22));
        MaritalStatus.setForeground(Color.WHITE);
        MaritalStatus.setBounds(100, 390, 200, 30);
         label.add(MaritalStatus);
        
        // Marital Status
          married = new JRadioButton("Married");
        married.setBounds(300, 390, 150, 30);
        married.setBackground(Color.WHITE);
         label.add(married);
        
          unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(500, 390, 150, 30);
        unmarried.setBackground(Color.WHITE);
         label.add(unmarried);

        ButtonGroup marriedgroup= new ButtonGroup();
        marriedgroup.add(married);
        marriedgroup.add(unmarried);

        // Address
        JLabel Address = new JLabel("Address:");
        Address.setFont(new Font("Raleway", Font.BOLD, 22));
        Address.setForeground(Color.WHITE);
        Address.setBounds(100, 440, 200, 30);
         label.add(Address);

        // Address textfield
          Addresstextfield = new JTextField();
        Addresstextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        Addresstextfield.setBounds(300, 440, 350, 30);
        label.add(Addresstextfield);

        // City
        JLabel City = new JLabel("City:");
        City.setFont(new Font("Raleway", Font.BOLD, 22));
        City.setForeground(Color.WHITE);
        City.setBounds(100, 490, 200, 30);
         label.add(City);

        // city textfield
          citytextfield = new JTextField();
        citytextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        citytextfield.setBounds(300, 490, 350, 30);
        add(citytextfield);

        // State
        JLabel State = new JLabel("State:");
        State.setFont(new Font("Raleway", Font.BOLD, 22));
        State.setForeground(Color.WHITE);
        State.setBounds(100, 540, 200, 30);
         label.add(State);

        // state textfield
          statetextfield = new JTextField();
        statetextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        statetextfield.setBounds(300, 540, 350, 30);
        add(statetextfield);

        // Pincode
        JLabel Pincode = new JLabel("Pin Code:");
        Pincode.setFont(new Font("Raleway", Font.BOLD, 22));
        Pincode.setForeground(Color.WHITE);
        Pincode.setBounds(100, 590, 200, 30);
         label.add(Pincode);

        // Pincode textfield
          Pincodetextfield = new JTextField();
        Pincodetextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        Pincodetextfield.setBounds(300, 590, 350, 30);
        add(Pincodetextfield);
        
        //next button
          next=new JButton("Next");
        next.setBackground(Color.BLUE);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.addActionListener(this);
        next.setBounds(570, 660,80, 30);
         label.add(next);
           next.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        next.setBackground(Color.BLUE);
        next.setForeground(Color.WHITE);
    }
});
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
public void actionPerformed(ActionEvent ae) {
    String formno = "" + random;
    String name = nameTextField.getText();
    String fname=fnameTextField.getText();
    String dob= ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
    String gender = null;
    if (male.isSelected()){
        gender ="Male";
    }else if(female.isSelected()){
        gender= "Female";
    }
    String email=emailtextfield.getText();
    String marrital = null;
    if (married.isSelected()){
        marrital ="Married";
    }else if(unmarried.isSelected()){
        marrital= "Unmarried";
    }
    
    String address=Addresstextfield.getText();
    String city=citytextfield.getText();
    String state=statetextfield.getText();
    String pin=Pincodetextfield.getText();
    
    try{
        if(name.equals("") || dob.equals("") || email.equals("") || address.equals("") || city.equals("") || state.equals("") || pin.equals("")){
            JOptionPane.showMessageDialog(null, "All fields are required");
        }else{
            Cong c=new Cong();
            String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marrital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
            c.s.executeUpdate(query);
         //   JOptionPane.showMessageDialog(null, "Form Submitted Successfully");
            
            setVisible(false);
            new Signup2(formno).setVisible(true);
        }
    }catch(Exception e){
        System.out.print(e);
    }
}
    public static void main(String[] args) {
        new Signup1();
    }
}
