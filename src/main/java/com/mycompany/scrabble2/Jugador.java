/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scrabble2;

/**
 * Esta clase crea un jugador con su nombre y su puntaje
 * @author Juan Esteban Jaramillo, Samuel Palacio, Santiago Rodriguez 
 * @version 2021 05 29
 */
 public class Jugador{
 private String nombre;
 private int puntaje =0;
    
 /**
  * Este es el constructor del jugador que asigna su respectivo nombre
  * @param n es el nombre que se asiga al jugador
  */
 public Jugador(String n){
    nombre = n;
 }
 
 /**
  * Este metodo va sumando el puntaje de cada jugador
  * @param n es el puntaje que se le asigna al judador
  * 
  */
 public void setPuntaje(int n){
     this.puntaje = puntaje + n;
 }
 
 /**
  * Este metodo retorna el puntaje de cada jugador
  * @return puntaje del jugador
  */
 public int getPuntaje(){
     return puntaje;
 }
}
