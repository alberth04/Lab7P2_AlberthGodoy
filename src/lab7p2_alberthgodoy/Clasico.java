package lab7p2_alberthgodoy;

/**
 *
 * @author godoy
 */
public class Clasico extends Zombi{
    private int expy;
    private Bandera bandera;

    public Clasico() {
    }

    public Clasico(int expy, Bandera bandera, String nombre, int ataque, int vida) {
        super(nombre, ataque, vida);
        this.expy = expy;
        this.bandera = bandera;
    }
    
    
    public int getExpy() {
        return expy;
    }

    public void setExpy(int expy) {
        this.expy = expy;
    }

    public Bandera getBandera() {
        return bandera;
    }

    public void setBandera(Bandera bandera) {
        this.bandera = bandera;
    }

    @Override
    public String toString() {
        return "Clasico{" + "expy=" + expy + ", bandera=" + bandera + '}';
    }
    
    
}
