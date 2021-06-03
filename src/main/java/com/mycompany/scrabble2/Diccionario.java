package com.mycompany.scrabble2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*diccionario con palabras válidas para el
 * juego Scrabble.
 * Las palabras se leen de un archivo texto, en el cual cada palabra
 * está en una línea diferente
 * 
 * @author Helmuth Trefftz
 * @version 2021 04 27
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Diccionario
{
    public ArrayList <String> diccionario = new ArrayList<>();
    
    /**
     * Constructor
     * Se recibe el nombre del archivo del cual se van a leer las
     * palabras válidas para el juego.
     * Se organiza alfabeticamente usando el metodo sort 
     *
     * @param nombreArchivo Nombre del archivo a leer.
     */
    public void leerDiccionario(String nombreArchivo) {
        int cont = 0;
        try {
            Scanner in = new Scanner(new File(nombreArchivo));
            while(in.hasNext()) {
                String s = in.next();
                diccionario.add(s);
                cont++;
            }
      Collections.sort(diccionario);       
        } catch(FileNotFoundException e) {
            System.out.println("Ese archivo no se encuentra");
        }
        
        System.out.println("Lei " + cont + " palabras");
       //System.out.println(diccionario);
    }
    


    /**
     * Este método busca una palabra en el diccionario
     * 
     *el metodo hace uso de la busqueda binaria la cual divide el array en dos para que sea
     *mas facil de hacer la busqueda se usa el compareTo para saber si esta a la izquierda 
     *o derecha del array entonces esto hara la busqueda mas eficaz si se tiene una gran *cantidad de palabras
     *
     * @param palabraBuscada palabra que se va a buscar en el diccionario
     * @param arr arraylis de palabras donde la palabra va a ser buscada
     * @return true si la palabra está en el diccionario, false de lo
     * contrario.
     */
    public boolean buscarPalabras(String palabraBuscada, ArrayList<String> arr) {

        int izquierda = 0;
        int derecha = arr.size() - 1;


        while(izquierda <= derecha){
        int numeroMitad = (int) Math.floor((izquierda + derecha) / 2);
        String palabraMitad = arr.get(numeroMitad);

        int resultadoComparacion = palabraBuscada.compareTo(palabraMitad);

        if(resultadoComparacion == 0){
          return true;
        }

        if(resultadoComparacion < 0){
          derecha = numeroMitad - 1;
        } else {
          izquierda = numeroMitad + 1;
        }


        }
        return false;
    }

  /**
   * Retornar el arraylist donde estan todas
   * las palabras del diccionario
   * 
   * @return s Arraylist de diccionario
   */
    public ArrayList<String> getDicionario(){
      return diccionario;
    }
}
