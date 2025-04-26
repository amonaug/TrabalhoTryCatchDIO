# Desafio Controle de Fluxo 🚀

Projeto Java que recebe dois números, valida se o primeiro é maior que o segundo e realiza uma contagem simples. Em caso de erro, utiliza `try-catch` para tratar a exceção personalizada `ParametroInvalidosException`.

## Como funciona

- Solicita dois números ao usuário.
- Valida se o primeiro número é maior que o segundo.
- Se válido, realiza a contagem do 1 até a diferença entre eles.
- Se inválido, lança uma exceção e trata o erro exibindo uma mensagem amigável.

## Exemplo de execução

### Caso válido
```bash
Digite o primeiro número: 5
Digite o segundo número: 2
1
2
3
```

### Caso inválido
```bash
Digite o primeiro número: 2
Digite o segundo número: 5
Parâmetros inválidos: 2 é menor que 5
```

## Destaques

- Uso de `try-catch` para tratamento de exceções.
- Exceção customizada (`ParametroInvalidosException`) para validação de parâmetros.
- Contagem dinâmica baseada na diferença dos números.
