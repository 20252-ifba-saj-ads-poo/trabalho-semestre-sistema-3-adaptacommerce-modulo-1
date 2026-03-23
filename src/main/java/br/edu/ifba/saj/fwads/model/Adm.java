package br.edu.ifba.saj.fwads.model;
public class Adm extends UserAC {
    
    private String email;

    public Adm(int id, String nome, String email, String senha) {
        super(id, nome, senha);
        this.email = email;
        
    }

    public String getEmail() {
        return email;
    }
}
