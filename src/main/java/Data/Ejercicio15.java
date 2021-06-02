package Data;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*Inicializamos una variable de tipo entero con un valor aleatorio entre 1 y 100*/
        int randomValue = (int) (100 * Math.random() + 1);
        /*Inicializamos una variable de tipo entero con un valor de 5 que
         * representará los intentos que tiene el usuario para adivinar el número*/
        int lives = 5;

        /*Pedimos por consola que el usuario escriba un número (primer intento)*/
        Scanner input = new Scanner(System.in);
        System.out.println("You have " + lives + " lives. Good luck!");
        System.out.println("Try to guess the number:");
        int inputNumber = input.nextInt();

        /*A partir del segundo intento se irá pidiendo al usuario que añada un número cada vez que no acierte,
         * mostrando algunos mensajes sobre las vidas que le quedan y si el número añadido es más grande o más
         * pequeño que el número que debe adivinar*/
        while (lives > 0) {
            lives--;
            if (lives == 0) {
                System.out.println("Tu moriste.");
                break;
            }
            if (inputNumber > randomValue) {
                System.out.println(inputNumber + " Your number is too big:");
                System.out.println("Remaining lives: " + lives);
                System.out.println("Try to guess the number:");
                inputNumber = input.nextInt();
            }
            if (inputNumber < randomValue) {
                System.out.println(inputNumber + " Your number is too small:");
                System.out.println("Remaining lives: " + lives);
                System.out.println("Try to guess the number:");
                inputNumber = input.nextInt();
            }
            if (inputNumber == randomValue) {
                System.out.println("Good job! You are right!");
                System.out.println("You wrote " + inputNumber + " and the number is " + randomValue);
                System.out.println("Remaining lives: " + lives);
                break;
            }
        }
    }
}
