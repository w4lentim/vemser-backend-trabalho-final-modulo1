import java.util.ArrayList;

public class CarroOperacoes {

    private ArrayList<Carro> carrosDisponiveis;

    public CarroOperacoes() {

        this.carrosDisponiveis = new ArrayList<>();
        this.carrosDisponiveis.add(new Carro("Pálio", "C", "Fiat", 5, 20000L, 200.00));
        this.carrosDisponiveis.add(new Carro("Onix", "C", "Chevrolet", 5, 30000L, 400.00));
        this.carrosDisponiveis.add(new Carro("Compass", "B", "Jeep", 5, 20000L, 500.00));
        this.carrosDisponiveis.add(new Carro("Civic", "B", "Honda", 5, 10000L, 500.00));
        this.carrosDisponiveis.add(new Carro("Carrera GTS", "A", "Porsche", 2, 30000L, 1000.00));
    }

    public void adicionarCarro(Carro carro) {
        this.carrosDisponiveis.add(carro);
    }

    public void listarCarros() {
        for (int id = 0; id < carrosDisponiveis.size(); id++) {
            System.out.println("id: " + id + " | " + carrosDisponiveis.get(id));
            System.out.println("__________________________________");
        }
    }

    public void selecionarCarro(Integer indice) {
        for (int id = 0; id != indice; id++) {
            if (id == indice) {
                System.out.println("Carro escolhido: " + carrosDisponiveis.get(id));
                break;
            } else {
                System.out.println("Carro indisponível. Informe um carro válido;");
            }
        }
    }

    public void adicionarCarros(Carro carro) {
        this.carrosDisponiveis.add(carro);
    }

    public void atualizarCarros(Integer indice, Carro carro) {
        Carro carroParaAtualizar = carrosDisponiveis.get(indice);
        carroParaAtualizar.setNomeDoCarro(carro.getNomeDoCarro());
        carroParaAtualizar.setTipo(carro.getTipo());
        carroParaAtualizar.setMarca(carro.getMarca());
        carroParaAtualizar.setQntPassageiros(carro.getQntPassageiros());
        carroParaAtualizar.setKmRodados(carro.getKmRodados());
        carroParaAtualizar.setValorAluguelCarro(carro.getValorAluguelCarro());
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