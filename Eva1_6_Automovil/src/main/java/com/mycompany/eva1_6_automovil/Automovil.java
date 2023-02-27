/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_6_automovil;

/**
 *
 * @author Ricardo Hernandez
 */
public class Automovil {
    private String modelo;
    private String placas;
    private String marca;
    private int año;
    private String dueño;
 public Automovil(){   
 modelo="Matiz";
 placas="dnlakdn";
 marca="Pontiac";
 año= 2007;
 dueño="Ricardo";
 }
  public Automovil(String modeloAuto, String marcaAuto, int añoAuto,String placasAuto, String dueñoAuto){   

}
  public String getModelo(){
return modelo;}

 public void setModelo(String valor){
modelo=valor;
}
  public String getPlacas(){
return placas;}

 public void setPlacas(String valor){
placas=valor;
}
 public String getMarca(){
return marca;}

 public void setMarca(String valor){
marca=valor;
}
 public int getAño(){
return año;}

 public void setAño(int valor){
año=valor;
}
 public String getDueño(){
return dueño;}

 public void setDueño(String valor){
dueño=valor;
}
 
 
 
 public int calcularRev(){
int adeudo =0;
if(año <=2000){
adeudo=1500;
}else if((año >= 2001) && (año <=2005)){
adeudo = 2000;
}else if((año >= 2006) && (año <=2010)){
adeudo = 2500;
}else if((año >= 2011) && (año <=2015)){
adeudo = 3000;
}else {
adeudo= 3500;
}
return adeudo;
}
 
 
 public void imprimirDatos(){
 System.out.println("ADEUDO VEHICULAR");
  System.out.println("DUEÑO: "+ dueño);
 System.out.println("MARCA: "+ marca);
 System.out.println("MODELO: "+ modelo);
 System.out.println("AÑO: "+ año);
  System.out.println("Placa: "+ placas);

 System.out.println("TOTAL A PAGAR: "+ calcularRev());

 }
 }
  







