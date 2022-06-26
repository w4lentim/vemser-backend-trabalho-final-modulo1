import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Aluguel extends Carro{
    private Integer diaDoAluguel;
    private Integer qntDias;
    private Double qntCombustivel;

    public Aluguel(Integer diaDoAluguel, Integer qntDias, Double qntCombustivel) {
        this.diaDoAluguel = diaDoAluguel;
        this.qntDias = qntDias;
        this.qntCombustivel = qntCombustivel;
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
    public Double getQntCombustivel() {
        return qntCombustivel;
    }
    public void setQntCombustivel(Double qntCombustivel) {
        this.qntCombustivel = qntCombustivel;
    }

    public Integer calcularDiasComCarro(LocalDate retirada, LocalDate devolucao){
        Integer qntDias = Math.toIntExact(ChronoUnit.DAYS.between(retirada, devolucao));
        return qntDias;
    }
}
