package atv4;

public class Utilidades4 {
        public static void calcular(double n1, double n2, int operador){
            switch (operador){
                case 1:
                    System.out.println(n1+ " + "+ n2+ " = "+ (n1+n2));
                    break;
                case 2:
                    System.out.println(n1+ " - "+ n2+ " = "+ (n1-n2));
                    break;
                case 3:
                    System.out.println( n1+ " * "+ n2+ " = "+(n1 * n2));
                    break;
                case 4:
                    try {
                        if (n2 == 0) {
                            throw new ArithmeticException("dividir por 0, vai dar um numero infinito, ja que é double");
                        }
                        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                    }
                    catch(ArithmeticException dividirPor0) {
                        System.out.println(dividirPor0.getMessage());
                    }
                    break;
                default:
                    System.out.println("apenas entre 1 a 4");
            }
    }
}
