/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclefor;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BucleFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //BUCLE FOR
//        for(int i = 0; 100< 5; 100++){
//        
//        System.out.println(i);
//        
//        }

    int inicio,fin; 
    Scanner leer;
    
    //guardamos el valor de limite
    leer = new Scanner (System.in);
    
    System.out.println("Ingrese el inicio: ");
    inicio = leer.nextInt();
    
    System.out.println("Ingrese el fin: ");
    fin = leer.nextInt();
    
    for( int i = inicio; i<= fin; i++){
    
        System.out.println("El valor de i es --> " + i);
        
    }
    }
    
}
