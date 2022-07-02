public class Aluguel {
    
    private Cliente cliente;
    private Carro carro;
    private Integer idAluguel;
    private Integer diaDoAluguel;
    private Integer diaDaEntrega;

    public Aluguel() {};

    public Aluguel(Cliente cliente, Carro carro, Integer idAluguel, Integer diaDoAluguel, Integer diaDaEntrega) {
        this.cliente = cliente;
        this.carro = carro;
        this.idAluguel = idAluguel;
        this.diaDoAluguel = diaDoAluguel;
        this.diaDaEntrega = diaDaEntrega;
    }

    public Double valorDoAluguel() {
        if (this.carro == null) {
            return 0.0;
        } else {
            return (this.diaDaEntrega - this.diaDoAluguel) * this.carro.getPrecoDiaria();
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Integer getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(Integer idAluguel) {
        this.idAluguel = idAluguel;
    }

    public Integer getDiaDoAluguel() {
        return diaDoAluguel;
    }

    public void setDiaDoAluguel(Integer diaDoAluguel) {
        this.diaDoAluguel = diaDoAluguel;
    }

    public Integer getDiaDaEntrega() {
        return diaDaEntrega;
    }

    public void setDiaDaEntrega(Integer diaDaEntrega) {
        this.diaDaEntrega = diaDaEntrega;
    }
}