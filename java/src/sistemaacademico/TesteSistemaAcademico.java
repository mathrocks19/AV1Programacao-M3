/**
 * Autor: Matheus Viana
 */
package sistemaacademico;

import java.util.Scanner;

public class TesteSistemaAcademico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro do professor
        System.out.println("Cadastro do Professor:");
        System.out.print("Nome: ");
        String nomeProfessor = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfProfessor = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matriculaProfessor = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneProfessor = scanner.nextLine();
        System.out.print("Email: ");
        String emailProfessor = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoProfessor = scanner.nextLine();

        Professor professor = new Professor(nomeProfessor, cpfProfessor, matriculaProfessor, telefoneProfessor, emailProfessor, enderecoProfessor);

        // Cadastro da disciplina
        System.out.println("\nCadastro da Disciplina:");
        System.out.print("Nome: ");
        String nomeDisciplina = scanner.nextLine();
        System.out.print("Código: ");
        String codigoDisciplina = scanner.nextLine();
        System.out.print("Carga Horária: ");
        int cargaHorariaDisciplina = Integer.parseInt(scanner.nextLine());

        Disciplina disciplina = new Disciplina(nomeDisciplina, codigoDisciplina, cargaHorariaDisciplina);
        professor.ministrarDisciplina(disciplina);

        // Cadastro do aluno
        System.out.println("\nCadastro do Aluno:");
        System.out.print("Nome: ");
        String nomeAluno = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfAluno = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matriculaAluno = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneAluno = scanner.nextLine();
        System.out.print("Email: ");
        String emailAluno = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoAluno = scanner.nextLine();
        System.out.print("Tipo (Graduacao/PosGraduacao): ");
        String tipoAluno = scanner.nextLine();

        Aluno aluno;
        if (tipoAluno.equalsIgnoreCase("Graduacao")) {
            aluno = new AlunoGraduacao(nomeAluno, cpfAluno, matriculaAluno, telefoneAluno, emailAluno, enderecoAluno);
        } else {
            aluno = new AlunoPosGraduacao(nomeAluno, cpfAluno, matriculaAluno, telefoneAluno, emailAluno, enderecoAluno);
        }

        // Matricular aluno na disciplina
        professor.matricularAluno(aluno);

        // Lançar nota para aluno
        System.out.print("\nNome da Avaliação: ");
        String nomeAvaliacao = scanner.nextLine();
        System.out.print("Data da Avaliação: ");
        String dataAvaliacao = scanner.nextLine();
        System.out.print("Peso da Avaliação: ");
        double pesoAvaliacao = Double.parseDouble(scanner.nextLine());

        Avaliacao avaliacao = new Avaliacao(nomeAvaliacao, dataAvaliacao, pesoAvaliacao);
        disciplina.adicionarAvaliacao(avaliacao);

        System.out.print("Nota do aluno: ");
        double notaAluno = Double.parseDouble(scanner.nextLine());
        professor.lancarNota(aluno, avaliacao, notaAluno);

        // Lançar frequência para aluno
        System.out.print("Frequência do aluno (%): ");
        double frequenciaAluno = Double.parseDouble(scanner.nextLine());
        professor.lancarFrequencia(aluno, frequenciaAluno);

        
        System.out.println("\nInformações cadastradas:");
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Nota: " + notaAluno);
        System.out.println("Frequência: " + frequenciaAluno + "%");

        // Verificar e avançar no curso do aluno
        System.out.println("Avanço do aluno no aluno:");
        aluno.avancarCurso();

        // 
        //if (!aluno.isGraduacao() && ((AlunoPosGraduacao) aluno).getModuloAtual() == 6) {
        	//System.out.println("Aluno de pós-graduação deve iniciar o Trabalho de Conclusão de Curso.");
        //}

        scanner.close();
    }
}