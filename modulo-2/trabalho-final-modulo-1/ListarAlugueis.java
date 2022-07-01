import java.util.ArrayList;
import java.util.List;

public class ListarAlugueis {
    
    private List <Aluguel> carrosAlugados;

    public ListarAlugueis() {
        this.carrosAlugados = new ArrayList<>();
    }

    public void imprimirCarrosAlugados() {
        carrosAlugados.stream()
        .forEach(System.out::println);
    }
}
