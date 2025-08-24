package desafio;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Pessoa{
    private List<Curso> cursosMinistrados = new ArrayList<>();
    private double salario;

    public Instrutor(){

    }

    public Instrutor(double salario) {
        this.salario = salario;
    }

    public Instrutor(long id, String nome, String email, String senha, double salario) {
        super(id, nome, email, senha);
        this.salario = salario;
    }

    public List<Curso> getCursosMinistrados() {
        return cursosMinistrados;
    }

    public void addCurso(Curso c){
        cursosMinistrados.add(c);
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
}
