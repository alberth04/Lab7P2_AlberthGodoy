
package lab7p2_alberthgodoy;

import java.awt.Color;

/**
 *
 * @author godoy
 */
public class Disparo extends Planta{
    private String nombreProyectil;
    private String color;

    public Disparo() {
    }

    public Disparo(String nombreProyectil, String color, String nombre, int ataque, int vida) {
        super(nombre, ataque, vida);
        this.nombreProyectil = nombreProyectil;
        this.color = color;
    }

    public String getNombreProyectil() {
        return nombreProyectil;
    }

    public void setNombreProyectil(String nombreProyectil) {
        this.nombreProyectil = nombreProyectil;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Disparo{" + "nombreProyectil=" + nombreProyectil + ", color=" + color + '}';
    }
    
    
}
