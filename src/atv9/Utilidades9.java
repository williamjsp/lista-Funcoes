package atv9;

import java.util.ArrayList;
import java.util.List;

public class Utilidades9 {
    public static double somaNumeros (ArrayList<Double> n){
        double soma = 0;
        for (int i = 0; i < n.size(); i++) {
            double numeroLista = n.get(i);
            soma += numeroLista;
        }
        return soma;
    }
}
