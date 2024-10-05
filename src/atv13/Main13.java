package atv13;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu email: ");
        String email = scan.nextLine();
        boolean validacao = Utilidades13.verificacaoEmail(email);
        System.out.println("O email é valido? "+ validacao);
    }
}
