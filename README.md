# Projeto de Teste de Caixa Branca (Estático)


## Erros Identificados no Código
1. **Conexão com o banco de dados não é fechada.**
2. **Vulnerabilidade a injeção de SQL devido à concatenação de strings.**
3. **Tratamento inadequado de exceções (blocos `catch` vazios).**
4. **Falta de validação de entradas (`login` e `senha`).**
5. **Retorno pouco informativo no método `verificarUsuario`.**
6. **Nomes de variáveis pouco descritivos.**


