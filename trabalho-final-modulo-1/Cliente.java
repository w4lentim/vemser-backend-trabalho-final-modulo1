public class Cliente extends Usuario implements Operacao{
    private String nome;
    private String cpf;

    public Cliente(String nivel, String nome, String cpf, Integer diaDoAluguel, Integer qntDias, String nivel1, String nome1, String cpf1) {
        super(nivel, nome, cpf, diaDoAluguel, qntDias, nivel1);
        this.nome = nome1;
        this.cpf = cpf1;
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
        if()
        return null;
    }
}