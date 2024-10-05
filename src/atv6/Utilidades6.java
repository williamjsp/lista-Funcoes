package atv6;

public class Utilidades6 {
    public static void nVogais(String palavra){
        char[] caracteresPalavra = palavra.toCharArray();
        int contagemVogais = 0;
        for(char caracter : caracteresPalavra){
            if(caracter == 'a' || caracter == 'e' || caracter == 'i' ||
                    caracter == 'o'|| caracter == 'u'){
                contagemVogais += 1;
            }
        }
        if(contagemVogais == 1){
            System.out.println("Tem "+ contagemVogais+ " vogal nesta palavra");
        } else if (contagemVogais > 1) {
            System.out.println("Tem "+ contagemVogais+ " vogais nesta palavra");
        }else {
            System.out.println("Não há nenhuma vogal nesta palavra");
        }
    }
}
