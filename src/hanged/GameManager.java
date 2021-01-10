package hanged;
/**
 * Gestiona el desarrollo del juego.
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class GameManager 
{
    //Posiciones de la palabra descubiertas.
    public static boolean[] guess = new boolean [Word.getWord().length()];
    
    public static int mistakes=0; //Fallos del jugador.
      
    public static boolean getGuess(int _index)
    {
        return guess[_index];
    }
    
    public static void PlayTurn()
    {
        System.out.print("Escribe una letra: ");
        char letter = Input.readChar();
        int mistakeCount=0;
        
        for (int i = 0; i<Word.getWord().length();i++)
        {
            if (Word.getWord().charAt(i)==letter)
            {
                guess[i]=true;
            }
            else
            {
                mistakeCount++;
            }
        }
        
        if (mistakeCount == Word.getWord().length())
        {
            mistakes++;
            Board.drawHanged();
        }
    }
    
    public static boolean gameOver()
    {
        return getMistakes()==5;
    }
    
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
        }while(counter<Word.getWord().length()&&guess[counter]==true );
        
        return isFinished;
    }
    
    public static int getMistakes()
    {
        return mistakes;
    }
}
