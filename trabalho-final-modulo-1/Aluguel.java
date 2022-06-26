public class Aluguel {

    private Integer diaDoAluguel;
    private Integer qntDias;
    private Carro carro;

    static final Double VALOR_DIARIA = 100.00;

    public Aluguel(Integer diaDoAluguel, Integer qntDias, Carro carro) {
        this.diaDoAluguel = diaDoAluguel;
        this.qntDias = qntDias;
        this.carro = carro;
    }
    public Integer getDiaDoAluguel() {
        return diaDoAluguel;
    }
    public void setDiaDoAluguel(Integer diaDoAluguel) {
        this.diaDoAluguel = diaDoAluguel;
    }
    public Integer getQntDias() {
        return qntDias;
    }
    public void setQntDias(Integer qntDias) {
        this.qntDias = qntDias;
    }
    public Carro getCarro() {
        return carro;
    }
    public void setCarro(Carro carro) {
        this.carro = carro;
    }

}
