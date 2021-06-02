package Data;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Pedimos al usuario por consola que escriba dos valores enteros y los añadimos a dos variables*/
        System.out.println("Escribe un número:");
        int n = input.nextInt();
        System.out.println("Escribe la potencia del número:");
        int m = input.nextInt();
        int N = n;

        /*Calculamos la pontencia del primer valor elevado al segundo*/
        for (int i = 1; i < m; i++) {
            n *= N;
        }

        /*Mostramos el resultado por pantalla*/
        System.out.println(N + " la potencia de " + m + " es: " + n);
    }
}
