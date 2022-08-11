package pacote1;

public class Aluno extends Pessoa{
    protected int matricula;


    public Aluno(String nome, int cpf, String dataNascimento, int matricula) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno [Nome:" + nome + " CPF: "+ cpf + " Data de nascimento: " + dataNascimento + " Matricula: " + matricula + "]";
    }

    


}