# MAPAps1 — Protótipo de Gestão de Produtos

Descrição
- Protótipo em Java para um sistema interno de controle de produtos.
- Objetivo: demonstrar funcionalidades de cadastro e listagem usando arrays/listas, estruturas de repetição e leitura via Scanner, conforme solicitado pelo gerente.

Funcionalidades 
- Cadastrar produto (nome, preço, quantidade, categoria).
- Exibir todos os produtos cadastrados.
- Calcular e mostrar valor total em estoque (preço × quantidade) por produto.
- Filtrar e listar produtos por categoria.

Tecnologias
- Java SE (JDK 11+ recomendado)
- Uso de ArrayList, loops (for/while) e Scanner para entrada de dados.

Como executar (exemplo)
1. Compilar:
    javac -d out src/*.java
2. Executar:
    java -cp out Main
3. Siga as instruções interativas exibidas no terminal (menus para cadastrar, listar e filtrar).

Estrutura sugerida do projeto
- src/
  - Main.java          — ponto de entrada e loop principal
  - Product.java       — classe modelo para produto
  - ProductManager.java— CRUD em memória usando ArrayList
- README.md

Boas práticas adotadas
- Separação de responsabilidades (model, manager, interface).
- Validação básica de entrada do usuário.
- Uso de coleções apropriadas (ArrayList) e iteração clara.



Licença
- MIT

 
