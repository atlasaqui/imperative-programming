# 💻 Programação Imperativa

[![UNICAP](https://img.shields.io/badge/UNICAP-Sistemas%20para%20Internet-blue?style=flat-square)](https://www.unicap.br/)
[![C Language](https://img.shields.io/badge/Language-C-00599C?style=flat-square&logo=c)](https://en.cppreference.com/w/c)
[![GCC](https://img.shields.io/badge/Compiler-GCC-00599C?style=flat-square)](https://gcc.gnu.org/)

> Repositório dedicado à disciplina de **Programação Imperativa** do 2º período do curso de **Sistemas para Internet** na Universidade Católica de Pernambuco (UNICAP).

---

## 📖 Sobre a Disciplina

Esta disciplina tem como objetivo introduzir os fundamentos da **programação imperativa**, utilizando a linguagem C como principal ferramenta de aprendizado. O curso aborda desde conceitos básicos de lógica de programação até tópicos avançados como ponteiros e alocação dinâmica de memória.

### Objetivos de Aprendizagem:
- Compreender o paradigma de programação imperativa
- Dominar a sintaxe e semântica da linguagem C
- Desenvolver habilidades de resolução de problemas através da programação
- Aplicar estruturas de dados e algoritmos fundamentais
- Implementar boas práticas de programação

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Descrição |
|------------|-----------|
| ![C](https://img.shields.io/badge/C-00599C?style=for-the-badge&logo=c&logoColor=white) | Linguagem de programação principal |
| ![GCC](https://img.shields.io/badge/GCC-00599C?style=for-the-badge) | Compilador para código C |
| ![VS Code](https://img.shields.io/badge/VS%20Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white) | Editor de código recomendado |

---

## 📚 Conteúdo Programático

### Tópicos Abordados:

1. **Introdução à Programação Imperativa**
   - Paradigma imperativo
   - Estrutura básica de um programa em C
   - Compilação e execução

2. **Variáveis e Tipos de Dados**
   - Tipos primitivos (int, float, char, double)
   - Declaração e inicialização
   - Operadores aritméticos, relacionais e lógicos

3. **Estruturas de Decisão**
   - Comando `if-else`
   - Comando `switch-case`
   - Operador ternário

4. **Estruturas de Repetição (Laços)**
   - Laço `for`
   - Laço `while`
   - Laço `do-while`

5. **Vetores e Matrizes**
   - Arrays unidimensionais
   - Arrays multidimensionais
   - Manipulação de strings

6. **Funções**
   - Definição e chamada de funções
   - Passagem de parâmetros
   - Retorno de valores
   - Escopo de variáveis

7. **Ponteiros**
   - Conceito de ponteiros
   - Aritmética de ponteiros
   - Ponteiros e arrays
   - Alocação dinâmica de memória

---

## 📂 Estrutura do Repositório

```
imperative-programming/
│
├── Unidade I/              # Conceitos básicos e introdução
├── Unidade II/             # Estruturas de controle e arrays
├── Unidade III/            # Funções e ponteiros
├── Listas de Exercícios/   # Exercícios propostos
├── Projeto Final/          # Projeto final da disciplina
└── README.md               # Este arquivo
```

---

## 🚀 Como Compilar e Executar

### Pré-requisitos

Certifique-se de ter o GCC instalado no seu sistema:

```bash
# Verificar instalação do GCC
gcc --version
```

### Compilação

Para compilar um programa em C, utilize o seguinte comando:

```bash
# Sintaxe básica
gcc nome_do_arquivo.c -o nome_do_executavel

# Exemplo
gcc hello_world.c -o hello_world
```

### Compilação com flags de otimização e warnings:

```bash
# Recomendado para desenvolvimento
gcc -Wall -Wextra -o programa programa.c

# Com otimização
gcc -O2 -Wall -o programa programa.c
```

### Execução

Após compilar, execute o programa:

```bash
# No Linux/Mac
./nome_do_executavel

# No Windows
nome_do_executavel.exe
```

### Exemplo Completo

```bash
# 1. Criar um arquivo de código
echo '#include <stdio.h>
int main() {
    printf("Hello, UNICAP!\\n");
    return 0;
}' > hello.c

# 2. Compilar
gcc hello.c -o hello

# 3. Executar
./hello
```

---

## 👨‍🎓 Autor

**Estudante de Sistemas para Internet - UNICAP**  
*2º Período - Programação Imperativa*

---

## 📝 Licença

Este projeto está sob a licença especificada no arquivo [LICENSE](LICENSE).

---

## 📞 Contato

Para dúvidas ou sugestões sobre o conteúdo deste repositório, sinta-se à vontade para abrir uma [issue](https://github.com/atlasaqui/imperative-programming/issues).

---

<div align="center">
  <p>Desenvolvido com 💙 por um estudante da UNICAP</p>
</div>
