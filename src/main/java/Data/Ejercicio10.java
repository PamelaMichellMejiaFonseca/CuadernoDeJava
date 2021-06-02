package Data;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*Llamamos a la función para mostrar los resultados por pantalla*/
        Ejercicio10 ejercicio10 = new Ejercicio10();
        ejercicio10.temperatura();
    }

    /*Creamos la función para convertir grados de Fahrenheit a Celsius, de 0 hasta 300 grados y de veinte en veinte*/
    public void temperatura() {
        for (int i = 0; i < 301; i += 20) {
            System.out.println("Fahrenheit: " + i + " Celsius: " + ((float)5/9) * (float)(i - 32));
        }
    }
}
