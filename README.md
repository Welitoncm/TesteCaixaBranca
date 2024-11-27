# Projeto de Teste de Caixa Branca (Estático)


## Erros Identificados no Código
1. **Conexão com o banco de dados não é fechada.**
2. **Vulnerabilidade a injeção de SQL devido à concatenação de strings.**
3. **Tratamento inadequado de exceções (blocos `catch` vazios).**
4. **Falta de validação de entradas (`login` e `senha`).**
5. **Retorno pouco informativo no método `verificarUsuario`.**
6. **Nomes de variáveis pouco descritivos.**


## Complexidade Ciclomática
- Fórmula: M = E - N + 2P
- Valores:
  - E (arestas): 6
  - N (nós): 6
  - P (componentes conectados): 1
- Resultado: M = 2

## Caminhos Básicos
1. Caminho 1: Início → Query → Execução → `if` (true) → Retorno `result = true`.
2. Caminho 2: Início → Query → Execução → `if` (false) → Retorno padrão.