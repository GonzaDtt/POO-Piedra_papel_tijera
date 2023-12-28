
/**
 * Clase Jugador del juego 
 * @author Duette Gonzalo
 */
public class Jugador {
    private int Puntos;
    protected int Eleccion;

    public int getPuntos() {
        return Puntos;
    }

    public void setPuntos(int Puntos) {
        this.Puntos = Puntos+1;
    }
    
    public abstract class Jugar{
        
    }
}
