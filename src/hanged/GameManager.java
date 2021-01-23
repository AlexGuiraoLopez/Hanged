package hanged;
/**
 * Gestiona el desarrollo del juego.
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class GameManager 
{
    final static int MAX_MISTAKES = 5;  //Número máximo de errores permitido.
    
    //Posiciones de la palabra descubiertas.
    public static boolean[] guess = new boolean [Word.getWord().length()];
    
    public static int mistakes=0; //Fallos del jugador.
      
    /**
     * Getter del estado de una letra de la palabra
     * @param _index posición de la letra dentro de la palabra.
     * @return (true) si esa letra ha sido adivinada por el usuario.
     */
    public static boolean getGuess(int _index)
    {
        return guess[_index];
    }
    
    /**
     * Ejecuta un turno de juego.
     */
    public static void PlayTurn()
    {
        System.out.print("Escribe una letra: ");
        char letter = Input.readChar();
        int mistakeCount=0; //Contador de errores del turno actual.
        
        for (int i = 0; i<Word.getWord().length();i++)
        {
            if (Word.getWord().charAt(i)==letter)
            {
                guess[i]=true;  //Se ha encontrado la letra en la posición actual de la palabra.
            }
            else
            {
                mistakeCount++; //No se ha encontrado la letra y se suma uno al contador de errores del turno actual.
            }
        }
        
        /*Si el contador de errores actual equivale a lo que mide la palabra quiere decir que
        * la letra seleccionada por el jugador no está en ninguna de las de la palabra.
        */
        if (mistakeCount == Word.getWord().length())
        {
            mistakes++; //Añade un fallo al contador general.
            Board.drawHanged(); //Dibuja el ahorcado para que el jugador pueda ver el estado de su futura muerte.
        }
    }
    
    /**
     * Comprobante de game over.
     * @return (true) si el número de fallos ha llegado al máximo permitido.
     */
    public static boolean gameOver()
    {
        return getMistakes()==MAX_MISTAKES;
    }
    
    /**
     * Comprobante de final de juego (si el jugador gana).
     * @return (true) si el juego ha terminado.
     */
    public static boolean isFinished()
    {
        boolean isFinished=false;
        int counter=0;
        
        do{
            if (counter == guess.length-1)
            {
                isFinished=true;
            }
            counter++;
        }while(counter<Word.getWord().length()&&guess[counter-1]==true );
        
        return isFinished;
    }
    
    /**
     * Getter del número de errores que ha cometido el jugador hasta ahora durante la partida.
     * @return número de fallos actual.
     */
    public static int getMistakes()
    {
        return mistakes;
    }
}
