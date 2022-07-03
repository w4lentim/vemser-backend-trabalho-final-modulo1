package br.com.dbc.service;

import br.com.dbc.exception.BancoDeDadosException;
import br.com.dbc.model.Aluguel;
import br.com.dbc.model.Carro;
import br.com.dbc.repository.AluguelRepository;
import br.com.dbc.repository.CarroRepository;

import java.util.ArrayList;

public class AluguelService {

    private CarroRepository carroRepository;
    private AluguelRepository aluguelRepository;


    public AluguelService() {
        aluguelRepository = new AluguelRepository();
        carroRepository = new CarroRepository();
    }

    public static AluguelService alugueisService = new AluguelService();

    public void alugar(Aluguel aluguel) throws BancoDeDadosException {
        Aluguel aluguelSalvo = aluguelRepository.adicionar(aluguel);
        carroRepository.editarAlugado(aluguel.getCarro().getIdCarro(), true);
        System.out.println("O ALUGUEL FOI REALIZADO COM SUCESSO!");
        System.out.println("Cliente: " + aluguel.getCliente().getNome() + "\nAluguel: " + aluguelSalvo);
    }

    public Double valorDoAluguel(Aluguel aluguel, Carro carro) {
        if (carro == null) {
            return 0.0;
        } else {
            return (aluguel.getDiaDaEntrega() - aluguel.getDiaDoAluguel()) * carro.getPrecoDiaria();
        }
    }
}
