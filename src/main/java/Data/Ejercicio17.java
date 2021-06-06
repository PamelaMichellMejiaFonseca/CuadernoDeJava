package Data;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos números te gustaría agregar? ");
        int arrayLength = scanner.nextInt();

        /*Inicializamos el array con el tamaño definido por el usuario*/
        Integer[] intArray = new Integer[arrayLength];

        /*Pedimos los valores que se añadirán al array*/
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Write a number");
            int n = scanner.nextInt();
            intArray[i] = n;
        }

        /*Comprobamos que el array sea palíndromo*/
        boolean isPalindromic = false;
        for (int i = 0; i < arrayLength / 2; i++) {
            String message = intArray[i] + " equals " + intArray[arrayLength - (i + 1)] + "?";
            if (intArray[i].equals(intArray[arrayLength - (i + 1)])) {
                System.out.println(message);
                System.out.println("True");
                isPalindromic = true;
            } else {
                System.out.println(message);
                System.out.println("False");
                isPalindromic = false;
            }
        }
        System.out.println(Arrays.toString(intArray));
        if (isPalindromic) {
            System.out.println("La matriz es palindrómica");
        } else {
            System.out.println("La matriz no es palindrómica");
        }
    }
}
