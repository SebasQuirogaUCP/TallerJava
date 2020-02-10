package taller2_1;

import java.util.Scanner;

public class Tienda {
    
Scanner tx= new Scanner(System.in);
private String desc;
private double costoP;
private double temp1;
private double utilidad;
private double imp;


    public void Tienda(){
    }
    public void Tienda(double costoP){
    
    }
    
    public void preguntar(){
        System.out.println("Descripcion del producto: ");
        desc=tx.nextLine();
        System.out.println("Costo de produccion: ");
        costoP=tx.nextDouble();
        utilidad=costoP*.2;
        temp1=(costoP*.2)+costoP;
        System.out.println("20% de utilidad: "+utilidad);
        imp = costoP*.15;
        temp1=temp1+(costoP*.15);
        System.out.println("Costo de impuesto: "+imp);
        System.out.println("DESCRIPCION PRODUCTO: "+ desc);
        System.out.println("PRECIO DE VENTA: "+temp1);
        
        
        
    }
    
}
