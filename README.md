# java-exercicios ☕

Repositório dedicado aos meus estudos e práticas em Java, organizado como uma **trilha de aprendizado progressiva**.
O foco é consolidar fundamentos, Programação Orientada a Objetos e estruturação de sistemas simples,
priorizando entendimento real e prática consciente.

Este repositório funciona tanto como **material de estudo** quanto como **registro da evolução técnica**.

---

## 🎯 Objetivo da Trilha

- Construir uma base sólida em Java
- Aprender Programação Orientada a Objetos de forma prática
- Desenvolver lógica, organização e leitura de código
- Evoluir gradualmente para sistemas mais próximos do mundo real
  (persistência de dados, tratamento de erros, boas práticas)

---

## 📚 Checklist de Exercícios

Os exercícios estão numerados e organizados em ordem de aprendizado.

### Fundamentos da Linguagem

- ✅ **Ex01_App.java**  
  Preparação do ambiente Java e estrutura básica de um programa.

- ✅ **Ex02_OlaMundo.java**  
  Primeiro programa em Java utilizando `main` e `System.out.println`.

- ✅ **Ex03_Operadores.java**  
  Operadores aritméticos, de comparação e lógicos.

- ✅ **Ex04_Scanner.java**  
  Leitura de dados do usuário com a classe `Scanner`.

- ✅ **Ex05_Condicionais.java**  
  Estruturas condicionais (`if`, `else if`, `else` e `switch`).

- ✅ **Ex06_Loops.java**  
  Estruturas de repetição (`for`, `while` e `do-while`).

- ✅ **Ex07_Arrays.java**  
  Criação e manipulação de arrays para armazenar múltiplos valores.

- ✅ **Ex08_Metodos.java**  
  Definição e uso de métodos para organizar e reutilizar código.

- ✅ **Ex09_Strings.java**  
  Manipulação e comparação de strings.

- ✅ **Ex10_Arrays2D.java**  
  Arrays bidimensionais (matrizes).

---

### Programação Orientada a Objetos (POO)

- ✅ **Ex11_POO**  
  Introdução à Programação Orientada a Objetos:
  classes, atributos, métodos, construtores e encapsulamento.

- ✅ **Ex12_POO_Composicao**  
  Composição entre objetos, modelando relações do tipo “tem um”
  (exemplo: `Carro` possui um `Motor`).

---

### Coleções e Estruturação de Sistemas

- ✅ **Ex13_ArrayLists**  
  Uso de `ArrayList` para gerenciar uma coleção de objetos.  
  O exercício simula uma **garagem de carros**, aplicando:
  - POO e composição (`Carro` → `Motor`)
  - Encapsulamento
  - Gerenciamento de uma coleção (`ArrayList<Carro>`)
  - Operações de adicionar, listar e buscar carros
  - Troca de motor de um carro específico

- ⏳ **Ex14_CRUD_Memoria**  
  Projeto de CRUD em memória com menu interativo no terminal.  
  Exercício em desenvolvimento e evolução contínua, aplicando POO,
  coleções e lógica de sistema.

---

## 🗂️ Estrutura do Repositório

- `src/` — código-fonte Java
  - Exercícios numerados (`Ex01` , `Ex02` e assim vai indo)
  - Subpastas para exercícios com múltiplas classes (POO, ArrayList, CRUD)
- `bin/` — arquivos compilados (saída do `javac`)

---

## ⚙️ Pré-requisitos

- JDK instalado (recomendado Java 11 ou superior)
- Variáveis de ambiente `JAVA_HOME` e `PATH` configuradas
- Terminal ou VS Code para compilação e execução

---

## ▶️ Como Compilar e Executar

Compilar arquivos Java na raiz de `src`:

```bash
javac -d bin src\*.java
```

Compilar um exercício em subpasta (exemplo: POO):

```bash
javac -d bin src\Ex11_POO\*.java
```

Executar uma classe (ex.: `Ex08_Metodos`):

```bash
java -cp bin Ex08_Metodos
```

Observação: alguns exercícios utilizam múltiplas classes.
Nesses casos, compile todos os arquivos da subpasta correspondente.


---

## 🧠 Observações Importantes

- Este repositório representa uma trilha de estudos **em andamento**
- Os exercícios foram feitos com foco em aprendizado progressivo
- Alguns códigos podem ser revisitados, refatorados ou aprimorados

---

## 🔜 Próximos Passos (Planejados)

- Validação de dados e regras de negócio
- Tratamento de erros com exceções
- Persistência de dados em arquivos
- Persistência em banco de dados (JDBC)
- Introdução a testes automatizados (JUnit)

---

📌 *Este repositório é utilizado como apoio de estudo e registro de evolução técnica em Java.*
