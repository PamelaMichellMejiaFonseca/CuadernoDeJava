package Data;

public class Ejercicio05 {
    public static void main(String[] args) {
        Ejercicio05 ejercicio5 = new Ejercicio05();

        /*Mostramos los resultados por pantalla, para dos casos posibles*/
        System.out.println(ejercicio5.getMayor(24, 3));
        System.out.println(ejercicio5.getMayor(3, 10));
    }

    /*Definimos dos variables numéricas*/
    private Integer num1;
    private Integer num2;

    /*Getter para la variable num1*/
    public Integer getNum1() {
        return num1;
    }

    /*Setter para la variable num1*/
    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    /*Getter para la variable num2*/
    public Integer getNum2() {
        return num2;
    }

    /*Setter para la variable num2*/
    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    /*Método para comprobar que valor es mayor*/
    public Integer getMayor(Integer primerNumero, Integer segundoNumero) {
        setNum1(primerNumero);
        setNum2(segundoNumero);

        if (getNum1() > getNum2()) {
            return getNum1();
        }
        return getNum2();
    }
}
