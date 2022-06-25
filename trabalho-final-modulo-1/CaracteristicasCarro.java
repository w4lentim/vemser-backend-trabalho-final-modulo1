public class CaracteristicasCarro extends Carro {

    private String marca;
    private String modelo;
    private Integer ano;
    private Integer qntPassageiros;
    private Long kmRodados;

    public CaracteristicasCarro(String marca, String modelo, Integer ano, Integer qntPassageiros, Long kmRodados) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.qntPassageiros = qntPassageiros;
        this.kmRodados = kmRodados;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
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
    
    public void imprimirCaracteristicas() {
        System.out.println("Marca: " + getMarca() + "\nModelo: " + getModelo() + "Ano: " + getAno() + "Quantidade de passageiros: " + getQntPassageiros() + "Quilômetros rodados (km): " + getKmRodados());
    }
    
}
