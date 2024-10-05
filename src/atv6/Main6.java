package atv6;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palvra: ");
        String palavra = scan.nextLine();
        Utilidades6.nVogais(palavra);
    }
}
