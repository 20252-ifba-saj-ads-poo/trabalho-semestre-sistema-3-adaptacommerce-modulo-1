package br.edu.ifba.saj.fwads.model;
    
import java.util.ArrayList;
import java.util.List;

public class BancoUsuarios {

    private static List<UserAC> listaUsuarios = new ArrayList<>();

    public static void adicionarUsuario(UserAC user) {
        listaUsuarios.add(user);
    }

    public static List<UserAC> getListaUsuarios() {
        return listaUsuarios;
    }
}

