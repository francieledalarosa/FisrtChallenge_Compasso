SISTEMA DE RECONHECIMENTO DE SENTIMENTOS COM EMOTICONS

O Sistema de Reconhecimento de Sentimentos com Emoticons é uma aplicação Java que oferece uma abordagem simples para determinar o sentimento expresso em mensagens com base em emoticons. Desenvolvido por [Seu Nome], este sistema visa proporcionar uma experiência intuitiva aos usuários.

Como Utilizar:
1. Clone o repositório: https://github.com/francieledalarosa/FisrtChallenge_Compasso.git
2. Navegue até o diretório do projeto: cd SistemaReconhecimentoSentimentos.
3. Compile os arquivos Java: javac *.java
4. Execute a aplicação: App

Instruções de Uso:

- Ao iniciar a aplicação, o usuário é saudado e solicitado a compartilhar como foi seu dia.
- O sistema utiliza a classe 'Emoticons' para analisar a mensagem e determinar o sentimento expresso.
- Com base na contagem de emoticons felizes (" :-) ") e tristes ( ":-( "), o sistema classifica o sentimento como "Divertido", "Chateado" ou "Neutro".
- O resultado é exibido ao usuário.

Estrutura do Projeto:
- App: Classe principal que lida com a interação do usuário, utilizando a classe 'Emoticons' para determinar o sentimento.
- Emoticons: Classe responsável por contar emoticons felizes e tristes na mensagem, utilizando o método privado 'contarEmoticons'.

Autor - Franciele Dalarosa

Licença Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

