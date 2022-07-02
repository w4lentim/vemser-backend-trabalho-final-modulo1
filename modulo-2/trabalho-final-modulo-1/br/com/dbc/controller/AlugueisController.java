package br.com.dbc.controller;

import br.com.dbc.model.Aluguel;
import br.com.dbc.model.Database;

import java.util.ArrayList;
import java.util.List;

public class AlugueisController {

    public AlugueisController () {};

    private List<Aluguel> carrosAlugados;

    public static AlugueisController alugueisController = new AlugueisController();

    public void alugar(Aluguel aluguel) {
        ArrayList<Aluguel> alugueis = Database.database.getAlugueis();
        alugueis.add(aluguel);
        CarrosController.carrosController.selecionarCarro(aluguel.getCarro().getIdCarro()).setAlugado("S");
        System.out.println("O ALUGUEL FOI REALIZADO COM SUCESSO!");
        System.out.println("br.com.dbc.model.Cliente: " + aluguel.getCliente().getNome() + "\nbr.com.dbc.model.Carro alugado: " + aluguel.getCarro().getNomeCarro());
    }
}
