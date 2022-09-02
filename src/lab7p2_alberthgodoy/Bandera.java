
package lab7p2_alberthgodoy;

import java.awt.Color;

/**
 *
 * @author godoy
 */
public class Bandera {
    private Color color;
    private String direccion;

    public Bandera() {
    }

    public Bandera(Color color, String direccion) {
        this.color = color;
        this.direccion = direccion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Bandera{" + "color=" + color + ", direccion=" + direccion + '}';
    }
    
}
