package Data;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        int randomValue = (int) (100 * Math.random() + 1);

        int vidas = 5;

        Scanner input = new Scanner(System.in);
        System.out.println("Tienes" + vidas + "vidas. ¡Buena suerte!");
        System.out.println("Adivina el numero:");
        int inputNumber = input.nextInt();


        while (vidas > 0) {
            vidas--;
            if (vidas == 0) {
                System.out.println(" haz muerto.");
                break;
            }
            if (inputNumber > randomValue) {
                System.out.println(inputNumber + " Tu número es demasiado grande:");
                System.out.println("Vidas restantes: " + vidas);
                System.out.println("Adivina el numero:");
                inputNumber = input.nextInt();
            }
            if (inputNumber < randomValue) {
                System.out.println(inputNumber + " Tu número es demasiado pequeño:");
                System.out.println("Vidas restantes: " + vidas);
                System.out.println("Adivina el numero:");
                inputNumber = input.nextInt();
            }
            if (inputNumber == randomValue) {
                System.out.println("Es correcto");
                System.out.println("Escribiste "+ inputNumber + " y el número es " + randomValue);
                System.out.println("Vidas restantes: " + vidas);
                break;
            }
        }
    }
}
