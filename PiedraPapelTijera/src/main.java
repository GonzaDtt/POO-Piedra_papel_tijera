
/**
 * Clase Ejecutable del juego Piedra-Papel-Tijera
 * @author Duette Gonzalo
 */
public class main {
    public static void main(String[] args) {
        Humano H = new Humano();
        Computadora R = new Computadora();
        Jugador J = new Jugador();
        int hGana = 0, cGana = 0;
        
        do{
            H.Jugar();
            R.Jugar();
            
            //Validacion de la regla del juego
            if(H.Eleccion == 0){
                if(R.Eleccion == 1){
                    System.out.println("¡GANA UN PUNTO PC!");
                    cGana = cGana+1; 
                }
                else if(R.Eleccion == 2){
                    System.out.println("¡GANA UN PUNTO HUMANO!");
                    hGana = hGana+1;
                }
                else{
                    System.out.println("¡EMPATE!");
                }
                System.out.println("PuntosPC: " +cGana);
                System.out.println("PuntosHumano:" +hGana);
            }
            else if(H.Eleccion == 1){
                if(R.Eleccion == 2){
                    System.out.println("¡GANA UN PUNTO PC!");
                    cGana = cGana+1; 
                }
                else if(R.Eleccion == 0){
                    System.out.println("¡GANA UN PUNTO HUMANO!");
                    hGana = hGana+1;
                }
                else{
                    System.out.println("¡EMPATE!");
                }
                System.out.println("PuntosPC: " +cGana);
                System.out.println("PuntosHumano:" +hGana);
            }
            else{
                if(R.Eleccion == 0){
                    System.out.println("¡GANA UN PUNTO PC!");
                    cGana = cGana+1; 
                }
                else if(R.Eleccion == 1){
                    System.out.println("¡GANA UN PUNTO HUMANO!");
                    hGana = hGana+1;
                }
                else{
                    System.out.println("¡EMPATE!");
                }
                System.out.println("PuntosPC: " +cGana);
                System.out.println("PuntosHumano:" +hGana);
            }
            
            
            //Eleccion del Humano
            if(H.Eleccion == 0){
                System.out.println("La persona eligio Piedra");
            }
            else if(H.Eleccion == 1){
                System.out.println("La persona eligio Papel");
            }
            else{
                System.out.println("La persona eligio Tijera");
            }

            //Eleccion de la Computadora
            if(R.Eleccion == 0){
                System.out.println("La computadora eligio Piedra\n");
            }
            else if(R.Eleccion == 1){
                System.out.println("La computadora eligio Papel\n");
            }
            else{
                System.out.println("La computadora eligio Tijera\n");
            }
            
            //Resultados
            if(cGana == 3){
                System.out.println("\n[PARTIDA GANADA POR LA COMPUTADORA]");
                System.out.println("Computadora "+cGana+ " - Humano "+hGana);
                J.setPuntos(cGana);
            }
            else if(hGana == 3){
                System.out.println("\n[PARTIDA GANADA POR EL HUMANO]");
                System.out.println("Humano "+hGana+ " - Computadora "+cGana);
                J.setPuntos(hGana);
            }
            
        }while(J.getPuntos() != 4);
    }
}
