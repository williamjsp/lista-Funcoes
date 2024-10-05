package Atv2;

public class Utilidades2 {
    public static void quantidadeDigitos(Integer numero){
        int contador = 0;
        String numeroString = numero.toString(Math.abs(numero));
        for(int i = 0; i < numeroString.length(); i++){
            numeroString.charAt(i);
            contador += 1;
        }
        System.out.println(contador);

    }
}
