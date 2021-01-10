package hanged;
/**
 *  Simulador de juego del ahorcado (adivina la palabra oculta).
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class Hanged 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //==============================PREPARACIÓN====================================
        Board.drawBanner(); //Dibuja el banner de bienvenida.
        Word.setWord(); //El sistema elige una palabra aleatoria.
        System.out.println("La palabra secreta es: " + Word.getWord()); //TEST ONLY
        Board.drawBoard();  //Dibuja el tablero con los espacios ocultos.
        
        //==============================EJECUCIÓN======================================
        do{
            GameManager.PlayTurn(); //Ejecuta el turno del jugador.
            Board.drawBoard();  //Dibuja el tablero en su estado actual.
            System.out.println();   //Salto de línea.
        }while(GameManager.isFinished()==false && GameManager.gameOver()==false);
        
        //===============================RESULTADOS===================================
        if (GameManager.gameOver())
        {
            System.out.println("Has perdido...");
        }
        else
        {
            System.out.println("¡Ganaste!");
        }
    }
}
