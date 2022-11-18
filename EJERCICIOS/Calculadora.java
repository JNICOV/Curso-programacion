
package borrador2;

import java.util.Scanner;


public class Borrador2 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
       /*oooooooooooooooooooooooooooooooooooooooooooooooooo
        oooooooooooooooooooooooooooooooooooooooooooooooooo
*/
        System.out.println("Ingrese dos numeros para calcular");
        System.out.println("");
        System.out.println("Ingrese el numero 1");
        int num1=leer.nextInt();
        System.out.println("Ingrese el numero 2");
        int num2=leer.nextInt();
        
        int opcion; 
        int salida=10;
        String seguro;
        boolean verdadero;
       
        
        do {
            System.out.println("");
            System.out.println("-----------------");
            System.out.println("      MENU");
            System.out.println("-----------------");
            System.out.println(" 1.   Sumar");
            System.out.println(" 2.   restar");
            System.out.println(" 3. Multiplicar");
            System.out.println(" 4.  Dividir");
            System.out.println(" 5.   Salir");
            System.out.println("-----------------");
            System.out.println("Elija una opcion:");
            System.out.println("-----------------");
            
            opcion=leer.nextInt();
            
            
            switch(opcion){
                case 1:
                    System.out.println(num1+num2);
                    break;
                            
                    
                case 2:
                    System.out.println(num1-num2);
                    break;
                    
                case 3:
                    System.out.println(num1*num2);
                    break;
                    
                case 4:
                    System.out.println(num1/num2);
                    break;
                case 5:
                    System.out.println("Esta seguro? Ingrese (s) o (n) por si o por no ");
                     seguro=leer.next();
                     if(seguro.equalsIgnoreCase("s")){
                          salida=20;            
                     }
                    break;
                default:
                    System.out.println("No indicaste la opcio correcta");
            }
             
            }while(salida!=20);
        
        
        
        System.out.println("Saliste");
            
    }
}
        
       
        
    

        
    
    
    
    //funcion y procedimiento



    
    
    
   
    
    
    

    
    
    
 
    
    

