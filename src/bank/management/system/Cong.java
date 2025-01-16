 
package bank.management.system;
import java.sql.*;
public class Cong {
    //create connection
    Connection c;
    Statement s;
    public Cong(){
        try{
                          
               // Establish connection to the database
               c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Rajeeb@2003");
               s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
