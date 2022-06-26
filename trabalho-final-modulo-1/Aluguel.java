
public class Aluguel extends Cliente{
    private Integer diaDoAluguel;
    private Integer qntDias;
    static final Double VALOR_DIARIA = 100.00;


    public Aluguel(String nivel, String nome, String cpf, Integer diaDoAluguel, Integer qntDias) {
        super(nivel, nome, cpf);
        this.diaDoAluguel = diaDoAluguel;
        this.qntDias = qntDias;
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

    public Integer calcularDiasComCarro(Integer retirada, Integer devolucao){
        this.qntDias = devolucao - retirada;
        return qntDias;
    }
}
