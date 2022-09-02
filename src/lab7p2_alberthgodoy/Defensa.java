
package lab7p2_alberthgodoy;

/**
 *
 * @author godoy
 */
public class Defensa extends Planta{
    private double altura;
    private int nivelDureza;
    private double peso;

    public Defensa() {
    }

    public Defensa(double altura, int nivelDureza, double peso, String nombre, int ataque, int vida) {
        super(nombre, ataque, vida);
        this.altura = altura;
        this.nivelDureza = nivelDureza;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getNivelDureza() {
        return nivelDureza;
    }

    public void setNivelDureza(int nivelDureza) {
        this.nivelDureza = nivelDureza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Defensa{" + "altura=" + altura + ", nivelDureza=" + nivelDureza + ", peso=" + peso + '}';
    }
    
    
        
}
