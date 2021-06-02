package Data;

public class Ejercicio2 {
    public static void main(String[] args) {
        Ejercicio2 ejercicio2 = new Ejercicio2();

        /*Llamamos a cada uno de los métodos*/
        ejercicio2.suma();
        ejercicio2.resta();
        ejercicio2.multiplicacion();
        ejercicio2.division();

        /*Mostramos los resultados por pantalla*/
        System.out.println("El valor de la suma es: " + ejercicio2.getSumResultado());
        System.out.println("El valor de la resta es: " + ejercicio2.getRestResultado());
        System.out.println("El valor de la multiplicación es: " + ejercicio2.getMulResultado());
        System.out.println("El valor de la división es: " + ejercicio2.getDivResultado());
    }

    /*Definimos las distintas variables que utilizaremos para realizar los cálculos*/
    private Integer num1 = 12;
    private Integer num2 = 4;
    private Integer sumResultado;
    private Integer restResultado;
    private Integer mulResultado;
    private Double divResultado;

    /*Método para calcular la suma*/
    public void suma() {
        this.sumResultado = getNum1() + getNum2();
    }

    /*Método para calcular la resta*/
    public void resta() {
        this.restResultado = getNum1() - getNum2();
    }

    /*Método para calcular la multiplicación*/
    public void multiplicacion() {
        this.mulResultado = getNum1() * getNum2();
    }

    /*Método para calcular la división*/
    public void division() {
        this.divResultado = (double) getNum1() / (double) getNum2();
    }

    /*Getters y setters de las variables*/
    public Integer getNum1() {
        return num1;
    }
    public Integer getNum2() {
        return num2;
    }
    public Integer getSumResultado() {
        return sumResultado;
    }
    public Integer getRestResultado() {
        return restResultado;
    }
    public Integer getMulResultado() {
        return mulResultado;
    }
    public Double getDivResultado() {
        return divResultado;
    }
}
