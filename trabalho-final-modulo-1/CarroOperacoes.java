import java.util.ArrayList;
import java.util.List;

public class CarroOperacoes {

    private ArrayList<Carro> carrosDisponiveis;

    public CarroOperacoes() {
        this.carrosDisponiveis = new ArrayList<>();
        this.carrosDisponiveis.add(new Carro("Palio", new CaracteristicasCarro("Fiat", "Attrative", 2009, 5,50000L, 48.0), "C", 200.0));
        this.carrosDisponiveis.add(new Carro("Onix", new CaracteristicasCarro("Chevrolet", "LTZ", 2018, 5, 30000L,50.0), "C", 400.0));
        this.carrosDisponiveis.add(new Carro("Compass", new CaracteristicasCarro("Jeep", "Compass", 2019, 5, 20000L, 60.0), "B", 500.0));
        this.carrosDisponiveis.add(new Carro("Civic", new CaracteristicasCarro("Honda", "Touring", 2018, 6, 10000L, 40.0), "B", 500.0));
        this.carrosDisponiveis.add(new Carro("Carrera GTS", new CaracteristicasCarro("Porsche", "911.2", 2018, 2, 30000L, 40.0), "A", 1000.0));
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

    @Override
    public String toString() {
        return "\nCarroOperacoes " + carrosDisponiveis;
    }  
}