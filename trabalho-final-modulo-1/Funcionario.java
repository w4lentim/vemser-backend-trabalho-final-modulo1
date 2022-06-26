public class Funcionario extends Cliente {
    private Cliente nomeFuncionario;
    private String matricula;


    public Funcionario(Integer diaDoAluguel, Integer qntDias, Carro nomeCarro, Carro tipoCarro, String nome, String cpf,
            Cliente nomeFuncionario, String matricula) {
        super(diaDoAluguel, qntDias, nomeCarro, tipoCarro, nome, cpf);
        this.nomeFuncionario = nomeFuncionario;
        this.matricula = matricula;
    }

    public Cliente getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(Cliente nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void imprimirFuncionario() {
        System.out.println("Nome do Funcionário: " + getNomeFuncionario() + "\nMatricula: " + getMatricula());
    }

    @Override
    public void imprimir() {

    }

    @Override
    public String toString() {
        return "Nome do Funcionário: " + getNomeFuncionario() + "\nMatricula: " + getMatricula();
    }
}
