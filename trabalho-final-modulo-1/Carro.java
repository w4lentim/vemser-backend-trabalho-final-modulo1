public class Carro implements Impressao{

    private String nomeDoCarro;
    private String tipo;
    private String marca;
    private Integer qntPassageiros;
    private Long kmRodados;
    private Double valorAluguelCarro;

    public Carro() {};

    public Carro(String nomeDoCarro, String tipo, String marca, Integer qntPassageiros, Long kmRodados, Double valorAluguelCarro) {
        this.nomeDoCarro = nomeDoCarro;
        this.tipo = tipo;
        this.marca = marca;
        this.qntPassageiros = qntPassageiros;
        this.kmRodados = kmRodados;
        this.valorAluguelCarro = valorAluguelCarro;
    }  

    public String getNomeDoCarro() {
        return nomeDoCarro;
    }

    public void setNomeDoCarro(String nomeDoCarro) {
        this.nomeDoCarro = nomeDoCarro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getQntPassageiros() {
        return qntPassageiros;
    }

    public void setQntPassageiros(Integer qntPassageiros) {
        this.qntPassageiros = qntPassageiros;
    }

    public Long getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(Long kmRodados) {
        this.kmRodados = kmRodados;
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

    @Override
    public void imprimir() {
        System.out.println("Nome do carro: " + nomeDoCarro + "\nTipo:" + tipo + "\nValor de Aluguel:" + valorAluguelCarro);
    }

    @Override
    public String toString() {
        return "\nNome do Carro: " + this.nomeDoCarro + "\nTipo: " + this.tipo
                + " \nValor de aluguel do Carro R$: " + this.valorAluguelCarro;
    }
}
