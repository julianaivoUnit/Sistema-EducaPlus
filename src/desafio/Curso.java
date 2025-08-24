package desafio;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private long id;
    private String titulo;
    private String descricao;
    private int nivelDificuldade;
    private double valorMatricula;
    private boolean status;
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
        status = status;
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
        return status;
    }

    public void setStatus(boolean status) {
        status = status;
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
        if(matriculas.contains(matricula)){
            System.out.println("Matrícula já existente");
            return;
        }
        matriculas.add(matricula);
        System.out.println("Matrícula adicionada!");
    }


    public void removeMatricula(Matricula matricula) {
        matriculas.remove(matricula);
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void addAvaliacao(Avaliacao avaliacao) {
        if(avaliacoes.contains(avaliacao)){
            System.out.println("Avaliação já existe!");
        }else{
            avaliacoes.add(avaliacao);
        }
    }

    public void removeAvaliacao(Avaliacao avaliacao) {
        avaliacoes.remove(avaliacao);
    }

    public void ativar(){
        status = true;

    }

    public void desativar(){
        status = false;
    }

    public void calcularpopularidade(){
        int soma = 0;
        for(Avaliacao a : avaliacoes) {
            soma+= a.getNota();
        }
        System.out.println("Popularidade: " + soma + " estrelas recebidas");
    }
}
