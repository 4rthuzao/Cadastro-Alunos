package pacote2;

public class Cliente extends Pessoa {
    protected int codigo;

    
    public Cliente(String nome, String cpf, int codigo) {
        super(nome, cpf);
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Cliente [nome: " + nome + " CPF: "+ cpf + " Codigo: " + codigo + "]";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    
}
