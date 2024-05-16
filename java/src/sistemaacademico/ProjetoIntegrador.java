/**
 * Autor: Matheus Viana
 */
package sistemaacademico;

public class ProjetoIntegrador {
    private String titulo;
    private String descricao;
    private String status;

    public ProjetoIntegrador() {
        this.status = "Em andamento";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}