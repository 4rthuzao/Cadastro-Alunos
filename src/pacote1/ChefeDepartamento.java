package pacote1;

public class ChefeDepartamento extends Funcionario{

    protected String departamento;
    protected String dataPromocao;
    protected double gratificacao;

    public ChefeDepartamento(String nome, int cpf, String dataNascimento, int matricula, String dataAdmissao,
            double salario, String departamento, String dataPromocao, double gratificacao) {
        super(nome, cpf, dataNascimento, matricula, dataAdmissao, salario);
        this.departamento = departamento;
        this.dataPromocao = dataPromocao;
        this.gratificacao = gratificacao;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getDataPromocao() {
        return dataPromocao;
    }
    public void setDataPromocao(String dataPromocao) {
        this.dataPromocao = dataPromocao;
    }
    public double getGratificacao() {
        return gratificacao;
    }
    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

        
    @Override
    public String toString() {
        return "ChefeDepartamento [Nome: " +nome + " CPF: " + cpf + " Nascimento: " + dataNascimento + 
        " Admissão: " + dataAdmissao + " Salario: "+ salario + " Promocao: " + dataPromocao + 
        " Departamento: " + departamento + " Gratificacao: " + gratificacao + "]";
    }

}
