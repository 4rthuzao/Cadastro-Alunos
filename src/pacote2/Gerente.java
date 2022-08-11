package pacote2;

public class Gerente extends Funcionario {
    protected int area;

    public Gerente(String nome, String cpf, double salario, int matricula, int area) {
        super(nome, cpf, salario, matricula);
        this.area = area;
    }

    @Override
    public String toString() {
        return "Gerente [nome: " + nome + " CPF: "+ cpf +" Matricula: " + matricula + " Salario: " + salario + "Area: " + area + "]";
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

       
}
