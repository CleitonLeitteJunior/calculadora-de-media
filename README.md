Validador de Notas Escolares — v1.0
Um aplicativo de console em Java para calcular a média final de um aluno em uma matéria específica, gerando um relatório simples com os dados informados.

✨ Funcionalidades

Coleta dados do aluno (nome, idade, instituição, curso, período e turno).
Solicita o nome da matéria e as duas notas (Prova 1 e Prova 2).
Calcula a média aritmética simples: (nota1 + nota2) / 2.
Exibe um relatório final com todas as informações.


🧩 Tecnologias

Linguagem: Java (versão 8 ou superior)
Biblioteca utilizada: java.util.Scanner para entrada de dados via console.


📁 Estrutura do Projeto
.
├── src
│   └── App.java
└── README.md


Observação: Caso utilize um repositório simples, você pode manter apenas o arquivo App.java na raiz.


🚀 Como executar
Pré-requisitos

Java JDK 8+ instalado
Terminal/CMD/PowerShell

Passo a passo


Clone o repositório (ou copie o arquivo App.java):
Shellgit clone https://github.com/seu-usuario/validador-notas-java.gitcd validador-notas-javaMostrar mais linhas


Compile o código:
Shelljavac App.javaMostrar mais linhas


Execute o programa:
Shelljava AppMostrar mais linhas



🖥️ Exemplo de uso
Entrada (via console):
=================================================
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

Saída esperada:
---------------- RELATÓRIO FINAL ----------------
Aluno: Maria da Silva
Idade: 19
Instituição: Faculdade XPTO
Curso: Engenharia de Software
Período: 3º
Turno: noite
Matéria: Estruturas de Dados
Média final: 7.5
------------------------------------------------


📌 Observações e boas práticas

O programa utiliza Double para as notas (permite casas decimais).
Validação de entrada não foi implementada (ex.: impedir letras onde se espera números). Isso pode ser adicionado como melhoria.
O cálculo é média aritmética simples. Caso sua instituição use pesos diferentes, você pode adaptar a fórmula.


🔧 Possíveis melhorias

✅ Validação de entrada (tratar números inválidos, faixas de 0 a 10).
✅ Suporte a mais avaliações e pesos (prova, trabalho, participação).
✅ Geração de arquivo de relatório (TXT/PDF).
✅ Mensagens baseadas no resultado (Aprovado / Recuperação / Reprovado).
✅ Internacionalização (i18n) para outros idiomas.
✅ Testes automatizados com JUnit.


🧑‍💻 Autor

Manserv - Cleiton Leite Junior
Conta Terceiro — Manserv
Gestora: Roberta Abreu Pestana Guidio Perez Rodrigues


🤝 Contribuindo
Contribuições são bem-vindas!
Para contribuir:

Faça um fork do projeto.
Crie uma branch: git checkout -b feature/minha-feature.
Faça o commit das mudanças: git commit -m "feat: adiciona minha feature".
Faça o push: git push origin feature/minha-feature.
Abra um Pull Request.


📄 Licença
Este projeto pode ser utilizado livremente para fins educacionais.
Se desejar, adicione uma licença formal (ex.: MIT, Apache 2.0) neste repositório.
