package hanged;
/**
 * Tablero del juego.
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class Board 
{
    /**
     * Dibuja el tablero del juego.
     */
    public static void drawBoard()
    {
        for (int i = 0; i<Word.getWord().length(); i++)
        {
            if (GameManager.getGuess(i)==true)
            {
                System.out.print(" " + Word.getWord().charAt(i) + " ");
            }
            else
            {
                System.out.print(" _ ");   
            }
        }
    }
    
    public static void drawHanged()
    {
        switch (GameManager.getMistakes())
        {
            case 1:
                System.out.println("  _______");
                System.out.println(" |/     |");
                System.out.println(" | ");
                System.out.println(" | ");
                System.out.println(" | ");
                System.out.println(" | ");
                System.out.println("_|___");
                break;
            case 2:
                System.out.println("  _______");
                System.out.println(" |/     |");
                System.out.println(" |     (_)");
                System.out.println(" | ");
                System.out.println(" | ");
                System.out.println(" | ");
                System.out.println("_|___");
                break;
            case 3:
                System.out.println("  _______");
                System.out.println(" |/     |");
                System.out.println(" |     (_)");
                System.out.println(" |     \\|//");
                System.out.println(" | ");
                System.out.println(" | ");
                System.out.println("_|___");
                break;
            case 4:
                System.out.println("  _______");
                System.out.println(" |/     |");
                System.out.println(" |     (_)");
                System.out.println(" |     \\|//");
                System.out.println(" |      |");
                System.out.println(" | ");
                System.out.println("_|___");
                break;
            case 5:
                System.out.println("  _______");
                System.out.println(" |/     |");
                System.out.println(" |     (_)");
                System.out.println(" |     \\|//");
                System.out.println(" |      |");
                System.out.println(" |    // \\");
                System.out.println("_|___");
                break;  
        }
    }
    
    public static void drawBanner(){
      
        System.out.println("    |/|               ╔═════════╗");
        System.out.println("    |/|               ║    AHORCADO   ║  ");
        System.out.println("    |/|               ╚═════════╝");
        System.out.println("    |/|");
        System.out.println("    |/| /¯)          ╔═════════════════╗");
        System.out.println("    |/|/\\/           ║  Intenta adivinar las       ║");
        System.out.println("    |/|/\\/           ║  palabras ocultas en        ║");
        System.out.println("    (¯¯¯)            ║  el panel inferior.         ║");
        System.out.println("    (¯¯¯)            ╚═════════════════╝");
        System.out.println("    (¯¯¯)");
        System.out.println("    (¯¯¯)");
        System.out.println("    /¯¯/\\");
        System.out.println("   / ,^./\\");
        System.out.println("  / /   \\/\\");
        System.out.println(" / /     \\/\\");
        System.out.println("( (       )/)");
       
        System.out.println("| |       |/|");
        System.out.println("| |       |/|");
        System.out.println("( (       )/)");
        System.out.println(" \\ \\     / /");
        System.out.println("  \\ `---' /");
        System.out.println("   `-----' ");
    }
}
