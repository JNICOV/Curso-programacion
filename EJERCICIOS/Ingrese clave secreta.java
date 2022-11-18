
package borrador2;

import java.util.Scanner;


public class Borrador2 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String clave="perro";
        String palabra;
        
        int num=3;               
        int conta=0;
        
        do {
            
            System.out.println("Ingrese la clave");
            palabra=leer.nextLine();
            conta++;
       
        if (clave.equalsIgnoreCase(palabra)) {
            System.out.println("Correcto!!");
            System.out.println("");
            System.out.println("Puede ingresar al sistema");
        }else {
            
                System.out.println("INCORRECTO");                
                System.out.println("Le quedan "+(num-conta)+" intentos");
                System.out.println("Al 3er intento erroneo se borrara el sistema");
                
        }
        
        
        }while (clave!=palabra && conta!=3);
        
        
                      
             if (conta==3){
                 System.out.println("Se procede a borrar el sistema");
             }
        }
        
        
        
                
                
                
        
        
            
      
  
       
               
             
        
        
        
        
                
            
        
        
        
        
        
       
      
   
     
                        
        
        
        
                        
    }
    //funcion y procedimiento
   
    
   
    }
    
    

    
    
    
 
    
    
}
