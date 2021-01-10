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
        Board.drawBanner();
        Word.setWord();
        System.out.println("La palabra secreta es: " + Word.getWord());
        Board.drawBoard();
        
        //==============================EJECUCIÓN======================================
        do{
            GameManager.PlayTurn();
            Board.drawBoard();
            System.out.println();
            
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
