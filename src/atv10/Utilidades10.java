package atv10;

public class Utilidades10 {
    public static String nPalavras(String texto){
        String[] quantidadePalavras = texto.split(" ");
        int contador = 0;

        for(String palavra : quantidadePalavras){
            if(!palavra.isEmpty()){
                contador++;
            }
        }
        return "A quantidade de palavras é: "+ contador;
    }
}
