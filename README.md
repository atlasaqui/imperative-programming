<div align="center">

# ☕ Programação Imperativa em Java
### Laboratório de Fundamentos de Computação e Lógica de Programação

<br>

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JDK](https://img.shields.io/badge/JDK_21-007396?style=for-the-badge&logo=oracle&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-brightgreen?style=for-the-badge)
![Unicap](https://img.shields.io/badge/UNICAP-Sistemas%20para%20Internet-blue?style=for-the-badge)

<br>

> *"Antes de aprender a construir sistemas complexos, é preciso dominar o alicerce — a lógica que move cada linha de código."*

</div>

---

## 🧭 O que é este projeto?

Este repositório é um **laboratório de fundamentos** desenvolvido durante a disciplina de **Programação Imperativa** no curso de Sistemas para Internet **Universidade Católica de Pernambuco (UNICAP)**.

Aqui você encontra implementações progressivas de conceitos essenciais da computação: desde a leitura de dados via terminal até algoritmos de busca e ordenação aplicados em vetores. Cada arquivo representa uma etapa da evolução técnica — não apenas como exercício acadêmico, mas como **estudo de caso de legibilidade e organização de código**.

O foco não é só "fazer funcionar". É fazer funcionar **com clareza**.

---

## 💡 Por que este projeto?

A maioria dos repositórios acadêmicos são arquivos esquecidos com nomes como `Exercicio3.java`. Este não.

Este repositório foi construído com a mentalidade de um **estudo de caso técnico**: cada solução foi pensada para demonstrar não apenas o resultado, mas o **raciocínio por trás da estrutura do código** — fluxo de dados, decisão de estruturas de controle e aplicação consciente de vetores e funções.

Além disso, vem de alguém com background em **Design**, o que significa que a **legibilidade importa tanto quanto a lógica**. Um código que ninguém consegue ler não serve a ninguém.

---

## 🔬 Demonstração de Lógica — Os Algoritmos em Destaque

### 🏆 `OrdenadorTresNumeros.java` — Torneio de Eliminação com `if/else` Aninhado

**O Problema:** ordenar três inteiros do maior para o menor sem usar nenhuma estrutura de dados auxiliar.

**A Solução:** uma lógica de **torneio eliminatório**. O primeiro `if/else if/else` define quem é o maior de forma absoluta, comparando contra os outros dois simultaneamente com `&&`. Uma vez que o campeão (maior) é identificado, um segundo bloco aninhado resolve a disputa entre os dois restantes — reduzindo o problema de ordem-3 em um problema de ordem-2.

```java
if (num1 >= num2 && num1 >= num3) {
    maior = num1;
    if (num2 >= num3) { meio = num2; menor = num3; }
    else              { meio = num3; menor = num2; }
}
```

> **Insight técnico:** a estrutura garante que todos os caminhos de execução (`if`, `else if`, `else`) são mutuamente exclusivos e coletivamente exaustivos — cobrindo os 6 possíveis ordenamentos de 3 elementos sem redundância.

---

### 🔁 `PreenchedorVetorSemRepeticao.java` — Guard de Unicidade com `while` Infinito

**O Problema:** preencher um vetor de tamanho fixo garantindo que nenhum valor se repita, sem usar `Set` ou qualquer estrutura de dados avançada.

**A Solução:** para cada posição `i` do vetor, um laço `while(true)` captura a entrada do usuário e imediatamente a valida via uma busca linear (`existeNoVetor`) sobre os `i` elementos já preenchidos. Somente quando o valor é inédito o loop quebra via `break` implícito (saída do `while`) e o dado é persistido no array.

```java
while (existeNoVetor(v, i, valor)) {
    System.out.println("Valor já presente! Digite um valor diferente.");
    valor = input.nextInt();
}
v[i] = valor;
```

> **Insight técnico:** a função `existeNoVetor` recebe `quantidadeAtual` (não o tamanho total do vetor), realizando a busca apenas sobre os elementos já confirmados. Isso evita leituras em posições ainda não inicializadas — um detalhe sutil que define **código correto** vs. código que "parece correto".

---

### 🔍 `BibliotecaAlgoritmosVetor.java` — Busca Sequencial vs. Busca Binária

**O Problema:** localizar um elemento em um vetor com a estratégia mais eficiente possível.

**A Solução:** o arquivo implementa e contrasta dois algoritmos clássicos:

- **Busca Sequencial** — O(n): percorre o vetor elemento por elemento. Funciona em qualquer vetor.
- **Busca Binária** — O(log n): divide o vetor ao meio a cada iteração, descartando metades inteiras do espaço de busca. Exige vetor **ordenado** — por isso a classe também implementa inserção ordenada (`inserirOrdenado`) e os algoritmos **Insertion Sort** e **Selection Sort**.

```java
// Busca Binária
int inicio = 0, fim = n - 1;
while (inicio <= fim) {
    int meio = (inicio + fim) / 2;
    if (x == v[meio]) return meio;
    else if (x < v[meio]) fim = meio - 1;
    else inicio = meio + 1;
}
```

> **Insight técnico:** a busca binária é mais eficiente para grandes volumes, mas tem uma pré-condição rígida: ordenação. O arquivo resolve isso ao gerar o vetor já ordenado durante o preenchimento, combinando geração aleatória com `inserirOrdenado` — separando responsabilidades de forma intencional.

---

## 🗂️ Índice de Arquivos

| Arquivo | Conceito Central | Estruturas Aplicadas |
|---|---|---|
| `OlaMundo.java` | Output básico | `System.out.println` |
| `AnalisadorIdadeEleitoral.java` | Tomada de decisão múltipla | `if / else if / else`, constantes `final` |
| `OrdenadorTresNumeros.java` | Ordenação sem array | `if` aninhado, lógica booleana |
| `CalculadoraMediaIdadesWhile.java` | Acumulador com sentinela | `while`, casting `(double)` |
| `ColetorIdadesValidado.java` | Validação de entrada em tempo real | `for` + `while` aninhado |
| `ComparadorMaiorValor.java` | Funções com retorno | Método estático, modularização |
| `ConversorCelsiusFahrenheit.java` | Função pura matemática | Método com `return`, `printf` |
| `GeradorEstatisticasAleatorias.java` | Arrays e estatística | `Random`, `for`, média |
| `PreenchedorVetorSemRepeticao.java` | Unicidade em array | `while` infinito, busca linear |
| `BibliotecaAlgoritmosVetor.java` | Busca e ordenação | Busca binária, Insertion Sort, Selection Sort |

---

## 🛠️ Tecnologias

| Tecnologia | Função no Projeto |
|---|---|
| ![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white) | Linguagem principal — compilada, fortemente tipada |
| **Scanner API** (`java.util.Scanner`) | Leitura de dados via `System.in` |
| **Random API** (`java.util.Random`) | Geração de números pseudoaleatórios |
| **Estruturas Condicionais** | `if`, `else if`, `else`, operadores `&&` e `\|\|` |
| **Laços de Repetição** | `for`, `while`, `do-while`, laços aninhados |
| **Vetores / Arrays** | Alocação estática, travessia, busca e ordenação |
| **Funções Estáticas** | Modularização e reuso de lógica |
| **Constantes** (`final`) | Eliminação de magic numbers |

---

## 🚀 Como Executar

### Pré-requisitos

- [JDK 17+](https://www.oracle.com/java/technologies/downloads/) instalado
- Terminal (Bash, PowerShell ou CMD)

### Passo a passo

```bash
# 1. Clone o repositório
git clone https://github.com/atlasaqui/imperative-programming---Java.git

# 2. Navegue até a pasta
cd imperative-programming---Java

# 3. Compile o arquivo desejado
javac NomeDoArquivo.java

# 4. Execute
java NomeDoArquivo
```

### Exemplo prático

```bash
javac BibliotecaAlgoritmosVetor.java
java BibliotecaAlgoritmosVetor
```
--- Testando Preenchimento sem Repetição ---
{ 3, 7, 12, 15, 19, 23, 27, 34, 41, 48 }
A média do vetor é: 22.90
Digite um número para buscar: 23
Número 23 está na posição 6 (índice 5)

---

---

<div align="center">

---

Desenvolvido com ☕ por **Victor**

[![GitHub](https://img.shields.io/badge/GitHub-atlasaqui-181717?style=flat&logo=github)](https://github.com/atlasaqui)
&nbsp;·&nbsp;
**UNICAP** — Sistemas para Internet.
&nbsp;·&nbsp;
Programação Imperativa

</div>
