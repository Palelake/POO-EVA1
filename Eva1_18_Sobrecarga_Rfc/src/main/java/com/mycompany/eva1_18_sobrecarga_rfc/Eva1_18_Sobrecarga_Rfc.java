/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_18_sobrecarga_rfc;

/**
 *
 * @author Ricardo Hernandez
 */
public class Eva1_18_Sobrecarga_Rfc {

    public static void main(String[] args) {
        String rfc = generarRFC("Ricardo","HErnandez","Ruiz",2002, 07, 15);
        System.out.println(rfc);
    }
    
    public static String generarRFC(String nombre, String apPaterno, String apMaterno, int año, int mes, int dia){
    String ap= apPaterno.charAt(0)+" ";
            String apPa= apPaterno.charAt(1)+" ";

        String apMa= apMaterno.charAt(0)+" ";
        String nom= nombre.charAt(0)+" ";
        String rfc= ap+apPa+ apMa+ nom+ año+ mes+ dia+ "";

    return rfc;
    }
 public static String generarRFC (String nombre, String apPaterno, int año, int mes, int dia){
    String ap= apPaterno.charAt(0)+" ";
            String apPa= apPaterno.charAt(1)+" ";

        String nom= nombre.charAt(0)+" ";
        String rfc= ap+apPa+ nom+ año+ mes+ dia+ "";

    return rfc;
    }
  public static String generarRFC(String nombre, int año, int mes, int dia){
   
        String nom= nombre.charAt(0)+" ";
        String rfc=  nom+ año+ mes+ dia+ "";

    return rfc;
    }
}
