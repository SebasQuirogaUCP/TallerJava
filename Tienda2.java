package taller2_1;

import java.util.Scanner;

public class Tienda2 {
    
    Scanner tx = new Scanner(System.in);
private String desc;
private int uni;
private double temp1;


    public void Tienda2(){
    }
    
    public double Tienda2(String s, int u){
        this.desc=s;
        this.uni=u;
        temp1=uni*3.5+12000;
        return temp1;
        
    }
    
    public double preguntar(){
        System.out.println("DESCRIPCION PRODUCTO: ");
        desc=tx.nextLine();
        System.out.println("Numero de unidades producidas: ");
        uni=tx.nextInt();
       
        double res=Tienda2(desc,uni);
        return res;
    }
    
    
    
}
