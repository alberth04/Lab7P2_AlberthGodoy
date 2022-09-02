package lab7p2_alberthgodoy;

import java.util.ArrayList;

/**
 *
 * @author godoy
 */
public class Cargado extends Zombi{
    private double size;
    private int edad;
    private int nivelEnojo;
    private ArrayList plantasComidas = new ArrayList();

    public Cargado(double size, int edad, int nivelEnojo, String nombre, int ataque, int vida) {
        super(nombre, ataque, vida);
        this.size = size;
        this.edad = edad;
        this.nivelEnojo = nivelEnojo;
    }

    public Cargado() {
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNivelEnojo() {
        return nivelEnojo;
    }

    public void setNivelEnojo(int nivelEnojo) {
        this.nivelEnojo = nivelEnojo;
    }

    public ArrayList getPlantasComidas() {
        return plantasComidas;
    }

    public void setPlantasComidas(ArrayList plantasComidas) {
        this.plantasComidas = plantasComidas;
    }

    @Override
    public String toString() {
        return "Cargado{" + "size=" + size + ", edad=" + edad + ", nivelEnojo=" + nivelEnojo + ", plantasComidas=" + plantasComidas + '}';
    }

    
    
}
