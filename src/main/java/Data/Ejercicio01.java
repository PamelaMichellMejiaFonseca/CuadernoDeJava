package Data;

public class Ejercicio01 {
    public static void main(String[] args) {
        Ejercicio01 ejercicio1 = new Ejercicio01();

        /*Mostrar el valor de la nueva variable inicializada*/
        System.out.println("Primer valor: " + ejercicio1.getFirstValue());
        System.out.println("Segundo valor: " + ejercicio1.getSegundoValor());

        ejercicio1.setSegundoValor(2);
        System.out.println("The first valur is: " + ejercicio1.getFirstValue());
        System.out.println("The second valur is: " + ejercicio1.getSegundoValor());
    }
    /*Inicializamos las variables*/
    private Integer primerValor = 4;
    private Integer segundoValor = primerValor;

    private Integer getFirstValue() {return primerValor;}
    public Integer getSegundoValor() {
        return segundoValor;
    }
    /*Setter de la variable secondValue*/
    public void setSegundoValor(Integer secondValue) {
        this.segundoValor = segundoValor;
    }
}

