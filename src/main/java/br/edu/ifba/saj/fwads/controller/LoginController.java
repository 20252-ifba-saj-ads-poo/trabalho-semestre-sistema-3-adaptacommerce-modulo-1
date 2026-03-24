/**
 * Sample Skeleton for 'Login.fxml' Controller Class
 */

package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.App;
import br.edu.ifba.saj.fwads.model.Adm;
import br.edu.ifba.saj.fwads.model.AuditoriaAC;
import br.edu.ifba.saj.fwads.model.UserAC;
import javafx.event.ActionEvent;
import br.edu.ifba.saj.fwads.model.BancoUsuarios;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LoginController {

    @FXML // fx:id="txSenha"
    private PasswordField txSenha; // Value injected by FXMLLoader
    @FXML // fx:id="txUsuario"
    private TextField txUsuario; // Value injected by FXMLLoader

    private void initialize() {
        if (BancoUsuarios.getListaUsuarios().isEmpty()) {
            String chaveDev = "admin";
            System.out.println("Validada chave"+chaveDev);
        
Adm admin = new Adm(1, "admin", "admin@gmail.com", "admin123!");
BancoUsuarios.adicionarUsuario(admin);
}
AuditoriaAC.registrarAcao("Criação de usuário", "admin");
System.out.println("login 1 senha admin123!");
        
    }

    @FXML
void entrar(ActionEvent event) {
    try {
        int idDigitado = Integer.parseInt(txUsuario.getText());
        String senhaDigitada = txSenha.getText();
        boolean usuarioEncontrado = false;
        
        for (UserAC user : BancoUsuarios.getListaUsuarios()) {
            if (user.getId() == idDigitado) {
                usuarioEncontrado = true;
                
                if (user.isBloqueado()) {
                    new Alert(AlertType.ERROR, "Usuário bloqueado devido a múltiplas tentativas de login falhas.").show();
                    return;
                

                if (user.getSenha().equals(senhaDigitada)) {
                    new Alert(AlertType.INFORMATION, "Usuário e senha corretos").showAndWait();
                    user.resetarTentativas();
                    App.setRoot("controller/Master.fxml");}}}

                 else 
        { user.registrarTentativaFalha();
        AuditoriaAC.registrarAcao("Tentativa de login falha", user.getName());
new Alert(AlertType.ERROR, "Usuário ou senha inválidos").showAndWait();
}
        }
        break;
    


if (!usuarioEncontrado) {
        new Alert(AlertType.ERROR, "Usuário ou senha inválidos").show();
    }
} catch (NumberFormatException e) {
        new Alert(AlertType.ERROR, "ID de usuário deve ser um número").show();
}
    @FXML
    void limparCampos(ActionEvent event) {
        txUsuario.setText("");
        txSenha.setText("");
    }

}