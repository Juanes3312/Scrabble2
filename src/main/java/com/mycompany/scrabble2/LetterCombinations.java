package com.mycompany.scrabble2;

import java.util.*;
/*
1. Tablero - Alberto
2. Faldero - Alfredo
3. Galena - Angela
4. Lacra - Clara
5. Deudora - Eduardo
6. Regador - Gerardo
7. Trecho - Hector
8. Arido - Dario
9. Bailes - Basile
10. Reclamo - Carmelo
11. Trama - Marta
12. Meato - Mateo
13. Camión - Mónica
14. Oscilan - Nicolás
15. Corrida - Ricardo
16. Saunas - Susana 
17. Aretes - Teresa
18. Invocare - Veronica
19. Riesgo - Sergio
20. Ebanistas - Sebastian
 */

/**
 * Esta clase genera posibles palabras a partir de las letras que el usario
 * tiene en su mano
 * 
 * @author Helmuth Trefftz
 */
public class LetterCombinations {
  UsedLetter[] usedLetters;
  int longitud;
  Diccionario diccionario;

  /**
   * En el constructor debe recibir un diccionario con las palabras válidas
   */
  public LetterCombinations(Diccionario diccionario) {
    this.diccionario = diccionario;
  }

  /**
   * Recibir las letras que el usuario tiene en la mano y guardarlas en el arreglo
   * usedLetters
   * 
   * @param s Letras que el usuario tiene en su mano
   */
  public void init(String s) {
    usedLetters = new UsedLetter[s.length()];
    for (int i = 0; i < s.length(); i++) {
      usedLetters[i] = new UsedLetter(s.charAt(i), false);
    }
  }

  ArrayList<Palabra> PalabrasArray = new ArrayList<Palabra>();
  ArrayList<String> PalabrasArrayString = new ArrayList<String>();
  Palabra p1;

  /**
     * Método que genera las posibles variaciones con 
     * las letras que el usuario tiene en la mano.
     * Cada variación se busca en el diccionario para saber si
     * es válida. Tambien genera el puntaje de cada palabra que sea valida
     * las letras dadas y guarda el puntaje en un arraylist
     * 
     * 
     * @param s String que se va conformando hasta el momento.
     */
  public void receiveString(String s) {
    if (s.length() == longitud) {
      if (diccionario.buscarPalabras(s, diccionario.getDicionario())) {
        String palabra = s.toLowerCase();
        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {

          char Letra = palabra.charAt(i);

          if (Letra == 'a' || Letra == 'e' || Letra == 'i' || Letra == 'n' || Letra == 's' || Letra == 't'
              || Letra == 'u' || Letra == 'o') {
            contador = contador + 1;
          } else if (Letra == 'd' || Letra == 'g') {
            contador = contador + 2;
          } else if (Letra == 'b' || Letra == 'm' || Letra == 'p') {
            contador = contador + 3;
          } else if (Letra == 'f' || Letra == 'v' || Letra == 'y') {
            contador = contador + 4;
          } else if (Letra == 'q') {
            contador = contador + 5;
          } else if (Letra == 'c') {
            if (i == 0) {
              int sig = palabra.charAt(i + 1);
              if (sig == 'h') {
                contador = contador + 5;
              } else if (sig != 'h') {
                contador = contador + 3;
                continue;
              }
            } else if (i != 0 && i < palabra.length()) {
              int sig = palabra.charAt(i + 1);

              if (sig == 'h') {
                contador = contador + 5;
              } else {
                contador = contador + 3;
              }
            } else if (i == palabra.length()) {
              contador = contador + 3;
            }
          } else if (Letra == 'l') {
            if (i == 0) {
              int sig = palabra.charAt(i + 1);
              if (sig == 'l') {
                contador = contador + 8;
              } else if (sig != 'l') {
                contador = contador + 1;
                continue;
              }
            } else if (i != 0 && i < palabra.length()) {
              int sig = palabra.charAt(i + 1);
              int atr = palabra.charAt(i - 1);
              if (sig == 'l') {
                contador = contador + 8;
              } else if (atr == 'l') {
                continue;
              } else {
                contador = contador + 1;
              }
            } else if (i == palabra.length()) {
              int atr = palabra.charAt(i - 1);
              if (atr == 'l') {
                continue;
              } else if (atr != 'l') {
                contador = contador + 1;

              }
            }
          } else if (Letra == 'r') {

            if (i == 0) {
              int sig = palabra.charAt(i + 1);
              if (sig == 'r') {
                contador = contador + 8;
              } else if (sig != 'r') {
                contador = contador + 1;
                continue;
              }
            } else if (i != 0 && i < palabra.length()) {
              int sig = palabra.charAt(i + 1);
              int atr = palabra.charAt(i - 1);
              if (sig == 'r') {
                contador = contador + 8;
              } else if (atr == 'r') {
                continue;
              } else {
                contador = contador + 1;
              }
            } else if (i == palabra.length()) {
              int atr = palabra.charAt(i - 1);
              if (atr == 'r') {
                continue;
              } else if (atr != 'r') {
                contador = contador + 1;

              }
            }
          } else if (Letra == 'j') {
            contador = contador + 8;
          } else if (Letra == 'z') {
            contador = contador + 10;
          } else if (Letra == 'h') {

            if (i == 0) {
              contador = contador + 4;

            } else if (i != 0 && i < palabra.length()) {
              int atr = palabra.charAt(i - 1);
              if (atr == 'c') {
                continue;
              } else {
                contador = contador + 4;
              }
            } else if (i == palabra.length()) {
              contador = contador + 4;
            }
          }
        }
        if (PalabrasArray.size() == 0) {
          PalabrasArrayString.add(s);
          Collections.sort(PalabrasArrayString);
          p1 = new Palabra(s, contador);
          PalabrasArray.add(p1);
        } else if (PalabrasArray.size() >= 1) { 
          if (diccionario.buscarPalabras(s, PalabrasArrayString) == false) {
            p1 = new Palabra(s, contador);
            PalabrasArray.add(p1);
            PalabrasArrayString.add(s);
            Collections.sort(PalabrasArrayString);
          }
        }
      }
      return;
    }
    for (int i = 0; i < usedLetters.length; i++) {
      if (!usedLetters[i].used) {
        usedLetters[i].used = true;
        receiveString(s + usedLetters[i].letter);
        usedLetters[i].used = false;
      }
    }

  }
  
  /**
   * Este metodo retorna un arraylist de palabras 
   * @return PalabrasArray
   */
 
  public ArrayList<Palabra> getPalabrasArrayString(){
      return PalabrasArray;
}
   /**
   * Este método imprime las 10 mejores palabras o menos dependiendo de su
   * longitud
   */
  public void mejores10() {
    Collections.sort(PalabrasArray, new OrganizarPorPuntaje());
    if (PalabrasArray.size() < 10) {
      int tam = PalabrasArray.size();
      for (int i = 0; i < tam; i++) {
        System.out.println(PalabrasArray.get(i));
      }
    } else {
      for (int i = 0; i < 10; i++) {
        System.out.println(PalabrasArray.get(i));
      }
    }

  }

  /**
   * Este método invoca el método receiveString para que genere palabras de
   * longitud 2, 3, ... n (número de letras que el usuario tiene en su mano).
   * 
   * @param letrasDeMiMano String con las letras que el usuario tiene en la mano.
   */
  public void crearPalabras(String letrasDeMiMano) {
    String letras = letrasDeMiMano;
    init(letras);
    for (longitud = 2; longitud <= letras.length(); longitud++) {
      receiveString("");
    }
  }
}