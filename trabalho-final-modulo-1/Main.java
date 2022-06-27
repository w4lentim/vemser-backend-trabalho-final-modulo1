import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipo = 0;
        int opcao = 0;

        CarroOperacoes carrosDisponiveisCatalogo = new CarroOperacoes();

        System.out.println("SEJA BEM VINDO(S) A DBCAR");
        System.out.println("A melhor locadora de carros do Brasil!");
        System.out.println("_______________________________________");

        do {
            System.out.println("LOGIN:\n1 - FUNCIONÁRIO;\n2 - CLIENTE:\nSUA ESCOLHA:");
            tipo = sc.nextInt();

            if (tipo == 1) {
                System.out.println("-FUNCIONARIO-");
                System.out.println("MENU DE OPÇÕES;");
                System.out.println("____________________________");
                System.out.println(
                        "1 - LISTAR CARROS DO CATÁLOGO DA LOCADORA;\n2 - ADICIONAR CARRO DO CATALOGO\n3 - REMOVER CARRO DO CATALOGO\n4 - ATUALIZAR CATALOGO\n0 - SAIR\nDIGITE A OPCAO:");

                opcao = sc.nextInt();
                sc.nextLine();
                switch (opcao) {
                    case 1 -> {
                        carrosDisponiveisCatalogo.listarCarros();
                    }
                    case 2 -> {
                        Carro carro = new Carro();
                        System.out.println("Digite o nome do carro: ");
                        carro.setNomeDoCarro(sc.nextLine());
                        System.out.println("Digite o tipo do carro: ");
                        carro.setTipo(sc.nextLine().toUpperCase());
                        System.out.println("Digite a marca do carro: ");
                        carro.setMarca(sc.nextLine());
                        System.out.println("Digite a quantidade de passageiros que o carro suporta: ");
                        carro.setQntPassageiros(sc.nextInt());
                        sc.nextLine();
                        System.out.println("Digite a quantidade de quilômetros rodados pelo carro (km): ");
                        carro.setKmRodados(sc.nextLong());
                        sc.nextLine();
                        System.out.println("Digite o valor do aluguel do carro R$: ");
                        carro.setValorAluguelCarro(sc.nextDouble());
                        sc.nextLine();

                        carrosDisponiveisCatalogo.adicionarCarro(carro);
                    }
                    case 3 -> {
                        System.out.println("Qual id do carro deseja excluir? ");
                        carrosDisponiveisCatalogo.listarCarros();
                        int id = sc.nextInt();
                        carrosDisponiveisCatalogo.removerCarros(id);
                    }
                    case 4 -> {
                        carrosDisponiveisCatalogo.listarCarros();
                        System.out.println("Qual carro gostaria de atualizar? ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        Carro novoCarro = new Carro();
                        System.out.println("Digite o novo nome do carro: ");
                        novoCarro.setNomeDoCarro(sc.nextLine());
                        System.out.println("Digite o tipo do carro: ");
                        novoCarro.setTipo(sc.nextLine().toUpperCase());
                        System.out.println("Digite a marca do carro: ");
                        novoCarro.setMarca(sc.nextLine());
                        System.out.println("Digite a quantidade de passageiros que o carro suporta: ");
                        novoCarro.setQntPassageiros(sc.nextInt());
                        sc.nextLine();
                        System.out.println("Digite a quantidade de quilômetros rodados pelo carro (km): ");
                        novoCarro.setKmRodados(sc.nextLong());
                        sc.nextLine();
                        System.out.println("Digite o valor do aluguel do carro R$: ");
                        novoCarro.setValorAluguelCarro(sc.nextDouble());
                        sc.nextLine();

                        carrosDisponiveisCatalogo.atualizarCarros(id, novoCarro);

                    }
                    case 0 -> {
                        break;
                    }
                    default -> {
                        System.out.println("Opção digitada inválida. Escolha apenas uma das opções válidas!");
                    }
                }
            } else if (tipo == 2) {
                System.out.println("-CLIENTES-");
                System.out.println("MENU DE OPÇÕES;");
                System.out.println("____________________________");
                System.out.println(
                        "1 - LISTAR CARROS DO CATÁLOGO DA LOCADORA;\n2 - ALUGAR CARRO;\n3 - DEVOLVER CARRO;\n0 - SAIR\nDIGITE A OPCAO:");
                opcao = sc.nextInt();
                switch (opcao) {
                    case 1 -> {
                        carrosDisponiveisCatalogo.listarCarros();
                        System.out.println("1 - ALUGAR CARRO;\n2 - DEVOLVER CARRO;\n0 - SAIR");
                        System.out.println("____________________________");
                        }
                    }
                } else {
                    System.out.println("OPÇÃO INFORMADA INVÁLIDA!");
                    System.out.println("____________________________");
                }
            } while (tipo != 0);
            sc.close();
    }
}
