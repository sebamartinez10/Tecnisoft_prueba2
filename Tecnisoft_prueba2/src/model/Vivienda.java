
package model;


public class Vivienda {
    private String num_rol;
    private String direccion;
    private int cant_piezas;
    private int cant_banos;
    private int precio;
    private int nueva;

    public Vivienda(String num_rol, String direccion, int cant_piezas, int cant_banos, int precio, int nueva) {
        this.num_rol = num_rol;
        this.direccion = direccion;
        this.cant_piezas = cant_piezas;
        this.cant_banos = cant_banos;
        this.precio = precio;
        this.nueva = nueva;
    }

    public Vivienda() {
    }

    public String getNum_rol() {
        return num_rol;
    }

    public void setNum_rol(String num_rol) {
        this.num_rol = num_rol;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCant_piezas() {
        return cant_piezas;
    }

    public void setCant_piezas(int cant_piezas) {
        this.cant_piezas = cant_piezas;
    }

    public int getCant_banos() {
        return cant_banos;
    }

    public void setCant_banos(int cant_banos) {
        this.cant_banos = cant_banos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNueva() {
        return nueva;
    }

    public void setNueva(int nueva) {
        this.nueva = nueva;
    }
    
    

   

    @Override
    public String toString() {
        return "Vivienda{" + "num_rol=" + num_rol + ", direccion=" + direccion + ", cant_piezas=" + cant_piezas + ", cant_banos=" + cant_banos + ", precio=" + precio + ", nueva=" + nueva + '}';
    }
    
    
}
