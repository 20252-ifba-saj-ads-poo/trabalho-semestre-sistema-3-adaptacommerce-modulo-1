# Sistema3-AdaptaCommerce
## Módulo 1: Gestão de Usuários e Acessos
### Descrição
Este módulo é o alicerce da segurança e da administração do sistema AdaptaCommerce. A equipe será responsável por implementar o fluxo de inicialização do sistema, o cadastro de usuários, a autenticação e o sistema de permissões, garantindo que apenas usuários autorizados acessem as funcionalidades corretas.

### Requisitos Funcionais Essenciais
A equipe deve desenvolver as seguintes funcionalidades, todas com prioridade Essencial:

- [RF001] Validação de Chave de Desenvolvedor para Login: Antes de permitir o cadastro do primeiro usuário, o sistema deve exigir a inserção de uma chave de desenvolvedor secreta. Esta chave deve ser armazenada de forma segura no código-fonte ou em um arquivo de configuração protegido. (Citação: "O sistema deve exigir a inserção de uma chave de desenvolvedor, armazenada em uma área privada do código-fonte ou arquivo de configuração protegido, antes de permitir o cadastro do primeiro usuário.")
- [RF002] Usuário Administrador Inicial: O primeiro usuário criado no sistema (após a validação da chave de desenvolvedor) deve ser automaticamente reconhecido como "Administrador", com plenos poderes. O login deste usuário será feito com nome e senha pré-definidos pelo desenvolvedor. (Citação: "O sistema deve reconhecer o primeiro usuário criado como Administrador, login mediante fornecimento de nome e senha previamente definidos pelo Desenvolvedor.")
- [RF003] Cadastro de Usuários: O administrador deve ter a capacidade de cadastrar novos usuários. Para cada novo usuário, o administrador definirá sua função (ex: Vendedor, Financeiro), um ID único e uma senha que atenda aos critérios de segurança (mínimo de 8 caracteres, iniciar com maiúscula, conter caractere especial). (Citação: "O sistema deve permitir que o administrador cadastre novos usuários, definindo suas funções, ID e senhas de acesso.")
- [RF004] Login: Implementar a tela de login onde os usuários se autenticam com ID e senha. O sistema deve bloquear automaticamente um usuário após 5 tentativas de login inválidas. (Citação: "O sistema deve permitir a autenticação de usuários com base em ID e senha. Além disso, deve bloquear automaticamente usuários com mais de 5 tentativas de login inválidas.")
- [RF005] Permissões de Usuários: Criar um sistema de controle de acesso baseado em funções (Administrador, Vendedor, Financeiro, Estoquista). Cada função terá acesso a um conjunto específico de funcionalidades. Apenas o Administrador pode alterar as permissões de outros usuários. (Citação: "O sistema deve oferecer níveis de acesso diferenciados... com base na sua respectiva função... Alterações de permissões só devem ser realizadas pelo usuário Administrador.")
- [RF027] Auditoria de usuários: O sistema deve registrar automaticamente a data, a hora e qual usuário Administrador realizou o cadastro de um novo usuário. (Citação: "O sistema deve ser capaz de salvar automaticamente a data e hora do cadastro de usuários, além do usuário ADM que realizou o cadastro.")
### Requisitos Não Funcionais a Considerar
- Segurança (RNF003): A autenticação deve ser implementada via token JWT. Todas as senhas devem ser armazenadas com proteção de hash.
- Conformidade (RNF008): O tratamento de dados dos usuários deve seguir as normas da LGPD.
- Integridade (RNF009): O sistema deve validar todos os dados inseridos para prevenir inconsistências, especialmente a unicidade do ID de usuário.
- Usabilidade (RNF004): A interface de login e cadastro de usuários deve ser clara e intuitiva.



Autor
Livro
Usuário

App
Biblioteca

AdminController
CadAutorController
CadLivroController 
LoginController
MasterController