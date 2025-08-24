package com.educamais.desafio;

public class EducaMais {
    public static void main(String[] args) {

        Instrutor instrutor_1 = new Instrutor(1L,"João","Joao@gmail.com","123456",1000.0);

        Curso curso_1 = new Curso(1L,"Curso Java","Ensina Java",3,30.0,true,instrutor_1);

        Aluno aluno_1 = new Aluno(1L,"Juliana","Juliana@gmail.com","1234567");
        Aluno aluno_2 = new Aluno(2L,"Roque","Roque@gmail.com","123456");


        System.out.println("===========PRIMEIRO ALUNO==============");

        aluno_1.matricular(curso_1);
        Matricula matricula_1 = null;
        for(Matricula m : aluno_1.getMatriculas()){
            System.out.println(m);
            matricula_1 = m;
        }

        aluno_1.concluirCurso(curso_1,matricula_1);

        System.out.print("CERTIFICADOS: ");
        for(Certificado c: aluno_1.getCertificados()){
            System.out.println(c);
        }
        System.out.println();

        aluno_1.avaliarCurso(curso_1,5,"excelente!");

        System.out.print("===================================");


        System.out.println("===========SEGUNDO ALUNO==============");

        aluno_2.matricular(curso_1);
        Matricula matricula_2 = null;
        for(Matricula m : aluno_2.getMatriculas()){
            System.out.println(m);
            matricula_2 = m;
        }

        aluno_2.concluirCurso(curso_1,matricula_2);

        for(Certificado c: aluno_2.getCertificados()){
            System.out.println(c);
        }

        aluno_2.avaliarCurso(curso_1,2,"Horrivel!");
        System.out.println("======================================");

        System.out.println("====================Avaliações curso_1====================");
        curso_1.calcularpopularidade();
        for(Avaliacao a: curso_1.getAvaliacoes()){
            System.out.println(a);
        }
        System.out.println("===========================================================");



        }





    }

