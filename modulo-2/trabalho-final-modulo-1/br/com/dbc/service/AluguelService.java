package br.com.dbc.service;

import br.com.dbc.controller.CarrosController;
import br.com.dbc.model.Aluguel;
import br.com.dbc.model.Database;
import br.com.dbc.repository.AluguelRepository;

import java.util.ArrayList;

public class AluguelService {

    private AluguelRepository aluguelRepository;

    public AluguelService() { aluguelRepository = new AluguelRepository(); }

    public static AluguelService alugueisService = new AluguelService();

    public void alugar(Aluguel aluguel) {
        ArrayList<Aluguel> alugueis = Database.database.getAlugueis();
        alugueis.add(aluguel);
        CarroService.carrosService.selecionarCarro(aluguel.getCarro().getIdCarro()).setAlugado("S");
        System.out.println("O ALUGUEL FOI REALIZADO COM SUCESSO!");
        System.out.println("Cliente: " + aluguel.getCliente().getNome() + "\nCarro alugado: " + aluguel.getCarro().getNomeCarro());
    }
}
