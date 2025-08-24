package com.educamais.desafio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aluno extends Pessoa{
    private List<Matricula> matriculas = new ArrayList<>();
    private List<Certificado> certificados = new ArrayList<>();
    private List<Avaliacao> avaliacoesFeitas = new ArrayList<>();

    public Aluno(){

    }

    public Aluno(long id, String nome, String email, String senha) {
        super(id, nome, email, senha);
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void addMatricula(Matricula matricula){
        if(matriculas.contains(matricula)){
            System.out.println("Matrícula já existe");
            return;
        }

        matriculas.add(matricula);
        System.out.println("Aluno matriculado com a matrícula: " + matricula.getId());
    }

    public void removeMatricula(Matricula matricula){
        if(matriculas.remove(matricula)){
            System.out.println("Matrícula removida com sucesso");
        } else {
            System.out.println("Matrícula não está disponível");
        }
    }


    public void matricular(Curso curso){
        Matricula matricula = new Matricula(matriculas.size()+1,this,curso,new Date(),true);
        addMatricula(matricula);
        curso.addMatricula(matricula);
        System.out.println("Aluno matriculado com sucesso!");


    }

    public List<Certificado> getCertificados() {
        return certificados;
    }

    public void addCertificado(Certificado certificado){
        if(certificados.contains(certificado)){
            System.out.println("Certificado já existe");
            return;
        }
        certificados.add(certificado);
        System.out.println("Certificado adicionado!");
    }

    public void removeCertificado(Certificado certificado){
        for(Certificado c : certificados){
            if(c.equals(certificado)){
                certificados.remove(c);
            }

            System.out.print("Esse certificado não está na lista!");
        }
    }

    public void concluirCurso(Curso curso, Matricula matricula){
        matricula.concluir();
        curso.removeMatricula(matricula);
        Certificado certificado = new Certificado(certificados.size()+1,curso,this,new Date());
        certificados.add(certificado);
    }

    public List<Avaliacao> getAvaliacoesFeitas() {
        return avaliacoesFeitas;
    }

    public void addAvaliacao(Avaliacao avaliacao){
        if(avaliacoesFeitas.contains(avaliacao)){
            System.out.println("Avaliação já está feita");
        }else{
            avaliacoesFeitas.add(avaliacao);
        }
    }

    public void removeAvaliacao(Avaliacao avaliacao){
        avaliacoesFeitas.remove(avaliacao);
    }

    public void avaliarCurso(Curso curso, int nota, String comentario){
        if(nota < 0 || nota > 5){
            System.out.println("Nota inválida!");
            return;
        }


        Avaliacao avaliacao = new Avaliacao(avaliacoesFeitas.size()+1, nota, comentario, this, curso);
        avaliacoesFeitas.add(avaliacao);
        curso.addAvaliacao(avaliacao);

        System.out.println("Curso avaliado com sucesso!");
    }




}
