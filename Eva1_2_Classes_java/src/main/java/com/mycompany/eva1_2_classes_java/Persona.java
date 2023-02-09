
package com.mycompany.eva1_2_classes_java;

/**
 *
 * @author Ricardo Hernandez
 */
public class Persona {
private String nombre;
   private String apellido;
  private int edad;
 private boolean estadoCivil;

 public String getNombre(){
return nombre;}

 public void setNombre(String valor){
nombre=valor;
}

 public String getApellido(){
return apellido;}

 public void setApellido(String valor){
apellido=valor;
}
 public int getEdad(){
return edad;}

 public void setEdad(int valor){
edad=valor;
}
 

 public boolean getEstadoCivil(){
return estadoCivil;}

 public void setEstadoCivil(boolean valor){
estadoCivil=valor;
}

public void imprimirDatos(){
    System.out.println("Datos almacenados");
    System.out.println("Nombre completo: " +nombre+ " " + apellido);
    System.out.println("Edad:" + edad);
   
        if (estadoCivil)
            System.out.println("Estado civil: casado");
        else
            System.out.println("Estado civil: libre");


}

}
