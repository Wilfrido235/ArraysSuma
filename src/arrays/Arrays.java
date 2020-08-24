package arrays;

import java.util.Scanner;

/**
 *
 * @author ANDRES
 */
public class Arrsys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double suma = 0;
        int num;
        Scanner ent = new Scanner(System.in);
        System.out.println("Cuantos numeros desea sumar?");
        num = ent.nextInt();
        double [] numeros; 
        numeros = new double [num];
        for (int i = 0; i < num; i++){
            System.out.println("Ingrese el numero");
            numeros[i] = ent.nextInt();
            suma += numeros[i];
        
        }
        System.out.println("La suma de los numeros es: "+ suma);
    }
    
}
