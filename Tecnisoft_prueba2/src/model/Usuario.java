package model;

public class Usuario {

    private String run;
    private String nombre;

    public Usuario(String run, String nombre) {
        this.run = run;
        this.nombre = nombre;
    }

    public Usuario(String run) {
        this.run = run;
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

}
