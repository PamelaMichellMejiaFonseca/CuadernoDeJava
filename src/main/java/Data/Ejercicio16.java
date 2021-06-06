package Data;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Pedimos al usuario, por consola, cuantos números quiere añadir*/
        System.out.println("¿Cuántos números le gustaría agregar?");
        int arrayLength = input.nextInt();

        Integer[] arrayNumbers = new Integer[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Escribe un número:");
            int number = input.nextInt();
            arrayNumbers[i] = number;
        }

        /*Mostramos por consola el valor máximo y mínimo del array*/
        System.out.println("El maximo numero es: " + Collections.max(Arrays.asList(arrayNumbers)));
        System.out.println("El minimo numero es: " + Collections.min(Arrays.asList(arrayNumbers)));
    }
}
