
package lab7p2_alberthgodoy;

/**
 *
 * @author godoy
 */
public class Planta {
    private String nombre;
    private int ataque;
    private int vida;
    private String rango;
    

    public Planta(String nombre, int ataque, int vida) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
    }

    public Planta() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Plantas:" + "nombre=" + nombre + ", ataque=" + ataque + ", vida=" + vida + '}';
    }
    
    
}
