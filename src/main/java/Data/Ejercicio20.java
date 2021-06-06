package Data;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Pedimos los valores por pantalla*/
        System.out.println("Escribe un numero:");
        Integer primero = scanner.nextInt();
        System.out.println("Escribe un numero:");
        Integer segundo = scanner.nextInt();
        System.out.println("Escribe un numero:");
        Integer tercero = scanner.nextInt();

        System.out.println("Escribe estos tres numeros: " + primero + ", " + segundo + " and " + tercero);
        System.out.println("El maximo numero es:");
        System.out.println(Ejercicio20.max(primero, segundo, tercero));
    }

    /*Función que toma dos parámetros y comprueba el máximo*/
    public static Integer max(Integer primerN, Integer segundoN) {
        if (primerN > segundoN) {
            return primerN;
        }
        return segundoN;
    }
    public static Integer max(Integer primerN, Integer segundoN, Integer thirdNumber) {
        Integer number = max(primerN, segundoN);
        if (number > thirdNumber) {
            return number;
        }
        return thirdNumber;
    }
}
