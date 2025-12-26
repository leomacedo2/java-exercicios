# java-exercicios
Repositório dedicado aos meus estudos e práticas de Java.


Exercícios Java — curso-java
===========================

Visão geral
-----------
Repositório com exercícios em Java organizados por tema (fundamentos, arrays, métodos, POO, exemplos extras). Ideal para aprender e praticar conceitos básicos e intermediários.

Estrutura do repositório
------------------------
- `src/` — código-fonte Java
  - `Ex01_App.java` .. `Ex10_Arrays2D.java` — exercícios de fundamentos
  - `Ex11_POO/` — exercícios de Programação Orientada a Objetos (`Ex11_POO.java`, `Pessoa.java`)
  - `ExercicioExtra_Formulario/` — exemplo de formulário
  - `Modo_Prova/` — código do modo prova
- `bin/` — arquivos compilados (saída do `javac`)

Pré-requisitos
--------------
- JDK instalado (recomendado Java 11+)
- Variável `JAVA_HOME` e `PATH` configurados para usar `javac` e `java`

Como compilar e executar
------------------------
Compilar arquivos do nível raiz (ex.: arquivos em `src`):

```bash
javac -d bin src\*.java
```

Compilar uma pasta de exercício (ex.: POO):

```bash
javac -d bin src\Ex11_POO\*.java
```

Executar uma classe (ex.: `Ex08_Metodos`):

```bash
java -cp bin Ex08_Metodos
```

Observação: alguns exercícios usam múltiplos arquivos em subpastas; compile a subpasta correspondente ou todos os arquivos necessários.

Tasks do VS Code
-----------------
Existem duas tasks fornecidas no workspace:
- `Run Current Java File` — compila `src\*.java` e executa o arquivo aberto
- `Run Java POO` — compila e executa o pacote `Ex11_POO`

Boas práticas / próximos passos (sugestões)
-----------------------------------------
- Adicionar um `pom.xml` (Maven) ou `build.gradle` para gerenciar build e dependências (a ser feito depois)
- Adicionar testes automatizados com `JUnit` para as classes principais (comece por `Pessoa`)
- Organizar código em pacotes (`com.seunome.exercicios`) e usar `src/main/java`, `src/test/java`
- Refatorar exercícios para usar coleções (`ArrayList`, `Map`) quando fizer sentido
- Adicionar um README para cada pasta explicando objetivo do exercício (opcional)

