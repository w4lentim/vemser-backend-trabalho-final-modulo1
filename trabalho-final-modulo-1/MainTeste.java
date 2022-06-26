public class MainTeste {
    public static void main(String[] args) {
        
        CaracteristicasCarro caracFusca = new CaracteristicasCarro("Wolkswagem", "qualquer", 1990, 4, 120000L, 25.0);

        Carro fusca = new Carro("Fusca", caracFusca, "C", Aluguel.VALOR_DIARIA);

        Aluguel aluguel1 = new Aluguel(26, 4, fusca);

        Cliente cliente1 = new Cliente("Willian", "111.222.333-44", "Cliente", aluguel1);

        cliente1.imprimirCliente();
        System.out.println("_____________________");

        cliente1.alugar();
    }
}
