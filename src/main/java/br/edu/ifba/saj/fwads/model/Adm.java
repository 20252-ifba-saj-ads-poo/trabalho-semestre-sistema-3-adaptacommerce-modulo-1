package br.edu.ifba.saj.fwads.model;
import java.util.ArrayList;
import java.util.List;

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
