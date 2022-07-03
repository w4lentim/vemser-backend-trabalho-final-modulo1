package br.com.dbc.service;

import br.com.dbc.exception.BancoDeDadosException;
import br.com.dbc.model.Cliente;
import br.com.dbc.repository.ClienteRepository;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService() {
        clienteRepository = new ClienteRepository();
    }

    public static ClienteService clientesService = new ClienteService();

    public Cliente selecionarCliente(Integer id) throws BancoDeDadosException {
        Cliente clienteSelec = clienteRepository.selecionar(id);
        if (clienteSelec != null) {
            for (int index = 0; index < clienteSelec.getIdCliente(); index++) {
                if (clienteSelec.getIdCliente() == id) {
                    System.out.println("Cliente selecionado: " + clienteSelec.getIdCliente());
                    return clienteSelec;
                }
            }
        }
        return null;
    }

    public void adicionarCliente(Cliente cliente) {
        try {
            if (cliente.getCpf().length() != 14){
                throw new Exception("CPF inválido!");
            }
            if (cliente.getTelefone().length() != 14){
                throw new Exception("Telefone inválido!");
            }
                Cliente clienteAdd = clienteRepository.adicionar(cliente);
                System.out.println("Cliente adicinado com sucesso! " + clienteAdd);
            } catch(BancoDeDadosException e){
                e.printStackTrace();
            } catch(Exception e){
                System.out.println("ERRO: " + e.getMessage());
                System.out.println("TRACE: ");
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
}

