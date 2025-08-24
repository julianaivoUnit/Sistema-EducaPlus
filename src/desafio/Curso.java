package desafio;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private long id;
    private String titulo;
    private String descricao;
    private int nivelDificuldade;
    private double valorMatricula;
    private boolean Status;
    private Instrutor instrutor;
    private List<Matricula> matriculas = new ArrayList<>();
    private List<Avaliacao> avaliacoes = new ArrayList<>();

    public Curso() {

    }

    public Curso(long id, String titulo, String descricao, int nivelDificuldade, double valorMatricula, boolean status, Instrutor instrutor) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.nivelDificuldade = nivelDificuldade;
        this.valorMatricula = valorMatricula;
        Status = status;
        this.instrutor = instrutor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(double valorMatricula) {
        this.valorMatricula = valorMatricula;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void addMatricula(Matricula matricula) {
        for (Matricula m : matriculas) {
            if(m.equals(matricula)) {
                System.out.println("Matricula ja existente");
            }

            matriculas.add(matricula);
            System.out.print("Matricula adicionado");
        }
    }

    public void removeMatricula(Matricula matricula) {
        for (Matricula m : matriculas) {
            if(m.equals(matricula)) {
                matriculas.remove(m);
            }

            System.out.print("Matricula não está na lista");
        }
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void addAvaliacao(Avaliacao avaliacao) {
        for(Avaliacao a : avaliacoes) {
            if(a.equals(avaliacao)) {
                System.out.println("Avaliacao ja existente");
            }

            avaliacoes.add(avaliacao);
            System.out.print("Avaliação adicionada");
        }
    }

    public void removeAvaliacao(Avaliacao avaliacao) {
        for(Avaliacao a : avaliacoes) {
            if(a.equals(avaliacao)) {
                avaliacoes.remove(a);
            }

            System.out.print("Essa avaliacao não está presente na lista");
        }
    }

    public void ativar(){
        Status = true;

    }

    public void desativar(){
        Status = false;
    }

    public void calcularpopularidade(){
        int soma = 0;
        for(Avaliacao a : avaliacoes) {
            soma+= a.getNota();
        }
        System.out.println("Popularidade: " + soma);
    }
}
