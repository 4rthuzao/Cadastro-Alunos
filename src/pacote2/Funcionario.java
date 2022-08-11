package pacote2;

public class Funcionario extends Pessoa{
    protected double salario;
    protected int matricula;

    
    public Funcionario(String nome, String cpf, double salario, int matricula) {
        super(nome, cpf);
        this.salario = salario;
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        return "Funcionario [nome: " + nome + " CPF: "+ cpf +" Matricula: " + matricula + " Salario: " + salario + "]";
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }


    public int getMatricula() {
        return matricula;
    }


    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    
    
}
