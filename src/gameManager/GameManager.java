package gameManager;

import board.Board;
import input.Input;
import hanged.Word;
import stringUtil.StringUtil;

/**
 * Gestiona el desarrollo del juego.
 * @author Alex Guirao López <alexguiraolopez@gmail.com>
 */
public class GameManager 
{
    final static int MAX_MISTAKES = 5;  //Número máximo de errores permitido.
    
    //Posiciones de la palabra descubiertas.
    public static boolean[] hiddenLetter = new boolean [Word.getWord().length()];
    
    public static int mistakes=0; //Fallos del jugador.
      
    /**
     * Getter del estado de una letra de la palabra
     * @param _index posición de la letra dentro de la palabra.
     * @return (true) si esa letra ha sido adivinada por el usuario.
     */
    public static boolean getHiddenLetter(int _index)
    {
        return hiddenLetter[_index];
    }
    
    /**
     * Ejecuta un turno de juego.
     * @param _word palabra en juego.
     */
    public static void PlayTurn(String _word)
    {
        System.out.print("Escribe una letra: ");
        char letter = Input.readChar();
        
        if (StringUtil.isInString(_word, letter)==0)
        {
            mistakes++; //Añade un fallo al contador general.
            Board.drawHanged(); //Dibuja el ahorcado para que el jugador pueda ver el estado de su futura muerte.
        }
        else
        {
            for (int i = 0; i<_word.length();i++)
            {
                if (_word.charAt(i)==letter)
                {
                    hiddenLetter[i]=true;  //Se ha encontrado la letra en la posición actual de la palabra.
                }
            }
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
        boolean isFinished=true;
        int counter=0;
        
        while(isFinished&&counter<hiddenLetter.length)
        {
            if (hiddenLetter[counter]==true)
            {
                counter++;
            }
            else
            {
                isFinished=false;
            }
        }
    
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
