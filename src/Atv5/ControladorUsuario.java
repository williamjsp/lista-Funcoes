package Atv5;

import javax.naming.ldap.Control;
import java.util.ArrayList;

public class ControladorUsuario {
    public String username;
    public String password;

    public ControladorUsuario(String username, String password){
        this.username = username;
        this.password = password;
    }

    public static void autenticar(String username, String password){
        ControladorUsuario usuarioAutenticado = null;
        ArrayList<ControladorUsuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new ControladorUsuario("teste", "admin"));
        listaUsuarios.add(new ControladorUsuario("teste2", "admin2"));
        listaUsuarios.add(new ControladorUsuario("teste3", "admin3"));
        listaUsuarios.add(new ControladorUsuario("teste4", "admin4"));

        for(ControladorUsuario usuario : listaUsuarios){
            if(usuario.username.equals(username) && usuario.password.equals(password)){
                usuarioAutenticado = usuario;
                break;
            }
        }

        if(usuarioAutenticado != null) {
            System.out.println("Bem vindo " + usuarioAutenticado.username);
        } else {
            System.out.println("Usuario nao encontrado.");
        }

    }
}
