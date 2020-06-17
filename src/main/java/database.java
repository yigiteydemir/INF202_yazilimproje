
import java.sql.Connection;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yigit
 */
public class database {
 
    private static String url = "jdbc:mysql://localhost:3306/projekt?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";    
    private static String driverName = "com.mysql.jdbc.Driver";   
    private static String username = "root";   
    private static String password = "";
    private static Connection con;
    private static String urlstring;

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
        }
        return con;
    }
    
    /* public static void main(String[] args) throws ClassNotFoundException {
        
        try {
            Class.forName("com.mysql.cjjdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projekt?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");
            System.out.println("Connected");
            Statement stmt = conn.createStatement();
           
        } catch (SQLException e) {
            System.err.println(e);
        }  
        
    } */


}
