package pacote1;

public class Pessoa {

        protected String nome;
        protected int cpf;
        protected String dataNascimento;

        
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public int getCpf() {
            return cpf;
        }
        public void setCpf(int cpf) {
            this.cpf = cpf;
        }
        public String getDataNascimento() {
            return dataNascimento;
        }
        public void setDataNascimento(String dataNascimento) {
            this.dataNascimento = dataNascimento;
        }
        public Pessoa(String nome, int cpf, String dataNascimento) {
            this.nome = nome;
            this.cpf = cpf;
            this.dataNascimento = dataNascimento;
        }
        
       
        @Override
        public String toString() {
            return "Pessoa [Nome:" + nome + " Nascimento: " + dataNascimento + " CPF: " + cpf + "]";
        }
    }

