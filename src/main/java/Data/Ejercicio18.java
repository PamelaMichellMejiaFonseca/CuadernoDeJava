package Data;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos numeros quieres agregar al primer array");
        int arrayLength = scanner.nextInt();

        Integer[] valor1 = new Integer[arrayLength];
        Integer[] valor2 = new Integer[arrayLength];

        aggValor(scanner, arrayLength, arrayLength, valor1, valor2);

        String[] vector = new String[arrayLength];
        for(int i = 0; i < arrayLength; i++){
            vector[i] = valor1[i].toString() + valor2[i].toString();
        }
        System.out.println("El array es: ");
        System.out.println(Arrays.toString(vector));
    }

    private static void aggValor(Scanner scanner, int arrayLength, int arrayLength1, Integer[] valor1, Integer[] valor2) {
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Añade el primer valor del array");
            valor1[i] = scanner.nextInt();

        }
        for (int i = 0; i < arrayLength1; i++) {
            System.out.println("Añade el valor del segundo array:");
            valor2[i] = scanner.nextInt();
        }
    }
}


