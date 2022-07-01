import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ListaCarros carrosDisponiveisCatalogo = new ListaCarros();

        int escolha = 0;
        
        while (escolha != 3) {
            System.out.println("SEJA BEM VINDOS A LOCADORA DBCAR!");
            System.out.println("LOGIN:\n1 - ACESSO FUNCIONÁRIO;\n2 - ACESSO CLIENTE;");
            int opcaoMenu = scanner.nextInt();
            scanner.nextLine();
            switch (opcaoMenu) {
                case 1 -> {
                    System.out.println("VOCÊ ESTÁ ACESSANDO O MENU PARA FUNCIONÁRIO;");
                    System.out.println("------ MENU PARA FUNCIONÁRIOS ------");
                    System.out.println("1 - LISTAR OS CARROS DISPONÍVEIS DO CATÁLOGO;\n2 - ADICIONAR UM NOVO CARRO AO CATÁLOGO;\n3 - ATUALIZAR UM CARRO DO CATÁLOGO;\n4 - REMOVER CARRO DO CATÁLOGO;\n0 - SAIR;\nSUA ESCOLHA: ");
                    int opcaoFuncionario = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcaoFuncionario) {
                        case 1 -> {
                            carrosDisponiveisCatalogo.listarCarros();
                            System.out.println("-------------------------------------------------");
                        }
                        case 2 -> {
                            Carro carro = new Carro();
                            System.out.println("Informe o ID do carro: ");
                            carro.setIdCarro(scanner.nextInt());
                            scanner.nextLine();
                            System.out.println("Carro está disponível ou alugado? (S/N): ");
                            carro.setAlugado(scanner.next());
                            System.out.println("Informe o nome do carro: ");
                            carro.setNomeCarro(scanner.nextLine());
                            System.out.println("Informe a marca do carro: ");
                            carro.setMarca(scanner.nextLine());
                            System.out.println("Informe a classe do carro: ");
                            carro.setClasse(scanner.nextLine());
                            System.out.println("Informe a quantidade de passageiros que o carro suporta: ");
                            carro.setQntPassageiros(scanner.nextInt());
                            scanner.nextLine();
                            System.out.println("Informe a quantidade de km rodados pelo carro: ");
                            carro.setKmRodados(scanner.nextInt());
                            scanner.nextLine();
                            System.out.println("Informe o preço da diária do carro R$: ");
                            carro.setPrecoDiaria(scanner.nextDouble());
                            scanner.nextLine();
                            System.out.println("---- CARRO CADASTRADO COM SUCESSO ----");
                        }
                        case 3 -> {
                            carrosDisponiveisCatalogo.listarCarros();
                            System.out.println("-------------------------------------------------");
                            System.out.println("Informe o ID do carro que deseja atualizar: ");
                            int idAtualizar = scanner.nextInt();
                            scanner.nextLine();

                            Carro carroAtualizado = new Carro();

                            System.out.println("Informe o novo ID do carro: ");
                            carroAtualizado.setIdCarro(scanner.nextInt());
                            scanner.nextLine();
                            System.out.println("Carro está disponível ou alugado? (S/N): ");
                            carroAtualizado.setAlugado(scanner.next());
                            System.out.println("Informe o nome do carro: ");
                            carroAtualizado.setNomeCarro(scanner.nextLine());
                            System.out.println("Informe a marca do carro: ");
                            carroAtualizado.setMarca(scanner.nextLine());
                            System.out.println("Informe a classe do carro: ");
                            carroAtualizado.setClasse(scanner.nextLine());
                            System.out.println("Informe a quantidade de passageiros que o carro suporta: ");
                            carroAtualizado.setQntPassageiros(scanner.nextInt());
                            scanner.nextLine();
                            System.out.println("Informe a quantidade de km rodados pelo carro: ");
                            carroAtualizado.setKmRodados(scanner.nextInt());
                            scanner.nextLine();
                            System.out.println("Informe o preço da diária do carro R$: ");
                            carroAtualizado.setPrecoDiaria(scanner.nextDouble());
                            scanner.nextLine();

                            carrosDisponiveisCatalogo.atualizarCarro(idAtualizar, carroAtualizado);
                            System.out.println("---- CARRO ATUALIZADO COM SUCESSO ----");
                        }
                        case 4 -> {
                            carrosDisponiveisCatalogo.listarCarros();
                            System.out.println("----------------------------------------------");
                            System.out.println("Informe o ID do carro que deseja remover: ");
                            int idRemover = scanner.nextInt();

                            carrosDisponiveisCatalogo.removerCarro(idRemover);
                            System.out.println("---- CARRO REMOVIDO COM SUCESSO! ----");
                        }
                        case 0 -> {
                            break;
                        }
                        default -> {
                            System.out.println("Opção selecionada inválida!");
                        }
                    }
                }
                case 2 -> {
                    System.out.println("VOCÊ ESTÁ ACESSANDO O MENU PARA CLIENTES;");
                    System.out.println("------ MENU PARA CLIENTES ------");
                    System.out.println("1 - LISTAR OS CARROS DISPONÍVEIS DO CATÁLOGO;\n2 - ALUGAR UM CARRO;\n3 - DEVOLVER CARRO;\n0 - SAIR;\nSUA ESCOLHA: ");
                    int opcaoCliente = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcaoCliente) {
                        case 1 -> {
                            carrosDisponiveisCatalogo.listarCarros();
                            System.out.println("-------------------------------------------------");
                        }
                        case 2 -> {
                            System.out.println("Informe o ID do carro que deseja alugar: ");
                            int idCarroEscolhido = scanner.nextInt();
                            scanner.nextLine();
                            Cliente novoCliente = new Cliente();
                            System.out.println("Informe seu ID de Cliente: ");
                            novoCliente.setIdCliente(scanner.nextInt());
                            scanner.nextLine();
                            System.out.println("Informe seu nome: ");
                            novoCliente.setNome(scanner.nextLine());
                            System.out.println("Informe seu CPF: ");
                            novoCliente.setCpf(scanner.nextLine());
                            System.out.println("Informe um telefone para contato: ");
                            novoCliente.setTelefone(scanner.nextLine());
                            System.out.println("Informe um endereço: ");
                            novoCliente.setEndereco(scanner.nextLine());

                            /////// INICIAR DAQUI;
                                
                        }
                    }
                }
            }
        }    
    }
}
