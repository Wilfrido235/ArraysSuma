package arrays;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, x[], suma = 0;

        System.out.println("Cantidad de elementos:");
        n = teclado.nextInt();
        x = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "]");
            x[i] = teclado.nextInt();
        }
        System.out.println("Elementos del Arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "]:" + x[i]);
        }

        for (int i = 0; i < n; i++) {
            suma = x[i] + suma;
        }
        System.out.println("La suma es:" + suma);
    }
}
