public class Cliente extends Usuario implements Impressao, Operacao {

    private Aluguel aluguel;

    public Cliente(String nome, String cpf, String nivel, Aluguel aluguel) {
        super(nome, cpf, nivel);
        this.aluguel = aluguel;
    }

    public Aluguel getAluguel() {
        return aluguel;
    }

    public void setAluguel(Aluguel aluguel) {
        this.aluguel = aluguel;
    }

    public void imprimirCliente(){
        System.out.println("Nome do Cliente: " + getNome() + "\nCPF: " + getCpf());
    }

    @Override
    public Double alugar(Double valorDoCarroAlugar, Integer qntDias) {
        if(aluguel.getCarro().getTipo().equals("C")) {
            valorDoCarroAlugar = Aluguel.VALOR_DIARIA * qntDias;
        } else if(aluguel.getCarro().getTipo().equals("B")) {
            valorDoCarroAlugar = Aluguel.VALOR_DIARIA * qntDias * 1.2;
        } else if (aluguel.getCarro().getTipo().equals("A")) {
            valorDoCarroAlugar = Aluguel.VALOR_DIARIA * qntDias * 1.5;
        } else{
            System.out.println("Tipo de Carro informado inválido");
        }
        return valorDoCarroAlugar;
    }

    @Override
    public Boolean pagar(Double valorPagamento, Integer diaDaDevolucao) {
        if(valorPagamento.equals(alugar(getAluguel().getCarro().getValorAluguelCarro(), aluguel.getCarro().calcularDiasComCarro(aluguel, aluguel)))) {
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
    public void imprimir() {

    }

    @Override
    public String toString() {
        return "Nome do cliente: " + getNome() + "\nCPF: " + getCpf();
    }
}