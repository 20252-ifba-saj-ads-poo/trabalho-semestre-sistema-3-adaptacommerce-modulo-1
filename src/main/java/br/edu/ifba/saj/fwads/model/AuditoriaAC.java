package br.edu.ifba.saj.fwads.model;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class AuditoriaAC {
  public List<UserAC> usuariosAud = new ArrayList<UserAC>(listaUsuarios);
  public List<Adm> Adm = new ArrayList<>();
  private static List<UserAC> listaUsuarios = new ArrayList<>();

  LocalDateTime dataHora;
    String acao;
    UserAC usuario;
    public AuditoriaAC(LocalDateTime dataHora, String acao, UserAC usuario) {
        this.dataHora = dataHora;
        this.acao = acao;
        this.usuario = usuario;
    }
};
