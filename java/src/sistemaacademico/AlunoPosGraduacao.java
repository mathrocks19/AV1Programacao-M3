/**
 * Autor: Matheus Viana
 */

package sistemaacademico;

public class AlunoPosGraduacao extends Aluno {
    private int moduloAtual;
    private String trabalhoConclusaoCurso;

    public AlunoPosGraduacao(String nome, String cpf, String matricula, String telefone, String email, String endereco) {
        super(nome, cpf, matricula, telefone, email, endereco, false);
        this.moduloAtual = 1; 
    }

    public int getModuloAtual() {
        return moduloAtual;
    }

    public String getTrabalhoConclusaoCurso() {
        return trabalhoConclusaoCurso;
    }

    public void setTrabalhoConclusaoCurso(String trabalhoConclusaoCurso) {
        this.trabalhoConclusaoCurso = trabalhoConclusaoCurso;
    }

    @Override
    public void avancarCurso() {
        if (getModuloAtual() < 6) {
            moduloAtual++;
            System.out.println(getNome() + " avançou para o módulo " + moduloAtual);
        } else {
            System.out.println(getNome() + " já concluiu os 6 módulos.");
        }
    }
}