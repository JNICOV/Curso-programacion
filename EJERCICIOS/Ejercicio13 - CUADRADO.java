
package ejercicio13;

import java.util.Scanner;


public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para generar la forma");
        
        int num=leer.nextInt();//leo el numero
        
        
        for (int i = 0; i < num; i++) {
            System.out.print("*");// abro un for para linea superior 
                                  // print sin salto de linea -- lineal
        }
        
        System.out.println();     //salto de linea
        
        /*centro de la forma*/
        
        for (int i = 0; i < num-2; i++) {
            System.out.print("*");       // <-- hago la primer pared
            for (int j = 0; j < num-2; j++) { 
                System.out.print(" ");      // <--hago el vacio del centro
            }
            System.out.println("*");    // <-- hago la 2da pared
        }
        
        
         for (int i = 0; i < num; i++) {
            System.out.print("*"); // <-- Linea inferior (piso)
            
        }
        
        System.out.println();
        
      
        
    }
    
}
