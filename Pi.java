package taller2_1;

import java.util.Scanner;

public class Pi {
    Scanner tx = new Scanner(System.in);
private double base;
private double temp1;
private double h;
private double pi=3.14159265;

    public void Pi(){
    
    }
    
    public void Pi(double base, double h){
    }
    
    public void info(){
        System.out.println("Ingrese radio de la base: ");
        base=tx.nextDouble();
        System.out.println("Ingrese la altura del cilindro: ");
        h=tx.nextDouble();
    }
    public double ejecutar(){
        temp1=(pi)*(base*base)*h;
        return temp1;
    }
}



