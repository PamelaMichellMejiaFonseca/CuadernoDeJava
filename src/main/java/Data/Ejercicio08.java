package Data;

public class Ejercicio08 {
    public static void main(String[] args) {
        /*Inicializamos un array con varios string*/
        String[] array = {"A", "b", "c", "D", "e", "F"};

        /*Transformamos cada letra del array a lower case*/
        for (String letra : array) {
            if (letra.equals(letra.toLowerCase()))
                System.out.println(letra + " es una letra minúscula");
        }
    }
}
