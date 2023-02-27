/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_califas;

/**
 *
 * @author Ricardo Hernandez
 */
public class Eva1_12_Califas {

    public static void main(String[] args) {
String cali;
cali = califas(85);
 System.out.println("califa para 85: "+ cali);
  System.out.println("califa para 70: "+ califas(70));
califas(100);//se ignora
        }
 public static String califas(int califa){
            String resu ="";
        if( (califa >= 91) && (califa <=100) ){
        //A 
        resu ="A";
        }else if ( (califa >= 81) && (califa <=90) ){
        resu ="B";

        
        
        }else if ( (califa >= 81) && (califa <=90) ){

                resu ="C";

        }else {
        
        resu ="D";

        
        }
        return resu;

        
       

    }
}
