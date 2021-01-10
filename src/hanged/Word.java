package hanged;

/**
 * Palabra escondida que el jugador debe adivinar.
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class Word 
{
    public static String [] wordList = {"gato", "armario", "software", "hardware", "manzana"}; //Lista de palabras.
    public static String currentWord;   //Palabra en juego.
    
    public static void setWord()
    {
        //Inicializa la palabra en juego con una aleatoria de la lista.
        currentWord = wordList[(int)(Math.random()*wordList.length)];   
    }
    
    public static String getWord()
    {
        return currentWord;
    }
}
