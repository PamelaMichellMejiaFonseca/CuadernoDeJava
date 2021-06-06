package Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ejercicio22 ejercicio22 = new Ejercicio22();
        System.out.println("Escribe un numero:");
        Integer n = input.nextInt();

        /*Mostramos el resultado por consola*/
        System.out.println("Los divisores primos de número" + n + " son:");
        System.out.println(ejercicio22.divisores(n));
    }

    /*Método para obtener todos los divisores primos de un número*/
    public List<Integer> divisores(Integer n) {
        List<Integer> primos = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (primo(i) && n % i == 0) {
                primos.add(i);
            }
        }
        return primos;
    }

    /*Método que comprobará si un número es primo o no*/
    public Boolean primo(Integer n) {
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
