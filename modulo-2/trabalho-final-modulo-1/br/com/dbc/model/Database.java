package br.com.dbc.model;

import br.com.dbc.controller.CarrosController;
import br.com.dbc.controller.ClientesController;

import java.util.ArrayList;

public class Database {
    private ArrayList<Carro> carros;
    private ArrayList<Cliente> clientes;

    private ArrayList<Aluguel> alugueis;

    public static Database database = new Database();

//    public Database() {
//        this.carros = CarrosController.carrosController.inicializarCarros();
//        this.clientes = ClientesController.clientesController.inicializarClientes();
//        this.alugueis = new ArrayList<>();
//    }

    public ArrayList<Carro> getCarros() {
        return this.carros;
    }

    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }

    public ArrayList<Aluguel> getAlugueis() {
        return this.alugueis;
    }
}
