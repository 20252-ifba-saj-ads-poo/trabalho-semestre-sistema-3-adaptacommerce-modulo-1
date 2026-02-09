package br.edu.ifba.saj.fwads.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.ifba.saj.fwads.App;
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

public class AdminController implements Initialize {

    
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
    void entrar(ActionEvent event) {
        if(Cnome.getText().equals("admin") && Csenha.getText().equals("admin")){
            new Alert(AlertType.INFORMATION, "Usuário e senha corretos").showAndWait();
            App.setRoot("controller/Master.fxml");
        }else{
            new Alert(AlertType.ERROR, "Usuário ou senha inválidos").show();
        }
    }
    @FXML
    private PasswordField Csenha;
    

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

    }

}

    @Override
    public void initialize(URL url, ResourceBundle rb){

    } 
        // TODO



    


//