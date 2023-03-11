package lab7p2_samuelzorto;

import java.io.Serializable;
import java.util.ArrayList;

public class carpeta implements Serializable{
    private String nombre, link;
    private ArrayList<archivo> arc = new ArrayList();
    private ArrayList<carpeta> car = new ArrayList();

    public carpeta() {
    }

    public carpeta(String nombre, String link) {
        this.nombre = nombre;
        this.link = link;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<archivo> getArc() {
        return arc;
    }

    public void setArc(ArrayList<archivo> arc) {
        this.arc = arc;
    }

    public ArrayList<carpeta> getCar() {
        return car;
    }

    public void setCar(ArrayList<carpeta> car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
