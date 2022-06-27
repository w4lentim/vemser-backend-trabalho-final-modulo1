public class Carro implements Impressao{

    private Integer id;
    private String nomeDoCarro;
    private String tipo;
    private String marca;
    private Integer qntPassageiros;
    private Long kmRodados;
    private Double valorAluguelCarro;

    public Carro() {};

    public Carro(Integer id, String nomeDoCarro, String tipo, String marca, Integer qntPassageiros, Long kmRodados, Double valorAluguelCarro) {
        this.id = id;
        this.nomeDoCarro = nomeDoCarro;
        this.tipo = tipo;
        this.marca = marca;
        this.qntPassageiros = qntPassageiros;
        this.kmRodados = kmRodados;
        this.valorAluguelCarro = valorAluguelCarro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        System.out.println("\nID: " + this.id + "\nNome do carro: " + this.nomeDoCarro + "\nTipo: " + this.tipo
                + "\nMarca: " + this.marca + "\nQuantidade de Passageiros: " + this.qntPassageiros + "\nQuilômetros rodados: "
                + this.kmRodados + " km" + "\nValor de Aluguel R$: " + valorAluguelCarro);
    }

    @Override
    public String toString() {
        return "\nID: " + this.id + "\nNome do carro: " + this.nomeDoCarro + "\nTipo: " + this.tipo + "\nMarca: "
                + this.marca + "\nQuantidade de Passageiros: " + this.qntPassageiros + "\nQuilômetros rodados: " + this.kmRodados
                + "km" + "\nValor de Aluguel R$: " + valorAluguelCarro;
    }
}
