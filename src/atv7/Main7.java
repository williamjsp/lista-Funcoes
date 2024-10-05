package atv7;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero não negativo: ");
        int numero = scan.nextInt();
        while(numero < 0){
            System.out.println("Digite um numero não negativo: ");
            numero = scan.nextInt();
        }
        int fatoracaoNumero = Utilidades7.fatoracao(numero);
        System.out.println(numero+"! = "+fatoracaoNumero);
    }

}
