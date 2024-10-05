package Atv3;

public class Utilidades3 {
    public static void somar(double n1, double n2){
        System.out.println(n1+ " + "+ n2+ " = "+ (n1+n2));
    }
    public static void subtrair(double n1, double n2){
        System.out.println(n1+ " - "+ n2+ " = "+ (n1-n2));
    }
    public static void multiplicar(double n1, double n2){
        System.out.println( n1+ " * "+ n2+ " = "+(n1 * n2));
    }
    public static void dividir (double n1, double n2){
        try {
            if (n2 == 0) {
                throw new ArithmeticException("dividir por 0, vai dar um numero infinito, ja que é double");
            }
            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
        }
        catch (ArithmeticException dividirPor0){
            System.out.println(dividirPor0.getMessage());
        }
    }
}