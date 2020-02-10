package taller2_1;
import java.util.Scanner;

public class SepararNumero {
    
Scanner tx = new Scanner(System.in);
//private String numero;
private int numero;
private int numero1;
private int temp1;
private int numero2;
private int numero3;
private int numero4;
private int numero5;


    public void SepararNumero(){    
        
    }
    
    public void SepararNumero(int numero){
        this.numero=numero;
        numero1=numero%10;
        numero2=numero%100;
        numero2=numero2/10;
        numero3=numero/100;
        numero3=numero3%10;
        numero4=numero/1000;
        numero4=numero4%10;
        numero5=numero/10000;
                
        System.out.println("primero dos numeros: "+numero5+"   "+numero4+"   "+numero3+"   "+numero2+"   "+numero1);
        
        //USANDO METODO DE STRING1
        
        /*for(int i=0; i<5; i++){
            
            System.out.print(numero.charAt(i)+"   "); 
        }
        System.out.print("\n");*/
    }

    public void info(){

    System.out.println("Cargando primer ejercicio...");
    System.out.println("EJERCICIO CARGADO!");
    System.out.println("Digite un numero entero de 5 digitos: ");
    numero=tx.nextInt();
    SepararNumero(numero);
    
                        
    }
}
