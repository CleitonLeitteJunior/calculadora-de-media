import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner (System.in);

        String nomeCompleto, idade, instituicaoEstudo, periodo, turno, curso;
        String materia;
        Double x;
        Double y;
        Double media;

        System.out.print("Este é um validador de notas escolares, aqui, você poderá calcular sua média final\n");
        System.out.print("Abaixo, você irá digitar seus dados, apenas para relatório.\n");

        System.out.print("Digite seu nome: ");
        nomeCompleto = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        idade = scanner.nextLine();

        System.out.print("Digite o nome da instituição de ensino, seja escola ou faculdade: ");
        instituicaoEstudo = scanner.nextLine();

        System.out.print("Digite o nome do curso que faz: ");
        curso = scanner.nextLine();

        System.out.print("Digite o período do curso que está: ");
        periodo = scanner.nextLine();

        System.out.print("Digite o turno que estuda, manhã, tarde ou noite: ");
        turno = scanner.nextLine();

        System.out.print("\nOk, agora que coletamos alguns dados seus, vamos para o próximo passo...");

        System.out.print("\nDigite o nome da matéria que gostaria de saber sua média final: ");
        materia = scanner.nextLine();

         System.out.print("\nDigite a nota da prova 1: ");
        x = scanner.nextDouble();

        System.out.print("Digite a nota da prova 2: ");
        y = scanner.nextDouble();

        media = (x + y) / 2;

        System.out.println("\n---------------- RELATÓRIO FINAL ----------------");
        System.out.println("Aluno: " + nomeCompleto);
        System.out.println("Idade: " + idade);
        System.out.println("Instituição: " + instituicaoEstudo);
        System.out.println("Curso: " + curso);
        System.out.println("Período: " + periodo);
        System.out.println("Turno: " + turno);
        System.out.println("Matéria: " + materia);
        System.out.println("Média final: " + media);
        System.out.println("------------------------------------------------");

        scanner.close();
        
    }
}
