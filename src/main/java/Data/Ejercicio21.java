package Data;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe un numero:");
        int scanner = input.nextInt();

        /*Mostramos el resultado de comprobar si el número es primo a no*/
        Ejercicio21 ejercicio21 = new Ejercicio21();
        System.out.println("Este numero es " + scanner + " un primo?");
        System.out.println(ejercicio21.primos(scanner));
    }

    /*Método que comprobará si un número es primo o no*/
    public Boolean primos(Integer n) {
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;

}
}
