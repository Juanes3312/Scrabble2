
package com.mycompany.scrabble2;

import java.util.Comparator;

/**
 * Clase nos Compara Contiene el metodo para 
 * comparar las palabras segun su valor
 * 
 * @author Juan Esteban Jaramillo, Samuel Palacio, Santiago Rodriguez 
 * @version 2021 05 11
 */
public class OrganizarPorPuntaje implements Comparator<Palabra> {
    /** 
    * Este metodo recoge dos palabras y las compara entre si
    * @param a esta palabra se extrae del array PalabrasArray
      @param b esta palabra se extrae del array PalabrasArray
    * @return la resta de los puntos de a,b
    */
    public int compare(Palabra a, Palabra b) {
        return b.getPuntaje() - a.getPuntaje();
      }
}
