
package AprendiendoJava;

import java.util.Scanner;

public class Borrador {
   public static void main(String[] args) { 
       
 Scanner leer = new Scanner(System.in); 
  String nuevo="";

 
       System.out.println("Ingrese una "
       +"palabra o frase");          //pido la frase
       
       String frase=leer.nextLine();// leo la frase
      
      nuevo=cambioPalabra(frase); 
      
       System.out.println(nuevo);
       
          
         


     
}    
       public static String cambioPalabra(String frase){
           String nuevaPalabra="";
           
                   int longi=frase.length();//obtengo longitud
                   
                   for (int i = 0; i < longi; i++) { //inicio for
                       
                       String letra=frase.substring(i, i+1); //recorto caracter
                       
                  switch (letra) { //inicio switch(segun)
                      case "a":
                          letra="@";
                          break;
                      case "e":
                          letra="#";
                          break;
                      case "i":
                          letra="$";
                          break;
                      case "o":
                          letra="%";
                          break;
                      case "u":
                          letra="*";
                          break;
                      default:
                          break;
                  }
                 
                 nuevaPalabra=nuevaPalabra.concat(letra);

                 
              }
           
                   return nuevaPalabra;
         
         }
      
  
       
       }
       
      


