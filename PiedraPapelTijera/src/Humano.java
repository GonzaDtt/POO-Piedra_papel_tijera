import java.util.Scanner;

/**
 * Clase Humano del juego
 * @author Duette Gonzalo
 */
public class Humano extends Jugador{
    Scanner lector = new Scanner(System.in);
    
    public void Jugar(){
        System.out.println("Juega usted:");
        System.out.println("0 = Piedra"); //0-0 EMPATE 0-1 GANA PC 0-2 GANA HUMANO
        System.out.println("1 = Papel"); //1-1 EMPATE 1-2 GANA PC 1-0 GANA HUMANO
        System.out.println("2 = Tijera"); //2-2 EMPATE 2-0 GANA PC 2-1 GANA HUMANO
        
        Eleccion = lector.nextInt();
    }
}
