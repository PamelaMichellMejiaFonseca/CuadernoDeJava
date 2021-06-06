package Data;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*tamaños de los arrays*/
        System.out.println("Cuantos numeros quieres que tenga tu primer cadena?");
        int arrayLength = scanner.nextInt();
        System.out.println("Cuantos numeros quieres que tenga tu segunda cadena ?");
        int arrayLength1 = scanner.nextInt();

        Integer[] valor1 = new Integer[arrayLength];
        Integer[] valor2 = new Integer[arrayLength1];

        /*Añadimos los valores a los arrays*/
        Ejercicio18.aggValor(scanner, arrayLength, arrayLength1, valor1,  valor2);

        Integer[] v;
        if (arrayLength >= arrayLength1) {
            v = new Integer[arrayLength];
            for (int i = 0; i < arrayLength1; i++) {
                if (i < arrayLength1) {
                    v[i] = valor1[i] + valor2[i];
                } else {
                    v[i] = valor1[i];
                }
            }
        } else {
            v = new Integer[arrayLength1];
            for (int i = 0; i < arrayLength1; i++) {
                if (i < arrayLength1) {
                    v[i] = valor2[i] + valor1[i];
                } else {
                    v[i] = valor2[i];
                }
            }
        }

        System.out.println("Primer Array");
        System.out.println(Arrays.toString(valor1));
        System.out.println("Segundo Array:");
        System.out.println(Arrays.toString(valor2));
        System.out.println("La suma de los array es:");
        System.out.println(Arrays.toString(v));
    }
}
