import java.util.ArrayList;
import java.util.List;

public class CarroOperacoes {

    private ArrayList<Carro> carrosDisponiveis;

    public CarroOperacoes() {

        this.carrosDisponiveis = new ArrayList<>();
        this.carrosDisponiveis.add(new Carro("Pálio", "C", "Fiat", 5, 20000L, 200.00));
        this.carrosDisponiveis.add(new Carro("Onix", "C", "Chevrolet", 5, 30000L, 400.00));
        this.carrosDisponiveis.add(new Carro("Compass", "B", "Jeep", 5, 20000L, 500.00));
        this.carrosDisponiveis.add(new Carro("Civic", "B", "Honda", 6, 10000L, 500.00));
        this.carrosDisponiveis.add(new Carro("Carrera GTS", "A", "Porsche", 2, 30000L, 1000.00));
    }

    public void adicionarCarro(Carro carro) {
        this.carrosDisponiveis.add(carro);
    }

    public void listarCarros() {
        for (int id = 0; id < carrosDisponiveis.size(); id++) {
            System.out.println("id: " + id + " | " + carrosDisponiveis.get(id));
            System.out.println("____________________________");
        }
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