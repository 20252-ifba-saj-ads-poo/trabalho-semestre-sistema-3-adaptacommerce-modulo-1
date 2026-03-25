package br.edu.ifba.saj.fwads.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.ifba.saj.fwads.App;
import br.edu.ifba.saj.fwads.model.Adm;
import br.edu.ifba.saj.fwads.model.BancoUsuarios;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class AdminController implements Initializable {

    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane AdminController;

    @FXML
    private Button Blogin;

    @FXML
    private TextField Cnome;

    @FXML
    private TextField Csenha;
    
    @FXML
    void entrar(ActionEvent event) { try {int idUser = Integer.parseInt(Cnome.getText());
        String senha = Csenha.getText();
        boolean loginSucesso =  false; 
        for (usuario : BancoUsuarios.getListaUsuarios()) {
            if (usuario.getId() == idUser) loginSucesso = true;
        
        if (userAC.isbloqueado()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Login Bloqueado");return;}

            else {
                usuario.registrarTentativaFalha();
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Login Falhado");
                alert.setContentText("senha incorreta. Tentativa" + usuario.getTentativasFalhas + "de 5");
                alert.showAndWait();
            }
            break; 
        }
    } 
    if (!loginSucesso) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Login Falhado");
        alert.setContentText("Usuário não encontrado");
        alert.showAndWait();
    }
   
   
    catch (NumberFormatException e) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Entrada Inválida");
        alert.setContentText("ID de usuário deve ser um número inteiro");
        alert.showAndWait();
    }

    @Override

    public void initialize(URL url, ResourceBundle rb) {
        if (BancoUsuarios.getlistaUsuarios().isEmpty()) {
            Adm admin = new Adm(1, "Admin", "admin123", "admin123");
            BancoUsuarios.addUsuario(admin);
      }      System.out.println("Usuário admin criado com ID: " + admin.getId());
        }
    

    @FXML
    private ImageView LogoReduzida;

    @FXML
    private Text Minfo;

    @FXML
    void SalvaNome(ActionEvent event) {
        String nome = Cnome.getText().toString();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Nome Salvo");
        alert.setHeaderText(null);
        alert.setContentText("Nome salvo: " + nome);
        alert.showAndWait();

    }

    
    

    @FXML
    void SalvaSenha(ActionEvent event) {
        String senha = Csenha.getText().toString();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Senha Salva");
        alert.setHeaderText(null);
        alert.setContentText("Senha salva: " + senha);
        alert.showAndWait();

    }

   
   
   
    @FXML
    void initialize() {
        assert AdminController != null : "fx:id=\"AdminController\" was not injected: check your FXML file 'Admin.fxml'.";
        assert Blogin != null : "fx:id=\"Blogin\" was not injected: check your FXML file 'Admin.fxml'.";
        assert Cnome != null : "fx:id=\"Cnome\" was not injected: check your FXML file 'Admin.fxml'.";
        assert Csenha != null : "fx:id=\"Csenha\" was not injected: check your FXML file 'Admin.fxml'.";
        assert LogoReduzida != null : "fx:id=\"LogoReduzida\" was not injected: check your FXML file 'Admin.fxml'.";
        assert Minfo != null : "fx:id=\"Minfo\" was not injected: check your FXML file 'Admin.fxml'.";

    }}