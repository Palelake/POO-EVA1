/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_16_sobrecarga_2;

/**
 *
 * @author Ricardo Hernandez
 */
public class Eva1_16_Sobrecarga_2 {

    public static void main(String[] args) {
        System.out.println("suma: "+ suma(4,5));
        System.out.println("suma: "+ suma(4.0,5.0));
        suma();
        

        
        
         }

public static int suma(int val1, int val2){
return val1 + val2; 
}
public static double suma (double val1, double val2){
return val1 + val2; 
}
public static String suma (String val1, String val2){
return val1 + val2; 
}
public static void suma(){
System.out.println("Metodo sin parametros");
        

}

}
