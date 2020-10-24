/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodosnumerosenteros;
import java.util.Scanner;
/**
 *
 * @author OrtizL
 */
public class EjercicioDosNumerosEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numero1, numero2;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número entero");
        numero1=teclado.nextLine();
        System.out.println("Introduce otro número entero");
        numero2=teclado.nextLine();
        if (numero1.matches("[0-9]*") && numero2.matches("[0-9]*"))
        {   
            
            System.out.println("El primer número entero es " + numero1 + " y el segundo número entero es:" + numero2);
	} 
        else 
        {
            System.out.println("Los datos introducidos no son números enteros");
	}
    }
    
}
