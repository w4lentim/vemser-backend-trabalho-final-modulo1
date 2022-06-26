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
    public Double alugar(Double valorDoCarroAlugar) {
        if(aluguel.getCarro().getTipo().equals("C")) {
            valorDoCarroAlugar = aluguel.getCarro().getValorAluguelCarro() * aluguel.getQntDias();
            System.out.println(valorDoCarroAlugar + " Aluguel C");
        } else if(aluguel.getCarro().getTipo().equals("B")) {
            valorDoCarroAlugar = aluguel.getCarro().getValorAluguelCarro() * aluguel.getQntDias() * 1.2;
            System.out.println(valorDoCarroAlugar + " Aluguel B");
        } else if (aluguel.getCarro().getTipo().equals("A")) {
            valorDoCarroAlugar = aluguel.getCarro().getValorAluguelCarro() * aluguel.getQntDias() * 1.5;
            System.out.println(valorDoCarroAlugar + " Aluguel A");
        } else{
            System.out.println("Tipo de Carro informado inválido");
        }
        return valorDoCarroAlugar;
    }

    @Override
    public Boolean pagar(Double valorPagamento, Double valorCarroAlugar) {
        if(valorPagamento.equals(alugar(valorCarroAlugar))) {
            System.out.println(valorPagamento + " Carro alugado com sucesso");
            return true;
        } else {
            System.out.println(valorPagamento + " Valor não corresponde ao valor do aluguel");
            return false;
        }
    }

    @Override
    public Boolean devolver(Integer diaEntregue) {
        Double multaExcesso;
        if(diaEntregue.equals(aluguel.getDiaDoAluguel() + aluguel.getQntDias())) {
            System.out.println("Carro entregue com sucesso.");
            return true;
        } else {
            System.out.println("Carro entregue excedendo o dia de entrega.");
            multaExcesso = Double.valueOf((diaEntregue - (aluguel.getDiaDoAluguel() + aluguel.getQntDias())));
            System.out.println("Valor da multa: " + multaExcesso);
            return false;
        }
    }

    @Override
    public void imprimir() {};

    @Override
    public String toString() {
        return "Nome do cliente: " + getNome() + "\nCPF: " + getCpf();
    }
}