
/**
 * Clase Computadora del juego
 * @author Duette Gonzalo
 */

public class Computadora extends Jugador{
    int numero;
       
    public void Jugar(){
        numero = (int)(Math.random()*3+0);
        Eleccion = numero;
    }
}

