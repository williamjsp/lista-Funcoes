package atv8;

import atv7.Utilidades7;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = scan.nextInt();
        boolean primo = Utilidades8.nPrimo(n);

        System.out.println(primo);
    }
}
