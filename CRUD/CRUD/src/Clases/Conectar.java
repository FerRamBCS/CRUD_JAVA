/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author ASUS TUF
 */
public class Conectar {
    Connection cn;
    public Connection conexion(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/based_java", "root","");
             System.out.println("conectado");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        return cn;
    }
    
   
}
