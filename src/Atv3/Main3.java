package Atv3;

import Atv1.Utilidades;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double n1 = scan.nextDouble();
        System.out.println("Digite outro numero: ");
        double n2 = scan.nextDouble();

        Utilidades3.somar(n1, n2);
        Utilidades3.subtrair(n1, n2);
        Utilidades3.multiplicar(n1, n2);
        Utilidades3.dividir(n1, n2);
    }
}
