package desafio;

import java.util.Date;

public class Matricula {
    private long id;
    private Aluno aluno;
    private Curso curso;
    private Date dataMatricula;
    private boolean status;

    private Matricula(){

    }

    public Matricula(long id, Aluno aluno, Curso curso, Date dataMatricula, boolean status) {
        this.id = id;
        this.aluno = aluno;
        this.curso = curso;
        this.dataMatricula = dataMatricula;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void concluir(){
        status = false;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "id=" + id +
                ", aluno=" + aluno.getNome() +
                ", curso=" + curso.getTitulo() +
                ", dataMatricula=" + dataMatricula +
                ", status=" + status +
                '}';
    }
}
