package taller2_1;

import java.util.Scanner;

public class Equivalencias {
    
Scanner tx = new Scanner(System.in);
private double numeroPies;
private double temp1;    
private double tempPul;    
    
    public void Equivalencias(){

    }    
    public void Equivalencias (int numeroPies){
    
    }
    public void convertir(){
     tempPul=numeroPies*12;
     System.out.println("Pies en pulgadas: "+tempPul);
     temp1=(3/numeroPies);
     System.out.println("Pies en YARDAS: "+temp1);
     temp1=tempPul*2.54;
     System.out.println("Pies en Centimetros: "+temp1);
     temp1=temp1*100;
     System.out.println("Pies en metros: "+temp1);
     
    }
    public void info(){
        System.out.println("Ingrese medida en PIES: ");
        numeroPies=tx.nextDouble();
        
        
    }
    
}
