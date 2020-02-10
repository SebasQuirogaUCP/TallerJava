
package taller2_1;

import java.util.Scanner;

public class Taller2_1 {
    
    public static void main(String[] args) {
        
        Scanner tx = new Scanner(System.in);
        SepararNumero ej1 = new SepararNumero();
        CambioMoneda ej2 = new CambioMoneda();
        Equivalencias ej3 = new Equivalencias();
        Tienda ej4= new Tienda();
        Pi ej5 = new Pi();
        Tienda2 ej6 = new Tienda2();
        
        int opc;
        do{
            System.out.println("Digite su opcion: ");
            System.out.println("0. Salir [1-6]. Ejercicios");
            opc = tx.nextInt();
            switch(opc){
                    case 0:
                        System.out.println("Saliendo del programa.");
                        System.exit(0);
                    break;   
                    case 1:
                        ej1.info();
                        ej1.SepararNumero();
                    break;
                    
                    case 2:
                        System.out.println("Cargando Segundo ejercicio...");
                        ej2.info();
                        ej2.convertir();
                    break;
                    case 3:
                        System.out.println("Cargando Tercer ejercicio...");
                        ej3.info();
                        ej3.convertir();
                    break;
                    case 4:
                        System.out.println("Cargando Cuarto ejercicio...");
                        ej4.preguntar();
                    break;
                    case 5:
                        System.out.println("Cargando Quinto ejercicio...");
                        ej5.info();
                        double res=ej5.ejecutar();
                        System.out.println("El volumen del cilindro es: "+res);
                        
                    break;                    
                    case 6:
                        System.out.println("Cargando 6 ejercicio...");
                        double res1=ej6.preguntar();
                        System.out.println("EL COSTO DE PRODUCCION DEL ARTICULO ES: "+res1);
                        
                    break;

                    default:
                            System.out.println("Recuerde, un numero entre 1 y 6 !!!");
            
            }   
        } while (opc<=6);
    
        
        }
    
}
