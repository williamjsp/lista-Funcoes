package atv11;

import java.util.ArrayList;

public class Utilidades11 {
    public static double mediaNumeros (ArrayList<Double> n){
        double soma = 0;
        int contadorNumeros = 0;
        for (int i = 0; i < n.size(); i++) {
            double numeroLista = n.get(i);
            soma += numeroLista;
            contadorNumeros += 1;
        }
        double media = soma/contadorNumeros;
        return media;
    }
}
