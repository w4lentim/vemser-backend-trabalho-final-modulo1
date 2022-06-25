import java.util.ArrayList;
import java.util.List;

public class CarroOperacoes {

    private List <Carro> carrosDisponiveis;

    public CarroOperacoes(Carro carro) {
        this.carrosDisponiveis = new ArrayList<>();
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
        carroParaAtualizar.setNome(carro.getNome());
        carroParaAtualizar.setTipo(carro.getTipo());
    }

    public void removerCarros(Integer indice) {
        this.carrosDisponiveis.remove(indice.intValue());
    }
    
}