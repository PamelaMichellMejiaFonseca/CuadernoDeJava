package Data;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Ejercicio04 ejercicio4 = new Ejercicio04();
        Scanner input = new Scanner(System.in);

        /*Pedimos al usuario por consola que escriba el peso y la altura*/
        System.out.println("Escribe tu peso (kg): ");
        Integer peso = input.nextInt();
        System.out.println("Escribe tu altura (cm): ");
        Integer altura = input.nextInt();

        /*Llamamos a la función para calcular el IMS*/
        ejercicio4.calculateIMS(peso, altura);

        /*Mostramos los resultados por pantalla*/
        System.out.println("Your IMS is: " + ejercicio4.getIms());
        if (ejercicio4.getIms() >= 18.0 && ejercicio4.getIms() <= 25.0) {
            System.out.println("Your are in a good condition.");
        }
    }


    /*Inicializamos una variable de tipo double*/
    private Double ims;

    /*Método para calcular el IMS*/
    public void calculateIMS(Integer peso, Integer altura) {
        setIms((double) peso / (((double) altura / 100) * 2));
    }

    /*Getter y setter de la variable ims*/
    public Double getIms() {
        return ims;
    }
    public void setIms(Double ims) {
        this.ims = ims;
    }
}
