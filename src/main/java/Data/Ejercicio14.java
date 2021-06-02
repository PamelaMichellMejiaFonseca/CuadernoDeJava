package Data;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Pedimos al usuario que escriba un valor entero*/
        System.out.println("Escribe un número entero (>0):");
        int numero = input.nextInt();
        int n = numero;

        /*Mientras el valor no cumpla con los requisitos se pedirá que vuelva a introducirlo*/
        while (n <= 0) {
            System.out.println("El número es menor o igual a 0.");
            System.out.println("Escribe un número entero (> 0):");
            n = input.nextInt();
        }

        /*Calculamos el valor del factorial del número añadido por el usuario*/
        int i = 1;
        while (n > 0) {
            i *= n;
            n--;
        }
        System.out.println("!" + numero + " = " + i);
    }
}
