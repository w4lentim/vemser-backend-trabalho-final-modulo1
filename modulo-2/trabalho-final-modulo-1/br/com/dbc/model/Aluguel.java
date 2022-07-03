package br.com.dbc.model;

import br.com.dbc.model.Carro;
import br.com.dbc.model.Cliente;

public class Aluguel {
    private Integer idAluguel;
    private Cliente cliente;
    private Carro carro;
    private Integer diaDoAluguel;
    private Integer diaDaEntrega;

    public Aluguel() {};

    public Aluguel(Integer idAluguel, Cliente cliente, Carro carro, Integer diaDoAluguel, Integer diaDaEntrega) {
        this.idAluguel = idAluguel;
        this.cliente = cliente;
        this.carro = carro;
        this.diaDoAluguel = diaDoAluguel;
        this.diaDaEntrega = diaDaEntrega;
    }

    public Integer getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(Integer idAluguel) {
        this.idAluguel = idAluguel;
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