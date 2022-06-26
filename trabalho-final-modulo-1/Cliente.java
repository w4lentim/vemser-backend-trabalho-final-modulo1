public class Cliente extends Usuario{
    private String nome;
    private String cpf;

    public Cliente(String nivel, String nome, String cpf) {
        super(nivel);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void imprimirCliente(){
        System.out.println("Nome do Cliente: " + getNome() + "\nCPF: " + getCpf());
    }

    @Override
    public String toString() {
        return "Nome do cliente: " + getNome() + "\nCPF: " + getCpf();
    }
    
}