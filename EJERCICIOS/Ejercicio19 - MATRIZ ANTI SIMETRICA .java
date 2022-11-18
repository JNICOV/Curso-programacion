
package Ejercicios;

import java.util.Random;
import java.util.Scanner;

/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una 
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de 
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

VER EJERCICIO EN GUIA

*/
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
       
      int matriz[][]=new int[4][4];
        
        llenoMatriz(matriz);
        muestroMatriz(matriz);
        
        System.out.println();// <--- salto
        
        inviertoMatriz(matriz);
        
        System.out.println();// <--- salto
        
        
        
    }//--------------------------------------------------------
    public static void llenoMatriz(int matriz[][]){
        Random aleatoreo=new Random();
        
                
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=aleatoreo.nextInt((4)-(-4)+1)+(-4);
                
            }
            
        }
        
    }
    
    public static void muestroMatriz(int matriz[][]){
        
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+"   ");
                
            }
            
        }
        System.out.println();
    }
    
    public static void inviertoMatriz(int matriz[][]){
        int conta=0;
        
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i]+"   ");
                if(matriz[j][i]== matriz[i][j]-(matriz[i][j]*2)){
                    conta++;
                }
                
            }
            
        }
        System.out.println();
        if(conta==16){
            System.out.println("La matriz es anti simétrica");
        }
    }
    
}//--------------------------------------------------------
