
package lab7p2_alberthgodoy;

/**
 *
 * @author godoy
 */
public class Explosiva extends Planta{
    private int magnitudExplosion;

    public Explosiva() {
    }

    public Explosiva(int magnitudExplosion, String nombre, int ataque, int vida) {
        super(nombre, ataque, vida);
        this.magnitudExplosion = magnitudExplosion;
    }

    public int getMagnitudExplosion() {
        return magnitudExplosion;
    }

    public void setMagnitudExplosion(int magnitudExplosion) {
        this.magnitudExplosion = magnitudExplosion;
    }

    @Override
    public String toString() {
        return "Explosiva{" + "magnitudExplosion=" + magnitudExplosion + '}';
    }
    
}
