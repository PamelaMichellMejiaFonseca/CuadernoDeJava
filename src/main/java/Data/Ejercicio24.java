package Data;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ejercicio24 ejercicio24 = new Ejercicio24();

        /*Pedimos el nif por pantalla*/
        System.out.println("Escribe tu  NIF (8 dígitos seguidos de una letra):");
        String nif = scanner.nextLine();

        while (nif.length() != 9) {
            System.out.println("El NIF no es valido.");
            nif = scanner.nextLine();
        }

        String digitos = nif.substring(0, 8);
        String letra = nif.substring(8);

        /*Comprobamos que el string de números contenga números y el string de letras contenga la letra*/
        if (ejercicio24.n(digitos) && Character.isLetter(letra.charAt(0))) {
            System.out.println("NIF válido: " + digitos);
        } else {
            System.out.println("NIF no válido");
        }
    }

    public boolean flag = false;

    public boolean n(String nString) {
        for (int i = 0; i < nString.length(); i++) {
            if (Character.isDigit(nString.toCharArray()[i])) {
                this.flag = true;
            } else {
                this.flag = false;
                break;
            }
        }
        return flag;
    }
}
