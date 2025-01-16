 
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
 
public class Signup2 extends JFrame implements ActionListener{
    
    JTextField pan,Adhar,incometextfield;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,Catagory,Educational,Ocupation;
    String formno;
    
    Signup2(String formno) {
        this.formno=formno;
         setTitle("NEW ACCOUNT FORM - PAGE 2");
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
         

        // Additional details
        JLabel additionaldetails = new JLabel("Additional Details");
        additionaldetails.setFont(new Font("Raleway", Font.BOLD, 18));
        additionaldetails.setForeground(Color.WHITE);
        additionaldetails.setBounds(100, 80, 400, 30);
        label.add(additionaldetails);

        // Region
        JLabel name = new JLabel("Region:");
        name.setFont(new Font("Raleway", Font.BOLD, 22));
        name.setForeground(Color.WHITE);
        name.setBounds(100, 140, 100, 30);
         label.add(name);

        // Region textfield
        String valReligion[]={"Other","Hindu","Muslim","Sikh","Cristian"};
          religion= new JComboBox(valReligion);
        religion.setBackground(Color.WHITE);
        religion.setFont(new Font("Raleway", Font.BOLD, 14));
        religion.setBounds(300, 140, 350, 30);
         label.add(religion);

        // Catagory
        JLabel fname = new JLabel("Catagory:");
        fname.setFont(new Font("Raleway", Font.BOLD, 22));
        fname.setForeground(Color.WHITE);
        fname.setBounds(100, 190, 200, 30);
         label.add(fname);

        // Catagory textfield
        String valCatagory[] = {"General","OBC","ST","SC","EWS"};
          Catagory=new JComboBox(valCatagory);
        Catagory.setBackground(Color.WHITE);
        Catagory.setFont(new Font("Raleway", Font.BOLD, 14));
        Catagory.setBounds(300, 190, 350, 30);
         label.add(Catagory);

        // dob
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 22));
        dob.setForeground(Color.WHITE);
        dob.setBounds(100, 240, 200, 30);
        label. add(dob);
        
        //income textfiled
          incometextfield = new JTextField();
        incometextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        incometextfield.setBounds(300, 240, 350, 30);
         label.add(incometextfield);

//        // dob textfield
//           dateChooser = new JDateChooser();
//         //dateChooser.setFont(new Font("Raleway", Font.BOLD, 14));
//         dateChooser.setForeground(new Color(105,105,105));
//         dateChooser.setBounds(300, 240, 350, 30);
//         add(dateChooser);

        // Educational
        JLabel gender = new JLabel("Educational:");
        gender.setFont(new Font("Raleway", Font.BOLD, 22));
        gender.setForeground(Color.WHITE);
        gender.setBounds(100, 290, 200, 30);
         label.add(gender);
        
       
        // Qualification
        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", Font.BOLD, 22));
        email.setForeground(Color.WHITE);
        email.setBounds(100, 315, 200, 30);
         label.add(email);
        
        String valEducational[] = {"None Graduateion","Graduateion","Post-Graduateion","Doctrate","Others"};
          Educational=new JComboBox(valEducational);
        Educational.setBackground(Color.WHITE);
        Educational.setFont(new Font("Raleway", Font.BOLD, 14));
        Educational.setBounds(300, 310, 350, 30);
         label.add(Educational);

         

        // Ocupation Status
        JLabel OcupationStatus = new JLabel("Ocupation:");
        OcupationStatus.setFont(new Font("Raleway", Font.BOLD, 22));
        OcupationStatus.setForeground(Color.WHITE);
        OcupationStatus.setBounds(100, 390, 200, 30);
         label.add(OcupationStatus);
        
        String valOcupation[] = {"Salaried","Self-Employed","Student","Retired","Others"};
          Ocupation=new JComboBox(valOcupation);
        Ocupation.setBackground(Color.WHITE);
        Ocupation.setFont(new Font("Raleway", Font.BOLD, 14));
        Ocupation.setBounds(300, 390, 350, 30);
         label.add(Ocupation);

        // PAN
        JLabel ad = new JLabel("PAN Number:");
        ad.setFont(new Font("Raleway", Font.BOLD, 22));
        ad.setForeground(Color.WHITE);
        ad.setBounds(100, 440, 200, 30);
         label.add(ad);

        // PAN textfield
          pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 350, 30);
         label.add(pan);

        // Adhar
        JLabel aad = new JLabel("Adhar Number:");
        aad.setFont(new Font("Raleway", Font.BOLD, 22));
        aad.setForeground(Color.WHITE);
        aad.setBounds(100, 490, 200, 30);
         label.add(aad);

        // Adhar textfield
          Adhar = new JTextField();
        Adhar.setFont(new Font("Raleway", Font.BOLD, 14));
        Adhar.setBounds(300, 490, 350, 30);
         label.add(Adhar);

        // Senior
        JLabel Senior = new JLabel("Senior Citizen:");
        Senior.setFont(new Font("Raleway", Font.BOLD, 22));
        Senior.setForeground(Color.WHITE);
        Senior.setBounds(100, 540, 200, 30);
         label.add(Senior);

        // Senior textfield
            syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
         label.add(syes);
        
          sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
         label.add(sno);

        ButtonGroup marriedgroup= new ButtonGroup();
        marriedgroup.add(syes);
        marriedgroup.add(sno);

        // Existing
        JLabel Pincode = new JLabel("Existing Account:");
        Pincode.setFont(new Font("Raleway", Font.BOLD, 22));
           Pincode.setForeground(Color.WHITE);
        Pincode.setBounds(100, 590, 200, 30);
         label.add(Pincode);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
         label.add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
         label.add(eno);

        ButtonGroup ass= new ButtonGroup();
        ass.add(eyes);
        ass.add(eno);
        
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
     
    String  sreligion= (String) religion.getSelectedItem();
    String sCatagory=(String) Catagory.getSelectedItem();
    String sincometextfield=incometextfield.getText();
    String sEducational=(String) Educational.getSelectedItem();
    String sOcupation=(String) Ocupation.getSelectedItem();

     String seniorcitizen = null;
    if (syes.isSelected()){
        seniorcitizen ="Yes";
    }else if(sno.isSelected()){
        seniorcitizen= "No";
    }
    
    String Existing = null;
    if (eyes.isSelected()){
        Existing ="Yes";
    }else if(eno.isSelected()){
        Existing= "No";
    }
    
    
    String span=pan.getText();
    String sAdhar=Adhar.getText();
   
    
    try{
        if(religion.equals("") || Catagory.equals("") || incometextfield.equals("") || Educational.equals("") || Ocupation.equals("") || pan.equals("") || Adhar.equals("")){
            JOptionPane.showMessageDialog(null, "All fields are required");
        }else{
           Cong c=new Cong();
           String query = "insert into signup2 values('"+formno+"','"+sreligion+"','"+sCatagory+"','"+sincometextfield+"','"+sEducational+"','"+sOcupation+"','"+span+"','"+sAdhar+"','"+seniorcitizen+"','"+Existing+"')";
           c.s.executeUpdate(query);
           //JOptionPane.showMessageDialog(null, "Form Submitted Successfully");
        
           //signup3 object
           setVisible(false);
           new Signup3(formno).setVisible(true);
        }
    }catch(Exception e){
        System.out.print(e);
    }
}
    public static void main(String[] args) {
        new Signup2("");
    }
}
