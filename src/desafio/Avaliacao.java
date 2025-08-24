package desafio;

public class Avaliacao {
    private long id;
    private int nota;
    private String comentario;
    private Aluno alunoAutor;
    private Curso curso;

    public Avaliacao() {

    }

    public Avaliacao(long id, int nota, String comentario, Aluno alunoAutor, Curso curso) {
        this.id = id;
        this.nota = nota;
        this.comentario = comentario;
        this.alunoAutor = alunoAutor;
        this.curso = curso;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Aluno getAlunoAutor() {
        return alunoAutor;
    }

    public void setAlunoAutor(Aluno alunoAutor) {
        this.alunoAutor = alunoAutor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
