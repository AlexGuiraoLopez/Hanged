package hanged;

/**
 * Palabra escondida que el jugador debe adivinar.
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class Word 
{
    public static String [] wordList = {"gato", "armario", "software", "hardware", "manzana"}; //Lista de palabras.
    public static String currentWord;   //Palabra en juego.
    
    /**
     * Escoge aleatóriamente una palabra para que sea la que deba adivinar el jugador.
     */
    public static void setWord()
    {
        //Inicializa la palabra en juego con una aleatoria de la lista.
        currentWord = wordList[(int)(Math.random()*wordList.length)];   
    }
    
    /**     
     * Getter de la palabra que el jugador debe adivinar.
     * @return La palabra a adivinar.
     */
    public static String getWord()
    {
        return currentWord;
    }
}
