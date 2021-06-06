package Data;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ejercicio23 ejercicio23 = new Ejercicio23();

        System.out.println("Escribe los grados fahrenheit:");
        int fahrenheit = scanner.nextInt();

        /*Mostramos el resultado de la conversión por pantalla*/
        System.out.println((double)fahrenheit + "ºF = " + ejercicio23.fahrenheitToCelsius(fahrenheit) + "ºC");
    }

    /*Función de conversión de grados Fahrenheit a Celsius*/
    public double fahrenheitToCelsius(double fahrenheitDegrees) {
        return ((double)5 / 9) * (fahrenheitDegrees - 32);
    }
}


