package br.edu.ifba.saj.fwads.model;

public class UserAC {
   private int id;
    private String name;
    private String senha;

    private int tentativasfalhas;
    private boolean bloqueado;
    
    public UserAC(int id, String name, String senha) {
        this.id = id;
        this.name = name;
        this.senha = senha;
        this.tentativasfalhas = 0;
        this.bloqueado = false;
    } 
    
    public void registrarTentativaFalha() {
        this.tentativasfalhas++;
        if (this.tentativasfalhas >= 5) {
            this.bloqueado = true;
            System.err.println("Usuário " + this.name + " bloqueado devido a múltiplas tentativas de login falhas.");
        }
    }

    public void resetarTentativas() {
        this.tentativasfalhas = 0;
        this.bloqueado = false;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }
public int get tentativasfalhas() {
        return tentativasfalhas;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSenha() {
        return senha;
    }