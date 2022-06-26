public class Cliente extends Aluguel implements Impressao, Operacao {

    private String nome;
    private String cpf;

    public Cliente(Integer diaDoAluguel, Integer qntDias, Carro nomeCarro, Carro tipoCarro, String nome, String cpf) {
        super(diaDoAluguel, qntDias, nomeCarro, tipoCarro);
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
    public Double alugar(Double valorAluguel, Integer qntDias) {
        if(getTipo() == "C") {
            valorAluguel = Aluguel.VALOR_DIARIA * qntDias;
        } else if(getTipo() == "B") {
            valorAluguel = Aluguel.VALOR_DIARIA * qntDias * 1.2;
        } else if (getTipo() == "A") {
            valorAluguel = Aluguel.VALOR_DIARIA * qntDias * 1.5;
        } else{
            System.out.println("Tipo de Carro informado inválido");
        }
        return this.setValorAluguelCarro(valorAluguel);
    }

    @Override
    public Boolean pagar(Double valorPagamento) {
        if(valorPagamento == (getValorAluguelCarro())) {
            System.out.println("Carro alugado com sucesso");
            return true;
        } else {
            System.out.println("Valor não corresponde ao valor do aluguel");
            return false;
        }
    }

    @Override
    public Boolean devolver() {
        return null;
    }

    @Override
    public Double multa() {
        return null;
    }

    @Override
    public Double alugar() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void imprimir() {

    }

    @Override
    public String toString() {
        return "Nome do cliente: " + getNome() + "\nCPF: " + getCpf();
    }
}