package br.com.dbc.service;

import br.com.dbc.model.Aluguel;
import br.com.dbc.model.Carro;
import br.com.dbc.repository.AluguelRepository;

import java.util.ArrayList;

public class AluguelService {

    private AluguelRepository aluguelRepository;

    public AluguelService() { aluguelRepository = new AluguelRepository(); }

    public static AluguelService alugueisService = new AluguelService();

    public void alugar(Aluguel aluguel) {
        ArrayList<Aluguel> alugueis = new ArrayList<>();
        alugueis.add(aluguel);
//        CarroService.carrosService.selecionarCarro(aluguel.getCarro().getIdCarro()).setAlugado("S");
        System.out.println("O ALUGUEL FOI REALIZADO COM SUCESSO!");
        System.out.println("Cliente: " + aluguel.getCliente().getNome() + "\nCarro alugado: " + aluguel.getCarro().getNomeCarro());
    }
    public Double valorDoAluguel(Aluguel aluguel, Carro carro) {
        if (carro == null) {
            return 0.0;
        } else {
            return (aluguel.getDiaDaEntrega() - aluguel.getDiaDoAluguel()) * carro.getPrecoDiaria();
        }
    }
}
