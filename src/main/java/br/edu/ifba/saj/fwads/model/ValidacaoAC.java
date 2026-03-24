package br.edu.ifba.saj.fwads.model;

public class ValidacaoAC {
    public static boolean validar(String senha) {
        if (senha==null || senha.length() < 8) {
           return false;
        }

        if (!Character.isUpperCase(senha.charAt(0))) {
            return false;
        }

        if (senha.matches("[A-Za-z0-9]*")) {
            return false;
        }
        return true;
    }
}