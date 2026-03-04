package br.edu.ifba.saj.fwads.model;

public class Estoquista extends UserAC {
        private String email;

    public Estoquista(int id, String nome, String email, String senha) {
        super(id, nome, senha);
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
}
