package taller2_1;

import java.util.Scanner;

public class CambioMoneda {
Scanner tx =  new Scanner(System.in);    
private int cambio;
private double temp1;
private String monedaAcambiar;

    public void CambioMoneda(){

    }
    
    public void CambioMoneda(int cambio){
    }

    public void convertir(){
    
        if(monedaAcambiar.startsWith("y")){
            temp1=(cambio*109.14);
            System.out.println("Su dinero en Yennes japoneses:  "+temp1);
        } else if(monedaAcambiar.startsWith("l")){
            temp1=cambio*0.77;
            System.out.println("Su dinero en Libras Esterlinas:  "+temp1);
        } else if(monedaAcambiar.startsWith("e")){
            temp1=cambio*0.84;
            System.out.println("Su dinero en EUROS:  "+temp1);
        } else if (monedaAcambiar.startsWith("p")) {
            temp1=cambio*17.22;
            System.out.println("Su dinero en PESOS ARGENTINOS:  "+temp1);
        } else {
            
        System.out.println("USTED HA DIGITADO INCORRECTAMENTA EL CAMBIO DE MONEDA");
        System.out.println("Vuelva a intentarlo");
        }
        
    }
    
    public void info(){
        System.out.println("CONVERSIONES AL DIA: ");
        System.out.println("1 DOLAR= 109.14 Yennes - 0,77 GBP - 0,84 EUR - 17,22 ARS ");
        System.out.println("CANTIDAD DE DOLARES A COMPRAR: ");
        cambio=tx.nextInt();    
        System.out.println("Tipo de cambio: (y)Yenes,(l)Libras Esterlinas, (pa)Pesos argentinos o (eu)Euros : ");
        monedaAcambiar=tx.next();
    }
}
