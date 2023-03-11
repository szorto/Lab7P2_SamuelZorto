package lab7p2_samuelzorto;

import java.io.Serializable;

public class archivo implements Serializable{
    private String nombre, link, extension;
    private double tamanio;

    public archivo() {
    }

    public archivo(String nombre, String link, String extension, double tamanio) {
        this.nombre = nombre;
        this.link = link;
        this.extension = extension;
        this.tamanio = tamanio;
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

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
