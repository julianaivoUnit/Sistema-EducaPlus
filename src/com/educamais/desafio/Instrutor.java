package com.educamais.desafio;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Pessoa{
    private List<Curso> cursosMinistrados = new ArrayList<>();
    private double salario;

    public Instrutor(){

    }

    public Instrutor(long id, String nome, String email, String senha, double salario) {
        super(id, nome, email, senha);
        this.salario = salario;
    }

    public List<Curso> getCursosMinistrados() {
        return cursosMinistrados;
    }

    public void addCurso(Curso c){
        if(cursosMinistrados.contains(c)){
            System.out.print("esse curso já está aqui");
        }
    }

    public void removeCurso(Curso c){
        cursosMinistrados.remove(c);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void criarCurso(String nome, String descricao, int dificuldade, double valor){
        Curso curso = new Curso(cursosMinistrados.size()+1,nome,descricao,dificuldade,valor,true,this);
        cursosMinistrados.add(curso);
    }
}
