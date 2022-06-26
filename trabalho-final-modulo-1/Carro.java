public abstract class Carro {

    private String nomeDoCarro;
    private CaracteristicasCarro infoCarro;
    private String tipo;
    private Double valorAluguelCarro;

    public String getNomeDoCarro() {
        return nomeDoCarro;
    }

    public void setNomeDoCarro(String nomeDoCarro) {
        this.nomeDoCarro = nomeDoCarro;
    }

    public CaracteristicasCarro getInfoCarro() {
        return infoCarro;
    }

    public void setInfoCarro(CaracteristicasCarro infoCarro) {
        this.infoCarro = infoCarro;
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
