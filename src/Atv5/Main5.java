package Atv5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Username: ");
        String username = scan.nextLine();
        System.out.println("Password: ");
        String password = scan.nextLine();
        ControladorUsuario.autenticar(username, password);

    }
}
