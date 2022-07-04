package br.com.dbc.service;

import br.com.dbc.exception.BancoDeDadosException;
import br.com.dbc.model.Carro;
import br.com.dbc.repository.CarroRepository;

import java.util.ArrayList;
import java.util.Comparator;

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

    public Carro selecionarCarro(Integer id) throws BancoDeDadosException {
        Carro carroSelec = carroRepository.selecionar(id);
        if (carroSelec != null) {
            for (int index = 0; index < carroSelec.getIdCarro(); index++) {
                if (carroSelec.getIdCarro() == id) {
                    System.out.println("Carro selecionado: " + carroSelec.getIdCarro());
                    return carroSelec;
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

    public void listarCarrosNaoAlugados() throws BancoDeDadosException {
        try {
            carroRepository.listarNaoAlugaDos().forEach(System.out::println);
        } catch (BancoDeDadosException e) {
            e.printStackTrace();
        }
    }
}
