
package model;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Data {
    private final Conexion con;
    private String query;
    private ResultSet rs;
    
    
    public Data() throws ClassNotFoundException, SQLException {
        con = new Conexion("localhost", "Prueba_2", "root", "123456");
    }
    
    public void registrarUsuarioAdmin(Usuario nuevo) throws SQLException{
        query = ("INSERT INTO usuario VALUES(null,'"+nuevo.getRun()+"','Administrador','1');");
        con.ejecutar(query);
     
    }
    
    public void registrarUsuarioVendedor(Usuario nuevo) throws SQLException{
        query = ("INSERT INTO usuario VALUES(null,'"+nuevo.getRun()+"','Vendedor','2');");
        con.ejecutar(query);
    }

     
    public void proce(String rut) throws SQLException{
        query = ("CALL validar('rut')");
        con.ejecutar(query);
    }
    
}
