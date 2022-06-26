import java.util.ArrayList;
import java.util.List;

public class CarroOperacoes {
    private ArrayList<Carro> carrosDisponiveis;

    public CarroOperacoes() {
        this.carrosDisponiveis = new ArrayList<>();
        this.carrosDisponiveis.add(new Carro("Palio", new CaracteristicasCarro("Fiat", "2.0", 2009, 6,
               50000L, 40.0), "C", 500.0));
        this.carrosDisponiveis.add(new Carro("Onix", new CaracteristicasCarro("Chevrolet", "1.0", 2015,
                6, 20000L, 40.0), "C", 500.0));
    }

    public void adicionarCarro(Carro carro) {
        this.carrosDisponiveis.add(carro);
    }

    public void listarCarros() {
        carrosDisponiveis.stream()
        .forEach(System.out::println);
    }

    public void adicionarCarros(Carro carro) {
        this.carrosDisponiveis.add(carro);
    }

    public void atualizarCarros(Integer indice, Carro carro) {
        Carro carroParaAtualizar = carrosDisponiveis.get(indice);
        carroParaAtualizar.setNomeDoCarro(carro.getNomeDoCarro());
        carroParaAtualizar.setTipo(carro.getTipo());
    }

    public void removerCarros(Integer indice) {
        this.carrosDisponiveis.remove(indice.intValue());
    }

    public ArrayList<Carro> getCarrosDisponiveis() {
        return carrosDisponiveis;
    }

    public void setCarrosDisponiveis(ArrayList<Carro> carrosDisponiveis) {
        this.carrosDisponiveis = carrosDisponiveis;
    }
}