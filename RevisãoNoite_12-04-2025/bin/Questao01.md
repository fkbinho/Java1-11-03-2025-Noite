# 🛍️ Desafio de Programação Orientada a Objetos em Java

## 💡 Enunciado

Você deve desenvolver um programa em Java para simular a geração de **etiquetas de preços** de diferentes tipos de produtos. O programa deve ler os dados de **N produtos** (N fornecido pelo usuário) e, ao final, exibir a **etiqueta de preço** de cada produto, respeitando suas características.

## 🧱 Requisitos

### ✅ Produto Comum
- Possui: `nome` e `preço`.
- A etiqueta de preço deve exibir o nome e o preço do produto.

### ✅ Produto Importado
- Possui: `nome`, `preço` e `taxa de alfândega`.
- A etiqueta de preço deve exibir o nome, o preço total (preço + taxa de alfândega) e o valor da taxa.

### ✅ Produto Usado
- Possui: `nome`, `preço` e `data de fabricação`.
- A etiqueta de preço deve exibir o nome, o preço e a data de fabricação no formato `dd/MM/yyyy`, indicando que é um produto usado.

## 🏗️ Estrutura Sugerida

### Classe `Produto`
- Atributos: `nome` (String), `preco` (Double)
- Método: `etiquetaPreco()` → retorna uma `String` com o nome e o preço

### Classe `ProdutoImportado` (herda de `Produto`)
- Atributo adicional: `taxaAlfandega` (Double)
- Método: `precoTotal()` → retorna o valor total
- Sobrescreve `etiquetaPreco()` → inclui taxa de alfândega

### Classe `ProdutoUsado` (herda de `Produto`)
- Atributo adicional: `dataFabricacao` (Date)
- Sobrescreve `etiquetaPreco()` → inclui a data formatada

## 🧪 Exemplo de Entrada

```
Digite o número de produtos: 3

Produto #1 dados:
Comum, usado ou importado (c/u/i)? c
Nome: Caneca
Preço: 20.00

Produto #2 dados:
Comum, usado ou importado (c/u/i)? u
Nome: Impressora
Preço: 300.00
Data de fabricação (dd/MM/yyyy): 15/03/2020

Produto #3 dados:
Comum, usado ou importado (c/u/i)? i
Nome: Notebook
Preço: 1200.00
Taxa de alfândega: 200.00
```

---

## 📋 Exemplo de Saída

```
ETIQUETAS DE PREÇO:
Caneca R$ 20.00
Impressora (usado) R$ 300.00 (Data de fabricação: 15/03/2020)
Notebook R$ 1400.00 (Taxa alfândega: R$ 200.00)
```

---