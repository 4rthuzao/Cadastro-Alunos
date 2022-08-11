package pacote1;


public class TestaTudo {    
    public static void main(String[] args) {

    Pessoa pessoa = new Pessoa ("Arthur", 123456789, "11-11-1995");
    Pessoa aluno = new Aluno("José", 123456789, "10-10-2000", 12345);
    Pessoa chefe = new ChefeDepartamento("Carlos", 1235698, "05-02-1990", 12345, "20-08-2000", 5000, "GERENCIA", "10-06-2022", 1000);
    Pessoa funcionario = new Funcionario("Pedro", 1458956, "04-05-2001", 552, "10-08-2020", 2000);

    System.out.println(pessoa.toString() + "\n" + aluno.toString() + "\n" + chefe.toString() + "\n" + funcionario.toString() );

    
    
    }
}
