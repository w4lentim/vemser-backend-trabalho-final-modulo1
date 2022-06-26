import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Carro {
    private CaracteristicasCarro nomeCarro;
    private String tipo;
    private Double valorAluguelCarro;


    public CaracteristicasCarro getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(CaracteristicasCarro nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValorAluguelCarro() {
        return valorAluguelCarro;
    }

    public Double setValorAluguelCarro(Double valorAluguelCarro) {
        this.valorAluguelCarro = valorAluguelCarro;
        return valorAluguelCarro;
    }

}
