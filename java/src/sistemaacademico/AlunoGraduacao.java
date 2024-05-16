package sistemaacademico;

public class AlunoGraduacao extends Aluno {
    private int semestreAtual;
    private ProjetoIntegrador projetoIntegrador;

    public AlunoGraduacao(String nome, String cpf, String matricula, String telefone, String email, String endereco) {
        super(nome, cpf, matricula, telefone, email, endereco, true);
        this.semestreAtual = 1; // 
        this.projetoIntegrador = new ProjetoIntegrador();
    }

    public int getSemestreAtual() {
        return semestreAtual;
    }

    public ProjetoIntegrador getProjetoIntegrador() {
        return projetoIntegrador;
    }

    @Override
    public void avancarCurso() {
        if (getSemestreAtual() < 5) {
            semestreAtual++;
            System.out.println(getNome() + " avançou para o semestre " + semestreAtual);
        } else {
            System.out.println(getNome() + " já concluiu os 5 semestres.");
        }
    }
}