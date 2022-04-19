package proyectocinemagic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    Connection con;
    PreparedStatement stmt;
    int sw = 0;
    String cadena="", driver="";
    
    Conexion(){
    conecta();   
    }
    public void conecta(){
        cadena = "jdbc:mysql://localhost/bdcinema?user=root&password=12345678";
        driver = "com.mysql.jdbc.Driver";
        
        try{Class.forName(driver);
        con=DriverManager.getConnection(cadena);
        System.out.println("Conexion Exitosa");
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch(SQLException e1){
            JOptionPane.showMessageDialog(null, e1.getMessage());
        }
    }
    public Connection obtenConexion(){
        return con;
    }
    public static void main (String[] args){
        Conexion myConexion = new Conexion();
    }
}
