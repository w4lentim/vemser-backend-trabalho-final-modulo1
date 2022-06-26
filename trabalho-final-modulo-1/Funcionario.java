public class Funcionario extends Usuario {
    private String matricula;


    public Funcionario(String nome, String cpf, String nivel, String matricula) {
        super(nome, cpf, nivel);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
