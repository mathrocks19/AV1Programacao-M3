/**
 * Autor: Matheus Viana
 */


package sistemaacademico;

import java.util.ArrayList;
import java.util.List;


public abstract class Aluno extends Pessoa {
    private List<Disciplina> disciplinasInscritas;
    private List<Avaliacao> avaliacoes;
    private boolean graduacao;

    public Aluno(String nome, String cpf, String matricula, String telefone, String email, String endereco, boolean graduacao) {
        super(nome, cpf, matricula, telefone, email, endereco);
        this.graduacao = graduacao;
        this.disciplinasInscritas = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public void inscreverDisciplina(Disciplina disciplina) {
        disciplinasInscritas.add(disciplina);
    }

    public void solicitarBoleto() {
        System.out.println("Solicitação de boleto para o aluno " + this.getNome());
    }

    public void solicitarHistorico() {
        System.out.println("Solicitação de histórico para o aluno " + this.getNome());
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public List<Disciplina> getDisciplinasInscritas() {
        return disciplinasInscritas;
    }

    public boolean isGraduacao() {
        return graduacao;
    }

    public abstract void avancarCurso();
}
