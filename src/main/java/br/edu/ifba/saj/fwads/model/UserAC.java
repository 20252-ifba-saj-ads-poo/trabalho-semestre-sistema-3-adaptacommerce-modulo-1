package br.edu.ifba.saj.fwads.model;

public class UserAC {
   private int id;
    String name;
    public String senha;
    public UserAC(int id, String name, String senha) {
        this.id = id;
        this.name = name;
        this.senha = senha;
    }  
    public void ValidSenha(String senha) { if (
        senha.length() <= 6 && senha.length() >= 1 ) { this.senha = senha; System.out.println("Senha válida");}
        else System.err.println("Senha inválida");}
    public void ValidNome(String nome) { if (
        nome.length() > 2 && nome.length() < 100 ) {System.err.println("Nome válido");}
        else System.err.println("Nome inválido");}
    
    public int getId() {
        return id;}
    }