/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_2_classes_java;

/**
 *
 * @author Ricardo Hernandez
 */
public class Eva1_2_Classes_java {

    public static void main(String[] args) {
//clase es la recetea
//objeto el platillo
//Declaramos el identificador para el objeto
//asignamos memoria con new
//invocar su constructor
        Persona perso1 = new Persona();
        Persona perso2 = new Persona();
       /* perso1.nombre="Ricardo";
        perso1.apellido="Hernández";
        perso1.edad= 20;
        perso1.estadoCivil=true; //true es casado
        System.out.println(perso1.nombre);
                System.out.println(perso1.apellido);
        System.out.println(perso1.edad);
        System.out.println(perso1.estadoCivil);
*/ 
         
        perso1.setNombre("Ricardo");
        perso1.setApellido("Hernández");
        perso1.setEdad(20);
        perso1.setEstadoCivil(false);
       
        perso2.setNombre("Ruben");
        perso2.setApellido("Hernández");
        perso2.setEdad(41);
        perso2.setEstadoCivil(true);
        
    /*  perso1.setNombre("Ricardo");
       System.out.println(perso1.getNombre());
       
         perso1.setApellido("Hernández");
       System.out.println(perso1.getApellido());
       
         perso1.setEdad(20);
       System.out.println(perso1.getEdad());
       
         perso1.setEstadoCivil(true);
       System.out.println(perso1.getEstadoCivil());
       */
        perso1.imprimirDatos();
        perso2.imprimirDatos();
    }
}
