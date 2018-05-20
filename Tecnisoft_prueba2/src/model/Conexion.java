package model;

// Interfaces != Clases
import java.sql.Connection;     // Establece la conexión
import java.sql.ResultSet;
/*
Cuando se ejecuta un select, mysql 
devuelve una tabla. --> ResultSet (Tabla virtual)
*/
import java.sql.DriverManager;         // Cargar el Driver de MySQL
import java.sql.SQLException;
import java.sql.Statement;      // Declarar o ejecutar Consultas
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    private Statement sen;
    ResultSet rs;
    private Connection con; 
    
    public Conexion(
        String server,  // localhost
        String bd,      // ? (nombre de BD  )
        String user,    // root
        String pass     // ?
    ) throws ClassNotFoundException, SQLException{
        String protocolo = "jdbc:mysql://";
        String lineaUser = "user="+user;
        String lineaPass = "password="+pass;
       
        String url = protocolo +
                server + "/" +
                bd + "?" +
                lineaUser + "&" +
                lineaPass;
       
        System.out.println(url);
        
        Class.forName("com.mysql.jdbc.Driver"); // JAR?
        con = DriverManager.getConnection(url);
    }
    
    // insert, delete, update
    public void ejecutar(String query) throws SQLException{
        System.out.println(query);
        sen = con.createStatement();
        sen.executeUpdate(query);
        close();
    }
   
    // select
    public ResultSet ejecutarSelect(String query) throws SQLException{
        System.out.println(query);
        sen = con.createStatement();
        rs = sen.executeQuery(query);
        return rs;
    }
   
    public void close() throws SQLException{
        sen.close();
}

    
}
