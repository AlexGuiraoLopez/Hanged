/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringUtil;

/**
 * 
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class StringUtil 
{
    /**
     * Busca cuantas veces aparece una letra en una palabra.
     * @param _word palabra en la que buscar.
     * @param _letter letra a encontrar.
     * @return número de apariciones.
     */
    public static int isInString(String _word, char _letter)
    {
        int letterCount=0; //Contador de veces que la letra aparece en la palabra.
        
        for (int i = 0; i<_word.length();i++)
        {
            if (_word.charAt(i)==Character.toLowerCase(_letter))
            {
                letterCount++;
            }
        }
        return letterCount;
    }
    
    /**
     * Encuentra la primera posición de una palabra en la que aparece una letra concreta.
     * @param _word palabra en la que buscar.
     * @param _letter letra que encontrar.
     * @return posición en la que se encuentra la letra (Si no se encuentra es -1)
     */
    public static int firstPos (String _word, char _letter)
    {
        int letterPos=-1; //Posición en la que se ha encontrado la palabra.
        int counter=0;
        boolean found=false;    //Comprobante de si se ha encontrado.
        
        while(counter<_word.length()&&!found)
        {
            if (_word.charAt(counter)==Character.toLowerCase(_letter))
            {
                letterPos=counter;
                found=true;
            }
            counter++;
        }
        
        return letterPos;
    }
    
    /**
     * Encuentra la primera posición de una palabra en la que aparece una letra concreta.
     * @param _word palabra en la que buscar.
     * @param _letter letra que encontrar.
     * @return posición en la que se encuentra la letra (Si no se encuentra es -1)
     */
    public static int lastPos (String _word, char _letter)
    {
        int letterPos=-1; //Posición en la que se ha encontrado la palabra.
        
        for (int i = 0; i<_word.length();i++)
        {
            if (_word.charAt(i)==_letter)
            {
                letterPos=i;
            }
        }
        return letterPos;
    }
    
    /**
     * Detecta en que posiciones de una palabra aparece una letra concreta.
     * @param _word palabra a buscar.
     * @param _letter letra que buscar.
     * @return vector de posiciones en las que aparece o no la letra 
     * Valor TRUE si aparece y valor del índice para la posición en la que aparece.
     */
    public static boolean [] allPos(String _word, char _letter)
    {
        boolean [] foundPos = new boolean [_word.length()]; //Posiciones con la letra encontrada.
        
        for (int i = 0; i<_word.length();i++)
        {
            if (_word.charAt(i)==Character.toLowerCase(_letter))
            {
                foundPos[i]=true;
            }
        }
        
        return foundPos;
    }
}
