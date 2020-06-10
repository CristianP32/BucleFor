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
        //inicio1
//        for(int i = 0; 100< 5; 100++){
//        
//        System.out.println(i);
//        
//        }
//fin1
//inicio2
//    int inicio,fin; 
//    Scanner leer;
//    
//    //guardamos el valor de limite
//    leer = new Scanner (System.in);
//    
//    System.out.println("Ingrese el inicio: ");
//    inicio = leer.nextInt();
//    
//    System.out.println("Ingrese el fin: ");
//    fin = leer.nextInt();
//    
//    for( int i = inicio; i<= fin; i++){
//    
//        System.out.println("El valor de i es --> " + i);
//        
//    }
//fin2
    
//inicio 3

    int nuMul,limite;
    Scanner leer;
    
    leer = new Scanner (System.in);
    
    System.out.println("Tabla de multiplicación de: ");
    nuMul = leer.nextInt();
    
    System.out.println("Limite");
    limite = leer.nextInt();
    
    for(int i = 0; i<= limite ; i++){
        System.out.println(i + " por " + nuMul + " = " + (nuMul * i));
    }
    
    //fin3
    }
    
}
