import java.util.ArrayList;

public class ListaCarros {

    private ArrayList<Carro> listaCarros;

    public ListaCarros() {
        this.listaCarros = new ArrayList<>();
        this.listaCarros.add(new Carro(1, "N", "Pálio", "Fiat", "C", 5, 20000, 100.00));
        this.listaCarros.add(new Carro(2, "N", "Gol", "Volkswagen", "C", 5, 25000, 100.00));
        this.listaCarros.add(new Carro(3, "N", "Onix", "Chevrolet", "C", 5, 30000, 200.00));
        this.listaCarros.add(new Carro(4, "N", "Compass", "Jeep", "B", 5, 10000, 300.00));
        this.listaCarros.add(new Carro(5, "N", "Civic", "Honda", "B", 5, 10000, 300.00));
        this.listaCarros.add(new Carro(6, "N", "T-Cross", "Volkswagen", "B", 5, 15000, 300.00));
        this.listaCarros.add(new Carro(7, "N", "Elegance", "Mercedes-Benz", "A", 5, 20000, 500.00));
        this.listaCarros.add(new Carro(8, "N", "911 GTS", "Porsche", "A", 5, 5000, 1000.00));
        this.listaCarros.add(new Carro(9, "N", "Shelby GT500", "Mustang", "A", 5, 5000, 1000.00));
    }


    public void alugar(Integer idCarro) {
        if (listaCarros != null) {
            Carro carroSelecionado = listaCarros.get(idCarro);
            if (carroSelecionado.getAlugado().equals("S")) {
                System.out.println("---- CARRO N├âO DISPONIVEL PARA ALUGUEL ----");
            } else {
                carroSelecionado.setAlugado("S");
                System.out.println("---- CARRO ALUGADO COM SUCESSO ----");
            }
            listaCarros.set(idCarro, carroSelecionado);
        }
    }


    public void adicionarCarro(Carro carro) {
        this.listaCarros.add(carro);
    }

    public void listarCarros() {
        listaCarros.stream()
                .filter((carro) -> carro.getAlugado().equals("N"))
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
        if (listaCarros != null) {
            for (int id = 0; id < listaCarros.size(); id++) {
                if (id == indice) {
                    this.listaCarros.remove(indice.intValue());
                }
            }
        }
    }

    public ListaCarros(ArrayList<Carro> listaCarros) {
        this.listaCarros = listaCarros;
    }

    public ArrayList<Carro> getListaCarros() {
        return listaCarros;
    }
}
