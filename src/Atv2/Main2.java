package Atv2;

import Atv1.Utilidades;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        Integer numero = scan.nextInt();
        Utilidades2.quantidadeDigitos(numero);
    }
}
