VERIFICADOR DE PALÍNDROMO

O Verificador de Palíndromo é uma aplicação Java simples que permite ao usuário verificar se uma palavra ou frase é um palíndromo. Um palíndromo é uma palavra, frase, número ou qualquer outra sequência de caracteres que permanece igual quando lida de trás para frente.

Como Utilizar:
1. Clone o repositório: https://github.com/francieledalarosa/FisrtChallenge_Compasso.git
2. Navegue até o diretório do projeto: cd VerificadorPalindromo
3. Compile os arquivos Java: javac *.java
4. Execute a aplicação: MainApp

Instruções de Uso:
- Ao iniciar a aplicação, o usuário é solicitado a digitar a palavra ou frase que deseja verificar como palíndromo.
- O sistema utiliza a classe 'PalindromoChecker` para verificar se a entrada é um palíndromo.
- O resultado é exibido, indicando se a entrada é ou não um palíndromo.

Estrutura do Projeto:
- MainApp: Classe principal que lida com a interação do usuário, recebendo a entrada e chamando o método 'verificarPalindromo' da classe 'PalindromoChecker`.
- PalindromoChecker: Classe responsável por verificar se uma palavra ou frase é um palíndromo. Utiliza o método 'verificarPalindromo`, que remove caracteres não alfabéticos, converte para minúsculas e compara os caracteres da frente para trás.

Autor - Franciele Dalarosa

Licença Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.