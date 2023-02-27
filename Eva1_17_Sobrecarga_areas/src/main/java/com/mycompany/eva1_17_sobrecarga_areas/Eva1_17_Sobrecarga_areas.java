/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_17_sobrecarga_areas;

/**
 *
 * @author Ricardo Hernandez
 */
public class Eva1_17_Sobrecarga_areas {

    public static void main(String[] args) {
        System.out.println("Area Circulo"+ area(5.0));
                System.out.println("Area triangulo"+ area(5.0,6.0));
        System.out.println("Area trapesio"+ area(5.0, 6.0, 7.0));

    }
public static double area(double radio){
return Math.PI* radio* radio;

}
public static double area(double base, double altura){
return(base*altura)/2.0;
}
public static double area(double altura, double basemayor, double basemenor){
return altura*(basemayor+basemenor) /2.0;

}
}
