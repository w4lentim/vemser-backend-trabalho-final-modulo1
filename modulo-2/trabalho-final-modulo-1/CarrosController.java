import java.util.ArrayList;

public class CarrosController {

    public CarrosController() {};
    public static CarrosController carrosController = new CarrosController();

    public ArrayList<Carro> inicializarCarros() {
        ArrayList<Carro> retorno = new ArrayList<>();
        retorno.add(new Carro(1, "N", "Pálio", "Fiat", "C", 5, 20000, 100.00));
        retorno.add(new Carro(2, "N", "Gol", "Volkswagen", "C", 5, 25000, 100.00));
        retorno.add(new Carro(3, "N", "Onix", "Chevrolet", "C", 5, 30000, 200.00));
        retorno.add(new Carro(4, "N", "Compass", "Jeep", "B", 5, 10000, 300.00));
        retorno.add(new Carro(5, "N", "Civic", "Honda", "B", 5, 10000, 300.00));
        retorno.add(new Carro(6, "N", "T-Cross", "Volkswagen", "B", 5, 15000, 300.00));
        retorno.add(new Carro(7, "N", "Elegance", "Mercedes-Benz", "A", 5, 20000, 500.00));
        retorno.add(new Carro(8, "N", "911 GTS", "Porsche", "A", 5, 5000, 1000.00));
        retorno.add(new Carro(9, "N", "Shelby GT500", "Mustang", "A", 5, 5000, 1000.00));
        return retorno;
    };

    public void adicionarCarro(Carro carro) {
        Database.database.getCarros().add(carro);
    }

    public void listarCarrosDisponiveis() {
        Database.database.getCarros().stream()
                .filter((carro) -> carro.getAlugado().equals("N"))
                .forEach(System.out::println);
    }

    public Carro selecionarCarro(Integer id) {
        ArrayList<Carro> carros = Database.database.getCarros();
        if (carros != null) {
            for (int index = 0; index < carros.size(); index++) {
                if (carros.get(index).getIdCarro() == id) {
                    System.out.println("Carro selecionado: " + carros.get(index));
                    return carros.get(index);
                }
            }
        }
        return null;
    }

    public void atualizarCarro(Integer id, Carro carro) {
        Carro carroParaAtualizar = selecionarCarro(id);
        carroParaAtualizar.setNomeCarro(carro.getNomeCarro());
        carroParaAtualizar.setMarca(carro.getMarca());
        carroParaAtualizar.setClasse(carro.getMarca());
        carroParaAtualizar.setQntPassageiros(carro.getQntPassageiros());
        carroParaAtualizar.setKmRodados(carro.getKmRodados());
        carroParaAtualizar.setPrecoDiaria(carro.getPrecoDiaria());
    }

    public void removerCarro(Integer id) {
        ArrayList<Carro> carros = Database.database.getCarros();
        if (carros != null) {
            for (int index = 0; index < carros.size(); index++) {
                if (carros.get(index).getIdCarro() == id) {
                    Database.database.getCarros().remove(index);
                    return;
                }
            }
        }
    }
}
