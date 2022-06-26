public class Carro {

    private String nomeDoCarro;
    private CaracteristicasCarro infoCarro;
    private String tipo;
    private Double valorAluguelCarro;

    public Carro(String nomeDoCarro, CaracteristicasCarro infoCarro, String tipo, Double valorAluguelCarro) {
        this.nomeDoCarro = nomeDoCarro;
        this.infoCarro = infoCarro;
        this.tipo = tipo;
        this.valorAluguelCarro = valorAluguelCarro;
    }

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

    public static Integer calcularDiasComCarro(Aluguel qntDiasCarro, Aluguel diaDoAluguel){
        Integer diasCarro = diaDoAluguel.getDiaDoAluguel() + qntDiasCarro.getQntDias();
        return diasCarro;
    }
}
