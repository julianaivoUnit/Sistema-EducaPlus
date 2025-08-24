package desafio;

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
        for(Matricula m : matriculas){
            if(m.equals(matricula)){
                System.out.println("Matricula ja existe");
            }

            matriculas.add(matricula);
            System.out.print("Aluno matriculado com a matriculas: " + matricula.getId());
        }
    }

    public void removeMatricula(Matricula matricula){
        for(Matricula m : matriculas){
            if(m.equals(matricula)){
                matriculas.remove(m);
            }

            System.out.print("Matricula não está disponivel;");
        }
    }

    public void matricular(Curso curso){
        Matricula matricula = new Matricula(matriculas.size()+1,this,curso,new Date(),true);
        addMatricula(matricula);
        //a fazer


    }

    public List<Certificado> getCertificados() {
        return certificados;
    }

    public void addCertificado(Certificado certificado){
        for(Certificado c : certificados){
            if(c.equals(certificado)){
                System.out.println("Certificado ja existe");
            }

            certificados.add(certificado);
            System.out.println("Certificado adicionado!");
        }
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


    }

    public List<Avaliacao> getAvaliacoesFeitas() {
        return avaliacoesFeitas;
    }


}
