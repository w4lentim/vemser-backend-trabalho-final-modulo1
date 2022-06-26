public class Funcionario extends Usuario{
    private String nome;
    private String matricula;

    public Funcionario(String nivel, String nome, String matricula) {
        super(nivel);
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
