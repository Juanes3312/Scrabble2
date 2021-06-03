package com.mycompany.scrabble2;
 
/**
 * Esta clase nos creara objetos de las palabras posibles con su respectivo 
 * puntaje
 * 
 * @author Juan Esteban Jaramillo, Samuel Palacio, Santiago Rodriguez 
 * @version 2021 05 11
 */
public class Palabra{
  private String palabra;
  private int puntaje = 0;
  
/**
   * Este constructor recibe pal,pun asignara los valores a los atributos 
   * de palabra y puntaje
   * 
   * 
   */
  public Palabra(String pal, int pun){
    palabra = pal;
    puntaje = pun;
  }

   /**
     * Método que retorna el puntaje de cada palabra
     * 
     * 
     * @return puntaje
     */
  public int getPuntaje(){
    return puntaje;
  }

   /**
     * Método que retorna la palabra
     * 
     * 
     * @return palabra la palabra desea por algo
     */
  public String getPalabra(){
    return palabra;
  }

  /**
     * Método que retorna la palabra y el puntaje juntos
     * 
     * 
     * @return de forma string la palabra con su puntaje
     */
  public String toString(){
    return this.palabra + ": " + this.puntaje;
  }

}