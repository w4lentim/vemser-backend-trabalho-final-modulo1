public abstract class Usuario {

    private String nome;
    private String cpf;
    private String nivel;

    public Usuario(String nome, String cpf, String nivel) {
        this.nome = nome;
        this.cpf = cpf;
        this.nivel = nivel;
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

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
