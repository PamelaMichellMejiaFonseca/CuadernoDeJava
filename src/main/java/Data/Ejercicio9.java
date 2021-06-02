package Data;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Pedimos un valor entero por consola*/
        System.out.println("Escribe un número");
        Integer numero = input.nextInt();

        /*Llamamos a la función y mostramos el resultado por pantalla*/
        Ejercicio9 ejercicio9 = new Ejercicio9();
        System.out.println("El Factorial " + numero + " es: " + ejercicio9.factorial(numero));
    }

    /*Creamos la función para calcular el factorial de un número*/
    public Integer factorial(Integer number) {
        int resultado = 1;
        for (int i = number; i > 0; i--) {
            resultado *= i;
        }
        return resultado;
    }
}
