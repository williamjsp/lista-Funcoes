package atv4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double n1 = scan.nextDouble();
        System.out.println("Digite outro numero: ");
        double n2 = scan.nextDouble();
        System.out.println();
        System.out.println("Escolha qual operação você deseja fazer");
        System.out.println("--------------------------");
        System.out.println("1- somar");
        System.out.println("2- subtrair");
        System.out.println("3- multiplicar");
        System.out.println("4- dividir");
        System.out.println("--------------------------");
        int operador = scan.nextInt();

        Utilidades4.calcular(n1, n2, operador);
    }
}
