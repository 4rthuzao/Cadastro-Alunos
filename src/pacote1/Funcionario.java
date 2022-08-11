package pacote1;

public class Funcionario extends Pessoa{
    protected int matricula;
    protected String dataAdmissao;
    protected double salario;

    public Funcionario(String nome, int cpf, String dataNascimento, int matricula, String dataAdmissao,
            double salario) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

        
    @Override
    public String toString() {
        return "Funcionario [Nome: " +nome + " CPF: " + cpf + " Data de Nascimento: " + dataNascimento + " Data da adsmissão: " + dataAdmissao + " Matricula: " + matricula + " Salario: " + salario + "]";
    }

}

