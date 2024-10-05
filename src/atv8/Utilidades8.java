package atv8;

public class Utilidades8 {
    public static boolean nPrimo(int n){
        if(n < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
