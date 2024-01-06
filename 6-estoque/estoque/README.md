 Sistema de Controle de Estoque

Este é um sistema simples de controle de estoque em Java, desenvolvido como parte de um desafio.

Requisitos

- Java 8 ou superior

Como Executar

Certifique-se de ter o JDK instalado no seu sistema.

1. Clone o repositório: https://github.com/francieledalarosa/FisrtChallenge_Compasso.git
    

2. Navegue até o diretório do projeto: cd seu-repositorio/loja
  

3. Compile o código: javac -d bin src/loja/core/*.java src/loja/ui/*.java
 

4. Execute o programa: java -cp bin loja.ui.MenuEstoque
    

Funcionalidades

(OBS: estas eram as funcionalidades pretendidas, na primeira versão ele continha as funcionalidades exigidas, tentei melhora-lo de última hora infelizmente não vai dar tempo de terminar, porem acho melhor entregar mostrando que tentei ir alem que apenas o básico, agradeço a compreensão).

- Ver produtos: Exibe a lista de produtos cadastrados no estoque.
- Cadastrar novo produto: Permite cadastrar um novo produto no estoque. (ele não está cadastrando corretamente, logo não está fazendo outras operações)
- Vender: Registra uma venda, reduzindo a quantidade em estoque do produto.
- Comprar: Registra uma compra, aumentando a quantidade em estoque do produto.
- Alterar preço: Atualiza o preço de um produto existente.
- Alterar quantidade em estoque: Modifica a quantidade em estoque de um produto existente.

 Estrutura do Projeto

- core/: Contém as classes essenciais relacionadas ao estoque e produtos.
- ui/: Contém a interface do usuário, incluindo o menu principal.

Autor - Franciele Dalarosa

Licença Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
