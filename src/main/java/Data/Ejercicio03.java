package Data;

public class Ejercicio03 {
    public static void main(String[] args) {
        /*Inicializamos la variable radius con un valor de 10*/
        Ejercicio03 ejercicio3 = new Ejercicio03(10);

        /*Llamamos los métodos y mostramos los resultados por pantalla*/
        System.out.println("El valor de la división es: " + ejercicio3.volumen());
        System.out.println("La superficie de la esfera es: " + ejercicio3.superficie());
    }

    /*Inicializamos una variable de tipo entero*/
    private Integer radio;


    public Ejercicio03(Integer radio) {
        this.radio = radio;
    }

    public Double volumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(this.radio, 3);
    }

    /*Método para calcular la superficie*/
    public Double superficie() {
        return 4 * Math.PI * Math.pow(this.radio, 2);
    }
}
