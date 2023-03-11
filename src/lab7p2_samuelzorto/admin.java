package lab7p2_samuelzorto;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class admin {
    private ArrayList<archivo> listaArchivo = new ArrayList();
    private ArrayList<carpeta> listaCarpeta = new ArrayList();
    private File archivo = null;

    public admin() {
    }
    
    public admin(String path) {
        archivo = new File(path);
    }

    public ArrayList<archivo> getListaArchivo() {
        return listaArchivo;
    }

    public void setListaArchivo(ArrayList<archivo> listaArchivo) {
        this.listaArchivo = listaArchivo;
    }

    public ArrayList<carpeta> getListaCarpeta() {
        return listaCarpeta;
    }

    public void setListaCarpeta(ArrayList<carpeta> listaCarpeta) {
        this.listaCarpeta = listaCarpeta;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setArchivos(archivo a){
        listaArchivo.add(a);
    }

    @Override
    public String toString() {
        return "admin{" + "listaArchivo=" + listaArchivo + ", listaCarpeta=" + listaCarpeta + ", archivo=" + archivo + '}';
    }
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (archivo t : listaArchivo) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
    
    
    public void cargarArchivo() {
        try {            
            listaArchivo = new ArrayList();
            archivo temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto  = new ObjectInputStream(entrada);
                try {
                    while ((temp = (archivo) objeto.readObject()) != null) {
                        listaArchivo.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
}
