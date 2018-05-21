package model;

public class Usuario {

    private String run;
    private String nombre;
    private int tipoUsuario;

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario(String run, String nombre) {
        this.run = run;
        this.nombre = nombre;
    }

    public Usuario(String run) {
        this.run = run;
    }

    public Usuario() {
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" + "run=" + run + ", nombre=" + nombre + '}';
    }

    public String getTipoString() {
        String tipo = "";
        switch (tipoUsuario) {
            case 1:
                tipo = "Administrador";
                break;
            case 2:
                tipo = "Vendedor";
                break;
        }
        return tipo;
    }

}
