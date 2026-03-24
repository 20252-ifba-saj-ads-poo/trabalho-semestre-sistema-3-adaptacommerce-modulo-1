package br.edu.ifba.saj.fwads.model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class AuditoriaAC {
  public static List<String> historico = new ArrayList<>();

public static void registrarAcao(String acao, String usuario) {
    LocalDateTime agora = LocalDateTime.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");


String registro = "[" + agora.format(formato) + "] " + acao + "| Usuário: " + usuario;
historico.add(registro);  System.out.println("Ação registrada:" + registro); }
    
  
}
