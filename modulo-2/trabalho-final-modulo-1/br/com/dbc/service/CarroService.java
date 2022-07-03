package br.com.dbc.service;

import br.com.dbc.exception.BancoDeDadosException;
import br.com.dbc.model.Carro;
import br.com.dbc.model.Database;
import br.com.dbc.repository.CarroRepository;

import java.util.ArrayList;

public class CarroService {

    private CarroRepository carroRepository;

    public CarroService() { carroRepository = new CarroRepository(); }

    public static CarroService carrosService = new CarroService();

    public void adicionarCarro(Carro carro) {
        try {
            Carro carroAdicionado = carroRepository.adicionar(carro);
            System.out.println("Carro adicionado com sucesso! " + carroAdicionado);
        } catch (BancoDeDadosException e){
            e.printStackTrace();
        }
    }

    public Carro selecionarCarro(Integer id) {

//        ArrayList<Carro> carros = carroRepository.listar().listIterator();
        ArrayList<Carro> carros = Database.database.getCarros();
        if (carros != null) {
            for (int index = 0; index < carros.size(); index++) {
                if (carros.get(index).getIdCarro() == id) {
                    System.out.println("Carro selecionado: " + carros.get(index));
                    return carros.get(index);
                }
            }
        }
        return null;
    }

    public void removerCarro(Integer id) {
        try {
            boolean conseguiuRemover = carroRepository.remover(id);
            System.out.println("Removido? " + conseguiuRemover + "| com id = " + id);
        } catch (BancoDeDadosException e) {
            e.printStackTrace();
        }
    }

    public void atualizarCarro(Integer id, Carro carro) {
        try {
            boolean conseguiuAtualizar = carroRepository.editar(id, carro);
            System.out.println("Atualizou? " + conseguiuAtualizar + "| com id = " + id);
        } catch (BancoDeDadosException e) {
            e.printStackTrace();
        }
    }

    public void listarCarros() {
        try {
            carroRepository.listar().forEach(System.out::println);
        } catch (BancoDeDadosException e) {
            e.printStackTrace();
        }
    }
}
