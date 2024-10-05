package atv7;

public class Utilidades7 {
    public static int fatoracao(int numero){
        if(numero == 1){
            return 1;
        }
        if(numero == 0){
            return 1;
        }
        return numero * fatoracao((numero-1));
    }
}
