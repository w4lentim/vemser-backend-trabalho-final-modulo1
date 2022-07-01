import java.util.ArrayList;

public class ListaCarros implements Operacoes {
    
    private ArrayList<Carro> listaCarros;

    public ListaCarros() {
        this.listaCarros = new ArrayList<>();
        this.listaCarros.add(new Carro(1, false, "Pálio", "Fiat", "C", 5, 20000, 100.00));
        this.listaCarros.add(new Carro(2, false, "Gol", "Volkswagen", "C", 5, 25000, 100.00));
        this.listaCarros.add(new Carro(3, false, "Onix", "Chevrolet", "C", 5, 30000, 200.00));
        this.listaCarros.add(new Carro(4, false, "Compass", "Jeep", "B", 5, 10000, 300.00));
        this.listaCarros.add(new Carro(5, false, "Civic", "Honda", "B", 5, 10000, 300.00));
        this.listaCarros.add(new Carro(6, false, "T-Cross", "Volkswagen", "B", 5, 15000, 300.00));
        this.listaCarros.add(new Carro(7, false, "Elegance", "Mercedes-Benz", "A", 5, 20000, 500.00));
        this.listaCarros.add(new Carro(8, false, "911 GTS", "Porsche", "A", 5, 5000, 1000.00));
        this.listaCarros.add(new Carro(9, false, "Shelby GT500", "Mustang", "A", 5, 5000, 1000.00));
    }

    public void alugar(Integer idCliente, Integer idCarro, Integer diaDeEntrada, Integer diaDaEntrega) {
        if (listaCarros != null) {
            for (int index = 0; index < listaCarros.size(); index++) {
                if (index == idCarro) {
                    listaCarros.remove(index);
                }
            }
        }
    }

    public void devolver(Integer id) {
        
    }

    public void adicionarCarro(Carro carro) {
        this.listaCarros.add(carro);
    }

    public void listarCarros() {
        listaCarros.stream()
        .forEach(System.out::println);
    }

    public void selecionarCarro(Integer indice) {
        if (listaCarros != null) {
            for (int id = 0; id < listaCarros.size(); id++) {
                if (id == indice) {
                    System.out.println("Carro selecionado: " + listaCarros.get(id));
                    break;
                } else {
                    System.out.println("Carro selecionado indisponível. Informe um carro disponível.");
                }
            } 
        }
    }

    public void atualizarCarro(Integer indice, Carro carro) {
        Carro carroParaAtualizar = listaCarros.get(indice);
        carroParaAtualizar.setNomeCarro(carro.getNomeCarro());
        carroParaAtualizar.setMarca(carro.getMarca());
        carroParaAtualizar.setClasse(carro.getMarca());
        carroParaAtualizar.setQntPassageiros(carro.getQntPassageiros());
        carroParaAtualizar.setKmRodados(carro.getKmRodados());
        carroParaAtualizar.setPrecoDiaria(carro.getPrecoDiaria());
    }

    public void removerCarro(Integer indice) {
        this.listaCarros.remove(indice.intValue());
    }

    public ListaCarros(ArrayList<Carro> listaCarros) {
        this.listaCarros = listaCarros;
    }

    public ArrayList<Carro> getListaCarros() {
        return listaCarros;
    }
}
