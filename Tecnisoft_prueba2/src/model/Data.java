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

    public void registrarUsuarioAdmin(Usuario nuevo) throws SQLException {
        query = ("INSERT INTO usuario VALUES(null,'" + nuevo.getRun() + "','Administrador','1');");
        con.ejecutar(query);
    }
    
    public int validarUsuario(String run) throws SQLException {
        int validador = 0;
        String sql = "SELECT COUNT(*) FROM usuario WHERE run =" + run;
        if (con.ejecutarSelect(query).next()) {
            validador = con.rs.getInt(1);
        }
        con.close();
        return validador;
    }
    
    public void getUsuarioSesion(int num, String run){
        Usuario u;
        
        String sql = "SELECT run,nombre,fk_tipoUsu FROM usuario WHERE run = "+run;
        
    }

    public void registrarUsuarioVendedor(Usuario nuevo) throws SQLException {
        query = ("INSERT INTO usuario VALUES(null,'" + nuevo.getRun() + "','Vendedor','2');");
        con.ejecutar(query);
    }

    public void registrarDepartamento(Vivienda nueva) throws SQLException {
        query = ("INSERT INTO vivienda VALUES('" + nueva.getNum_rol() + "',"
                + "'" + nueva.getDireccion() + "',"
                + "'" + nueva.getCant_banos() + "',"
                + "'" + nueva.getCant_piezas() + "',"
                + "1,"
                + "'" + nueva.getPrecio() + "',"
                + "'" + nueva.getNueva() + "');");

        con.ejecutar(query);

    }

    public void registrarCasa(Vivienda nueva) throws SQLException {
        query = ("INSERT INTO vivienda VALUES('" + nueva.getNum_rol() + "',"
                + "'" + nueva.getDireccion() + "',"
                + "'" + nueva.getCant_banos() + "',"
                + "'" + nueva.getCant_piezas() + "',"
                + "2,"
                + "'" + nueva.getPrecio() + "',"
                + "'" + nueva.getNueva() + "');");

        con.ejecutar(query);

    }

}
