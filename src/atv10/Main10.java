package atv10;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String texto = scan.nextLine();

        String numeroPalavras = Utilidades10.nPalavras(texto);
        System.out.println(numeroPalavras);
    }
}
