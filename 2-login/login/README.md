SISTEMA DE AUTENTICAÇÃO

O Sistema de Autenticação é uma aplicação simples em Java que oferece funcionalidades básicas de autenticação, permitindo que usuários realizem login e cadastro. 

Pré-requisitos
Certifique-se de ter o Java instalado em sua máquina.

Como Executar

1. Clone o repositório: https://github.com/francieledalarosa/FisrtChallenge_Compasso.git

2. Navegue até o diretório do projeto: cd SistemaAutenticacao

3. Compile os arquivos Java: javac *.java

4. Execute a aplicação: LoginApp

Instruções de Uso
- Ao iniciar o aplicativo, você será solicitado a indicar se já possui cadastro.
- Responda com "S" para login ou "N" para cadastrar um novo usuário.
- Para facilidade de teste já possue senha e usuários/cadastrados ("usuario1", "senha1").
- Siga as instruções fornecidas pelo sistema para realizar o login ou cadastro.

Estrutura do Projeto

- core: Contém a lógica principal do sistema de autenticação. Possui a classe 'AutenticacaoService' contendo como atributos 'usuarios' e 'senhas', sendo responsável pela autenticação e cadastro de usuários. Utiliza arrays para armazenar informações de usuários e senhas.

E possui dois métodos: autenticarUsuario(String usuarioDigitado, String senhaDigitada) e cadastrarUsuario(String novoUsuario, String novaSenha) que verifica se os dados inseridos pelo usuário correspondem à lista de usuários/senhas cadastrados ou recebe um novo nome e um novo usuário, após adiciona-os na lista de usuários.

- ui: Contém a interface do usuário e a lógica de interação. A classe 'AutenticacaoUI' oferece métodos para realizar o login onde, caso o mesmo erre, possui um número máximo de tentativas definidos pelo sistema e a opção de escolha se o usuário deseja realizar nova tentativa caso erre a anterior; cadastrar um novo usuário e exibir mensagens de saudação.

- main: Classe principal 'LoginApp' que inicia o aplicativo. Solicita se o usuário já possui cadastro e redireciona para o login ou cadastro conforme a resposta.

Autor - Franciele Dalarosa

Licença Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
