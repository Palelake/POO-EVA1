/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva_1_4_tv;

/**
 *
 * @author Ricardo Hernandez
 */
public class Tv {
 private int volumen;
 private int canal;
 private boolean poder;
 //constructores
public Tv(){//constructor deafault
volumen = 2;
canal = 98;
poder = false;//apagado

}
 //interfaz metodos
//apagar y encender
 public void cambiarEstadoPoder(){
//verificar 
 if(poder == true){
 poder = false;
 System.out.println("Apagando pantalla");
 } else {
     poder = true;
 System.out.println("Encendiendo Pantalla"); 
 }

 }
 //volumen
 public void subirVolumen(){
if (poder){// la tele esta prendida
if(volumen < 100){
     volumen ++;
System.out.println("Volumen: "+volumen);
}
 }
 }
 public void bajarVolumen(){
if (poder == true){
    if(volumen > 0){

     volumen --;
System.out.println("Volumen: "+volumen);
    }
}
 }

 //volumen
 public void subirCanal(){
if (poder){// la tele esta prendida
         canal ++;

if(canal > 100){
    canal = 0;
}
System.out.println("canal: "+canal);
 
}

 }
 public void bajarCanal(){
if (poder == true){
         canal --;

    if(canal < 0){
        
canal = 100;
    }
System.out.println("canal: "+canal);
}
 
 }
}
