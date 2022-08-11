package pacote2;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoa {    
public List<Pessoa> lista = new ArrayList<Pessoa>(); 

public void cadastrarPessoa(Pessoa pessoa){
lista.add(pessoa);
}

public void mostrarPessoa (){
for (Pessoa pessoa : lista){
    System.out.println(pessoa.toString());
}
}
public static void main(String[] args) {
    CadastroPessoa cadastro = new CadastroPessoa();
    Pessoa pessoa = new Pessoa("Arthur", "123456");
    Pessoa funcionario = new Funcionario("joao", "654321", 1200, 1);
    Pessoa gerente = new Gerente("Carlos", "951753", 4000, 2, 10);
    Pessoa cliente = new Cliente("Danilo", "3579651", 20);

        cadastro.cadastrarPessoa(pessoa);
        cadastro.cadastrarPessoa(cliente);
        cadastro.cadastrarPessoa(funcionario);
        cadastro.cadastrarPessoa(gerente);
        cadastro.mostrarPessoa();


}
}
