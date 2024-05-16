/**
 * Autor: Matheus Viana
 */
package sistemaacademico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Disciplina {
    private String nome;
    private String codigo;
    private int cargaHoraria;
    private List<Aluno> alunosMatriculados;
    private List<Avaliacao> avaliacoes;
    private Map<Aluno, Double> frequencias;

    public Disciplina(String nome, String codigo, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.alunosMatriculados = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
        this.frequencias = new HashMap<>();
    }

    public void inscreverAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public void registrarFrequencia(Aluno aluno, double frequencia) {
        this.frequencias.put(aluno, frequencia);
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public double getFrequencia(Aluno aluno) {
        return this.frequencias.getOrDefault(aluno, 0.0);
    }
}