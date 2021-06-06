package Data;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ejercicio07 ejercicio7 = new Ejercicio07();


        System.out.println("¿Qué operación te gustaría hacer? (S; R; P or M; D)");
        String symbol = scanner.nextLine();
        /*Pedimos al usuario los valores enteros con los que se harán los cálculos*/
        System.out.println("Escribe el primer número:");
        Integer primerNumero = scanner.nextInt();
        System.out.println("Escribe el segundo número:");
        Integer segundoNumero = scanner.nextInt();

        /*Realizamos un switch para cada caso, es decir, para cada operación*/
        switch (symbol.toLowerCase()) {
            case "s":
                System.out.println("Tu tienes: " + ejercicio7.suma(primerNumero, segundoNumero));
                break;
            case "r":
                System.out.println("Tu tienes: " + ejercicio7.resta(primerNumero,segundoNumero));
                break;
            case "p":
            case "m":
                System.out.println("Tu tienes: " + ejercicio7.multiplicacion(primerNumero, segundoNumero));
                break;
            case "d":
                if (primerNumero == 0) {
                    System.out.println("El primer número no puede ser 0");
                    break;
                }
                System.out.println("Tu tienes: " + ejercicio7.division(primerNumero, segundoNumero));
                break;
            default:
                System.out.println("Error no es una operación o número válido");
                break;
        }
    }

    /*Método para realizar la suma*/
    public Integer suma(Integer primerNumero, Integer segundoNumero) {
        return  primerNumero+ segundoNumero;
    }

    /*Método para realizar la resta*/
    public Integer resta(Integer  primerNumero, Integer segundoNumero) {
        return  primerNumero- segundoNumero;
    }

    /*Método para realizar la multiplicación*/
    public Integer multiplicacion(Integer  primerNumero, Integer segundoNumero) {
        return  primerNumero * segundoNumero;
    }

    /*Método para realizar la división*/
    public Integer division(Integer  primerNumero, Integer segundoNumero) {
        return  primerNumero / segundoNumero;
    }
}
