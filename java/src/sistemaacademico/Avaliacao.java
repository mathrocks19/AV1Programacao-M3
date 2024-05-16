/**
 * Autor: Matheus Viana
 */
package sistemaacademico;

import java.util.HashMap;
import java.util.Map;

public class Avaliacao {
    private String nome;
    private String data;
    private double peso;
    private Map<Aluno, Double> notasAlunos;

    public Avaliacao(String nome, String data, double peso) {
        this.nome = nome;
        this.data = data;
        this.peso = peso;
        this.notasAlunos = new HashMap<>();
    }

    public void adicionarNota(Aluno aluno, double nota) {
        notasAlunos.put(aluno, nota);
    }

    public double getNotaAluno(Aluno aluno) {
        return notasAlunos.getOrDefault(aluno, 0.0);
    }

    public String getNome() {
        return nome;
    }
}