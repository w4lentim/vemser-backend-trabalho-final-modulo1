public class Aluguel {
    
    private Cliente cliente;
    private Carro carro;
    private Integer idAluguel;
    private Integer diaDoAluguel;
    private Integer diaDaEntrega;

    public Aluguel(Cliente cliente, Carro carro, Integer idAluguel, Integer diaDoAluguel, Integer diaDaEntrega) {
        this.cliente = cliente;
        this.carro = carro;
        this.idAluguel = idAluguel;
        this.diaDoAluguel = diaDoAluguel;
        this.diaDaEntrega = diaDaEntrega;
    }

    public Integer imprimirDiasComCarro() {
        Integer diasTotais = this.getDiaDaEntrega() - this.getDiaDoAluguel();
        return diasTotais;
    }

    public Double calcularDiarias() {
        Double valorDiarias = 0.0;
        if (carro.getClasse().equals("C")) {
            valorDiarias = imprimirDiasComCarro() * carro.getPrecoDiaria();
        } else if (carro.getClasse().equals("B")) {
            valorDiarias = imprimirDiasComCarro() * carro.getPrecoDiaria() * 1.2;
        } else if (carro.getClasse().equals("A")) {
            valorDiarias = imprimirDiasComCarro() * carro.getPrecoDiaria() * 1.5;
        }
        return valorDiarias;
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