package lab7p2_alberthgodoy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author godoy
 */
public class administrarPlantasvsZombis {
    private ArrayList lista = new ArrayList();
    private File archivo = null;

    public administrarPlantasvsZombis(String path) {
        archivo = new File(path);
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrarPlantvzZombis{" + "lista=" + lista + ", archivo=" + archivo + '}';
    }
    
    public void escribirArchivo() throws IOException {
        
    }

    public void cargarArchivo() {
       String[] archivoTe;
       lista = new ArrayList();
        if (archivo.exists()) {
            try {
                
            } catch (Exception e) {
            }
        }
    }
}