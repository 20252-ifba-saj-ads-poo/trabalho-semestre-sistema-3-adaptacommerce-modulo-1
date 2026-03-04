package br.edu.ifba.saj.fwads.model;

public class ValidacaoAC {
    public boolean validar(String senha && String nome) {
        if (senha.length() <= 6 && senha.length() >= 1) {
            System.out.println("Senha válida");
            return true;
        } else {
            System.err.println("Senha inválida");
            return false;
        }
    }
}
