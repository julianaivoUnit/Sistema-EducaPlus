package desafio;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Pessoa{
    private List<Curso> cursosMinistrados = new ArrayList<>();
    private List<Avaliacao> avaliacoesRecebidas = new ArrayList<>();
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

    public List<Avaliacao> getAvaliacoesRecebidas() {
        return avaliacoesRecebidas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
