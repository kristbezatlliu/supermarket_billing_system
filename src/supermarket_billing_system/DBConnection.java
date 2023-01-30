/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket_billing_system;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DBConnection {
    public static Connection connect(){
        Connection con = null;
        try{jdbc:mysql:
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket_billing_system?","root","");
            System.out.println("Connection with database was successful");
        } catch (Exception e){
            System.out.println("The problem is: " + e);
        }
        return con;
    }
}
