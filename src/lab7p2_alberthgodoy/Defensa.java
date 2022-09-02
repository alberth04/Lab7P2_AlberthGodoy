
package lab7p2_alberthgodoy;

/**
 *
 * @author godoy
 */
public class Defensa extends Planta{
    private int altura;
    private int nivelDureza;
    private int peso;

    public Defensa() {
    }

    public Defensa(int altura, int nivelDureza, int peso, String nombre, int ataque, int vida) {
        super(nombre, ataque, vida);
        this.altura = altura;
        this.nivelDureza = nivelDureza;
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getNivelDureza() {
        return nivelDureza;
    }

    public void setNivelDureza(int nivelDureza) {
        this.nivelDureza = nivelDureza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Defensa{" + "altura=" + altura + ", nivelDureza=" + nivelDureza + ", peso=" + peso + '}';
    }
    
    
        
}
