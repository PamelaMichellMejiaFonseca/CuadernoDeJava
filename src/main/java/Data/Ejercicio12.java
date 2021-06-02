package Data;

/**
 *
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        /*Llamamos a la función y mostramos el resultado por pantalla*/
        Ejercicio12 ejercicio12 = new Ejercicio12();
        ejercicio12.fibo();
    }

    /*Creamos la función que calcula la secuencia de Fibonacci hasta la posición 51*/
    public void fibo() {
        int pos = 1;
        long num = 0;
        long prev = 1;
        while (pos <= 51) {
            System.out.println(num);
            long sumPrevious = num + prev;
            prev = num;
            num = sumPrevious;
            pos ++;
        }
    }
}
