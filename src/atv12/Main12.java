package atv12;

import java.util.Scanner;

public class Main12 {
    public static void menu(){
        System.out.println("------------------------------------");
        System.out.println("1- Converter Celsius para Fahrenheit");
        System.out.println("2- Converter Fahrenheit para Ceslsius");
        System.out.println("------------------------------------");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        menu();
        int escolha = scan.nextInt();
        while(escolha !=2 && escolha !=1){
            System.out.println("Erro, apenas 1 ou 2");
            menu();
            escolha = scan.nextInt();
        }
        if(escolha == 1){
            System.out.println("Digite o numero que deseja converter: ");
            double celsius = scan.nextDouble();
            Utilidades12.conversaoFahrenheit(celsius);
        } else if (escolha == 2) {
            System.out.println("Digite o numero que deseja converter: ");
            double fahrenheit = scan.nextDouble();
            Utilidades12.conversaoCelsius(fahrenheit);
        }
    }
}
