public class Aluguel extends Carro {

    private Integer diaDoAluguel;
    private Integer qntDias;
    private Carro nomeCarro;
    private Carro tipoCarro;

    static final Double VALOR_DIARIA = 100.00;

    public Aluguel(Integer diaDoAluguel, Integer qntDias, Carro nomeCarro, Carro tipoCarro) {
        this.diaDoAluguel = diaDoAluguel;
        this.qntDias = qntDias;
        this.nomeCarro = nomeCarro;
        this.tipoCarro = tipoCarro;
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

    public Carro getNomeCarro() {
        return nomeCarro;
    }
    public void setNomeCarro(Carro nomeCarro) {
        this.nomeCarro = nomeCarro;
    }
    public Carro getTipoCarro() {
        return tipoCarro;
    }
    public void setTipoCarro(Carro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }
    public Integer calcularDiasComCarro(Devolucao diaDaDevolucao, Aluguel diaDoAluguel){
        
        return qntDias;
    }
}
