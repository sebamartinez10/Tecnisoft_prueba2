package model;

import java.util.logging.Logger;

public class Venta {

    private int id;

    public Venta(int id) {
        this.id = id;
    }

    public Venta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + '}';
    }

}
