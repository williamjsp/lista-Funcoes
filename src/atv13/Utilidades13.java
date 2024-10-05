package atv13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidades13 {
    public static boolean verificacaoEmail(String email){
        Pattern procurarDigitos = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher validarTexto = procurarDigitos.matcher(email);

        return validarTexto.matches();

    }


}
