package atv11;

import atv9.Utilidades9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main11 {
    public static void menu() {
        System.out.println("----------------------");
        System.out.println("1 - adicionar um numero na lista");
        System.out.println("2 - resultado");
        System.out.println("----------------------");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> listaNumeros = new ArrayList<>();
        while (true) {
            menu();
            int escolha = scan.nextInt();
            if(escolha == 1){
                System.out.println("Digite um numero para adicionar na lista: ");
                listaNumeros.add(scan.nextDouble());
            } else if (escolha == 2) {
                double mediaListaNumeros = Utilidades11.mediaNumeros(listaNumeros);
                System.out.println("A media de todos os numeros da lista = "+ mediaListaNumeros);
                break;
            } else {
                System.out.println("Digite 1 ou 2");
            }
        }

    }
}
