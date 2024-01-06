QUIZ DO PROGRAMADOR

O QuizApp é uma aplicação simples de quiz em Java, onde os jogadores podem responder a perguntas e ganhar pontos com base em suas respostas.

Pré-requisitos Certifique-se de ter o Java instalado em sua máquina.

Como executar

1. Clone o repositório: https://github.com/francieledalarosa/FisrtChallenge_Compasso.git

2. Navegue até o diretório do projeto: cd QuizApp

3. Compile os arquivos Java: javac *.java

4. Execute a aplicação: QuizApp

Instruções de Uso
- Ao iniciar o aplicativo, você será solicitado a inserir o número de jogadores.
- Insira o nome de cada jogador quando solicitado.
- Responda às perguntas do quiz no tempo determinado.
- Após todas as perguntas, a pontuação final de cada jogador será exibida, junto com o vencedor.

Estrutura do Projeto

- core: Contém a lógica principal do quiz. Possui uma classe 'Quiz' com atributos: perguntas, alternativas e respostas; O size contabiliza o tamanho de lista das perguntas. Ele relaciona as perguntas com List<string> e as alternativas e respostas utilizam Map <string>. O Método get é utilizado na função obterPergunta() conforme o índice da pergunta, que se relaciona com verificarResposta e validarResposta.

Nas funções são usados trim(), toLowerCase() e equals() para tratamento de espaços vazios desnecessários, converter letras maiúsculas em minúsculas e comparar as strings. Caso o usuário deixe ou coloque algum espaço a mais e digite a alternativa com letra maiúscula.

Na versão anterior também havia tratamento caso a resposta estivesse fora das alternativas existentes com loop while para repetir a pergunta e permitir que o usuário escrevesse corretamente a opção desejada. No entanto, com o método de temporizador adicionado ao jogo, foi removido para que o competidor não dobre seu tempo sobre a questão tendo vantagens na disputa.

- ui: Contém a interface do usuário e a lógica de interação. Possui uma classe QuizUI, que tem como atributos um objeto scanner para entradas do usuário e instancia a classe Quiz da core, respostasEscolhidas, pontuação e nomeUsuario. Um construtor (QuizUI(String nomeUsuario)).

O iniciarQuiz() throws ExecutionException, IOException: Inicia o quiz exibindo uma mensagem de boas-vindas. Itera sobre cada pergunta do quiz, exibindo-a e espera a resposta utilizando o método responderComTemporizador(int indice) para controlar o tempo de resposta.

Este, por sua vez, define um tempo limite para cada pergunta (20 segundos). Utiliza um ExecutorService e um Future para executar uma tarefa em uma thread separada que representa o temporizador. Usa tratamento de exceção, caso o jogador não responda dentro do prazo esperado, a resposta será considerada errada e não soma pontos, uma mensagem é exibida na tela, o mesmo caso o competidor digite ou de entrada em uma resposta não válida. Caso contrário, o método retorna um valor booleano indicando se a resposta foi correta.

Método getRespostasEscolhidas(): Retorna a lista de respostas escolhidas pelo usuário. Método getNomeUsuario(): Retorna o nome do usuário. Método getPontuacao(): Retorna a pontuação do usuário no quiz.

-main: possui a classe principal QuizApp. A função main solicita que o usuário digite o número de jogadores, utiliza try/catch para tratamento caso a entrada seja inválida. Utiliza lista para exibir os resultados finais com a pontuação e retorna o vencedor.

Autor - Franciele Dalarosa

Licença Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
