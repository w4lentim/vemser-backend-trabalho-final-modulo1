package br.com.dbc.service;

import br.com.dbc.exception.BancoDeDadosException;
import br.com.dbc.model.Cliente;
import br.com.dbc.model.Database;
import br.com.dbc.repository.ClienteRepository;

import java.util.ArrayList;

public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService() {
        clienteRepository = new ClienteRepository();
    }

    public static ClienteService clientesService = new ClienteService();

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

    public void adicionarCliente(Cliente cliente) {
        try {
            Cliente clienteAdicionado = clienteRepository.adicionar(cliente);
            System.out.println("cliente adicinado com sucesso! " + clienteAdicionado);
        } catch (BancoDeDadosException e) {
            e.printStackTrace();
        }
    }

    public void removerCliente(Integer id) {
        try {
            boolean conseguiuRemover = clienteRepository.remover(id);
            System.out.println("removido? " + conseguiuRemover + "| com id=" + id);
        } catch (BancoDeDadosException e) {
            e.printStackTrace();
        }
    }

    public void atualizarCliente(Integer id, Cliente cliente) {
        try {
            boolean conseguiuEditar = clienteRepository.editar(id, cliente);
            System.out.println("editado? " + conseguiuEditar + "| com id=" + id);
        } catch (BancoDeDadosException e) {
            e.printStackTrace();
        }
    }

    public void listarClientes() {
        try {
            clienteRepository.listar().forEach(System.out::println);
        } catch (BancoDeDadosException e) {
            e.printStackTrace();
        }
    }

//    public void listarClientePorCodigoDoCliente(Integer idCliente) {
//        try {
//            clienteRepository,listarClientePorCodigoDoCliente(idCliente).forEach(System.out::println);
//        } catch (BancoDeDadosException e) {
//            e.printStackTrace();
//        }
}

