package lab7p2_samuelzorto;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminCarpeta {

    private ArrayList<carpeta> listaCarpeta = new ArrayList();
    private File archivo = null;

    public adminCarpeta() {
    }

    public adminCarpeta(String path) {
        archivo = new File(path);
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
    
    public void setCarpetas(carpeta a){
        listaCarpeta.add(a);
    }

    @Override
    public String toString() {
        return "adminCarpeta{" + "listaCarpeta=" + listaCarpeta + ", archivo=" + archivo + '}';
    }

    public void cargarCarpeta() {
        try {
            listaCarpeta = new ArrayList();
            carpeta temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (carpeta) objeto.readObject()) != null) {
                        listaCarpeta.add(temp);
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

    public void escribirCarpeta() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (carpeta t : listaCarpeta) {
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
}
