/**
 * Autor: Matheus Viana
 */
package sistemaacademico;

public class Professor extends Pessoa {
    private Disciplina disciplina;

    public Professor(String nome, String cpf, String matricula, String telefone, String email, String endereco) {
        super(nome, cpf, matricula, telefone, email, endereco);
    }

    public void ministrarDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void lancarNota(Aluno aluno, Avaliacao avaliacao, double nota) {
        avaliacao.adicionarNota(aluno, nota);
        if (!aluno.getAvaliacoes().contains(avaliacao)) {
            aluno.getAvaliacoes().add(avaliacao);
        }
    }

    public void lancarFrequencia(Aluno aluno, double frequencia) {
        disciplina.registrarFrequencia(aluno, frequencia);
    }

    public void matricularAluno(Aluno aluno) {
        disciplina.inscreverAluno(aluno);
        aluno.inscreverDisciplina(disciplina);
        System.out.println("Aluno matriculado com sucesso na disciplina " + disciplina.getNome());
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
}
