### 📝 Resumo e Nota (OK)
- **Nota Final:** 17/100
- **Visão Geral:** O trabalho implementou algumas classes de domínio relacionadas ao Módulo 1 (Contas e Perfil), como `UserAC`, `Adm`, `Estoquista` e controladores de login. No entanto, a equipe desconsiderou totalmente a arquitetura em 3 camadas exigida no Barema: não foram criadas classes de `Service`, nem `DAO` para gerenciar a persistência, rompendo com o padrão MVC determinado pela disciplina. O código apresenta diversos erros de sintaxe e lógica.

### 📊 Detalhamento do Barema
- **[15/20] Interface Gráfica:** A interface foi modelada e executa com alertas básicos usando a classe `Alert` do JavaFX no momento de erros de login, refletindo a funcionalidade mínima de entrada e visualização.
- **[0/30] Camada de Negócio:** **0/30**. Todas as validações ocorrem diretamente nos Controllers, não há Predicates e as Exceptions customizadas exigidas não existem.
- **[0/20] Camada de Dados (Repository/Modelagem):** Nenhuma entidade de domínio como `UserAC` herda de `AbstractModel<ID>`. Não há sobrescrita inteligente dos métodos `equals/hashCode` e nenhum repositório herda de `GenericDAO`. Os dados estão salvos em um repositório centralizado Singleton volátil (estática com List).
- **[0/20] Separação em Camadas:** O fluxo MVC está quebrado. A lógica real da regra de negócio (incremento de falhas, validação de bloqueio, loop no List de usuários) foi implementada inteiramente dentro do `LoginController` e do `AdminController`.
- **[2/10] Boas Práticas e POO:** Demonstrou conhecimentos essenciais de herança (`Vendedor extends UserAC`), mas perde substancialmente os pontos de Código Bem Escrito por descartar as regras básicas de encapsulamento arquitetural, mantendo verificações inseguras (`String == String`) aglomeradas nos controllers.

### 🐛 Erros Lógicos, Arquiteturais e Execução
- Falta da estrutura `try/catch` aliada a Lançamento de Exceptions Customizadas. Cita-se o método `entrar` no `LoginController`, que rege o negócio diretamente na camada View.
- Nenhuma submissão estrutural herda de `AbstractModel`, impossibilitando o controle por UUIDs nativos.
- `BancoUsuarios` manipula os dados passivamente via instâncias estáticas, ignorando a dependência unívoca ao `GenericDAO`.

### 💡 Refatoração / Código
A regra de negócio deveria estar dentro de um serviço customizado (Ex: `UsuarioService`), que lança erro para que o Controller apenas diga ao View exibir na tela. O Controller JAMAIS deve decidir sobre senhas.

```java
// Forma correta da camada de Negócio e Lógica:
public class UsuarioService extends Service<UserAC, Integer> {
    public void autenticar(Integer id, String senha) throws CredencialInvalidaException {
        UserAC user = buscarPorId(id); // Chamada via GenericDAO base
        if (user == null) {
            throw new CredencialInvalidaException("Usuário não encontrado!");
        }
        if (user.isBloqueado()) {
            throw new CredencialInvalidaException("Conta bloqueada por excesso de tentativas frustradas.");
        }
        if (!user.getSenha().equals(senha)) {
            user.registrarTentativaFalha();
            update(user); // Persiste a atualizacao
            throw new CredencialInvalidaException("Senha inválida!");
        }
        user.resetarTentativas();
        update(user); // Grava a limpezas das tentativas
    }
}

// Camada de Apresentação (Controller): Menos texto, encapsulamento máximo!
@FXML
void entrar(ActionEvent event) {
    try {
        usuarioService.autenticar(Integer.parseInt(txUsuario.getText()), txSenha.getText());
        App.setRoot("controller/Master.fxml");
    } catch (CredencialInvalidaException e) {
        new Alert(AlertType.ERROR, e.getMessage()).showAndWait();
    } catch (NumberFormatException e) {
        new Alert(AlertType.WARNING, "Formato do ID inválido.").showAndWait();
    }
}
```
