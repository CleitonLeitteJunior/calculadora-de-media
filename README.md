# 🎓 Validador de Notas Escolares — v1.0

Aplicativo de console em **Java** para calcular a média final de um aluno em uma matéria específica, gerando um **relatório simples** com base nos dados informados via terminal.

---

## ✨ Funcionalidades

* Coleta dados do aluno:

  * Nome
  * Idade
  * Instituição
  * Curso
  * Período
  * Turno
* Solicita:

  * Nome da matéria
  * Nota da Prova 1
  * Nota da Prova 2
* Calcula a **média aritmética simples**:

```
(nota1 + nota2) / 2
```

* Exibe um **relatório final completo** no console.

---

## 🧩 Tecnologias Utilizadas

* **Linguagem:** Java (JDK 8 ou superior)
* **Biblioteca:** `java.util.Scanner` (entrada de dados via console)

---

## 📁 Estrutura do Projeto

```
.
├── src
│   └── App.java
└── README.md
```

📌 **Observação:** Em projetos simples, o arquivo `App.java` pode ficar diretamente na raiz do projeto.

---

## 🚀 Como Executar

### ✅ Pré-requisitos

* Java JDK 8 ou superior instalado
* Terminal / CMD / PowerShell

### ▶️ Passo a passo

1. Clone o repositório (ou copie o arquivo `App.java`):

```bash
git clone https://github.com/seu-usuario/validador-notas-java.git
cd validador-notas-java
```

2. Compile o código:

```bash
javac App.java
```

3. Execute o programa:

```bash
java App
```

---

## 🖥️ Exemplo de Uso

### 📥 Entrada (via console)

```
VALIDADOR DE NOTAS ESCOLARES - v1.0
=================================================

Aqui você poderá calcular sua média final.
Abaixo, digite seus dados para gerar o relatório.

Digite seu nome: Maria da Silva
Digite sua idade: 19
Digite o nome da instituição de ensino, seja escola ou faculdade: Faculdade XPTO
Digite o nome do curso que faz: Engenharia de Software
Digite o período do curso que está: 3º
Digite o turno que estuda, manhã, tarde ou noite: noite

Ok, agora que coletamos alguns dados seus, vamos para o próximo passo...

Digite o nome da matéria que gostaria de saber sua média final: Estruturas de Dados
Digite a nota da prova 1: 8.0
Digite a nota da prova 2: 7.0
```

### 📤 Saída Esperada

```
---------------- RELATÓRIO FINAL ----------------
Aluno: Maria da Silva
Idade: 19
Instituição: Faculdade XPTO
Curso: Engenharia de Software
Período: 3º
Turno: noite
Matéria: Estruturas de Dados
Média final: 7.5
```

---

## 📌 Observações e Boas Práticas

* As notas utilizam o tipo `Double`, permitindo casas decimais.
* **Não há validação de entrada** (ex.: letras onde se espera números).
* O cálculo utiliza **média aritmética simples**.
* Caso a instituição utilize pesos diferentes, a fórmula pode ser adaptada.

---

## 🔧 Possíveis Melhorias

* ✅ Validação de entrada (valores numéricos e intervalo de 0 a 10)
* ✅ Suporte a mais avaliações e pesos
* ✅ Geração de relatório em arquivo (TXT ou PDF)
* ✅ Resultado automático:

  * Aprovado
  * Recuperação
  * Reprovado
* ✅ Internacionalização (i18n)
* ✅ Testes automatizados com JUnit

---

## 🧑‍💻 Autor

**Cleiton Leite Junior**

---

## 🤝 Contribuindo

Contribuições são bem-vindas! 🚀

1. Faça um **fork** do projeto
2. Crie uma branch:

```bash
git checkout -b feature/minha-feature
```

3. Commit suas alterações:

```bash
git commit -m "feat: adiciona minha feature"
```

4. Envie para o repositório remoto:

```bash
git push origin feature/minha-feature
```

5. Abra um **Pull Request**

---

## 📄 Licença

Projeto livre para uso educacional.

Caso deseje, adicione uma licença formal como **MIT** ou **Apache 2.0**.
