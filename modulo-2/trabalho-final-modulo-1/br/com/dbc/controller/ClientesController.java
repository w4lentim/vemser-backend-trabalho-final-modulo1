package br.com.dbc.controller;

import br.com.dbc.model.Cliente;
import br.com.dbc.model.Database;

import java.util.ArrayList;

public class ClientesController {

    public ClientesController() {};

    public static ClientesController clientesController = new ClientesController();
    public ArrayList<Cliente> inicializarClientes() {
        ArrayList<Cliente> retorno = new ArrayList<>();
        retorno.add(new Cliente(1, "Willian", "88822233322", "859182845", "Rua das Flores", 900.00));
        retorno.add(new Cliente(2, "Afonso", "22233311144", "55555566", "Rua das Pedras", 800.00));
        retorno.add(new Cliente(3, "Pedro", "8887776655", "333344442", "Rua dos Sapatos", 1000.00));
        return retorno;
    }

    public Cliente selecionarCliente(Integer id) {
        ArrayList<Cliente> clientes = Database.database.getClientes();
        if (clientes != null) {
            for (int index = 0; index < clientes.size(); index++) {
                if (clientes.get(index).getIdCliente() == id) {
                    System.out.println("br.com.dbc.model.Cliente selecionado: " + clientes.get(index).getIdCliente());
                    return clientes.get(index);
                }
            }
        }
        return null;
    }
}
