import java.text.DecimalFormat;

public class Carro {

    private Integer idCarro;
    private String alugado;
    private String nomeCarro;
    private String marca;
    private String classe;
    private Integer qntPassageiros;
    private Integer kmRodados;
    private Double precoDiaria;

    public Carro() {};

    public Carro(Integer idCarro, String alugado, String nomeCarro, String marca, String classe, Integer qntPassageiros, Integer kmRodados, Double precoDiaria) {
        this.idCarro = idCarro;
        this.alugado = alugado;
        this.nomeCarro = nomeCarro;
        this.marca = marca;
        this.classe = classe;
        this.qntPassageiros = qntPassageiros;
        this.kmRodados = kmRodados;
        this.precoDiaria = precoDiaria;
    }

    public Integer getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(Integer idCarro) {
        this.idCarro = idCarro;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Integer getQntPassageiros() {
        return qntPassageiros;
    }

    public void setQntPassageiros(Integer qntPassageiros) {
        this.qntPassageiros = qntPassageiros;
    }

    public Integer getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(Integer kmRodados) {
        this.kmRodados = kmRodados;
    }

    public Double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(Double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public String getAlugado() {
        return alugado;
    }

    public void setAlugado(String alugado) {
        this.alugado = alugado;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return "{"
                + "\"id\": " + idCarro + ", "
                + "\"nome\": \"" + nomeCarro + "\", "
                + "\"marca\": \"" + marca + "\", "
                + "\"classe\": \"" + classe + "\", "
                + "\"kmRodados\": " + kmRodados + ", "
                + "\"precoDiaria\": " + df.format(precoDiaria) + ", "
                + "\"qntPassageiros\": " + qntPassageiros + ", "
                + "\"alugado\": \"" + alugado
                + "\"}";
    }
}
