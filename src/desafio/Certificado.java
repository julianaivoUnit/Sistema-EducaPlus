package desafio;

import java.util.Date;

public class Certificado {
    private long id;
    private Curso curso;
    private Aluno aluno;
    private Date dataEmissao;

    public Certificado() {

    }

    public Certificado(long id, Curso curso, Aluno aluno, Date dataEmissao) {
        this.id = id;
        this.curso = curso;
        this.aluno = aluno;
        this.dataEmissao = dataEmissao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    @Override
    public String toString() {
        return "Certificado{" +
                "id=" + id +
                ", curso=" + curso +
                ", aluno=" + aluno +
                ", dataEmissao=" + dataEmissao +
                '}';
    }
}
