package br.edu.ifba.saj.fwads.model;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class AuditoriaAC {
  public List<UserAC> usuariosAud = new ArrayList<>();
  public List<Adm> Adm = new ArrayList<>();

  private LocalDateTime dataHora;
    private String acao;
    private UserAC usuario;

  public AuditoriaAC(LocalDateTime dataHora, String acao, UserAC usuario) {
        this.dataHora = dataHora;
        this.acao = acao;
        this.usuario = usuario;
      

    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public String getAcao() {
        return acao;
        }
    public UserAC getUsuario() {
        return usuario;
    }
};
