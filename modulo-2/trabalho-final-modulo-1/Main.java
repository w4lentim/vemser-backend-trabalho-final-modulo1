import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ListaCarros carrosDisponiveisCatalogo = new ListaCarros();

        int escolha = 0;
        
        while (escolha != 3) {
            System.out.println("SEJA BEM VINDO A LOCADORA DBCAR!");
            System.out.println("LOGIN:\n1 - ACESSO FUNCIONÁRIO;\n2 - ACESSO CLIENTE;");
            System.out.print("SUA ESCOLHA: ");
            int opcaoMenu = sc.nextInt();
            sc.nextLine();
            switch (opcaoMenu) {
                case 1 -> {
                    System.out.println("VOCÊ ESTÁ ACESSANDO O MENU PARA FUNCIONÁRIO;");
                    System.out.println("------ MENU PARA FUNCIONÁRIOS ------");
                    System.out.println("1 - LISTAR OS CARROS DISPONÍVEIS DO CATÁLOGO;\n2 - ADICIONAR UM NOVO CARRO AO CATÁLOGO;\n3 - ATUALIZAR UM CARRO DO CATÁLOGO;\n4 - REMOVER CARRO DO CATÁLOGO;\n0 - SAIR;\nSUA ESCOLHA: ");
                    int opcaoFuncionario = sc.nextInt();
                    sc.nextLine();
                    switch (opcaoFuncionario) {
                        case 1 -> {
                            carrosDisponiveisCatalogo.listarCarros();
                            System.out.println("-------------------------------------------------");
                        }
                        case 2 -> {
                            Carro carro = new Carro();
                            System.out.println("Informe o ID do carro: ");
                            carro.setIdCarro(sc.nextInt());
                            sc.nextLine();
                            System.out.println("Carro está disponível ou alugado? (S/N): ");
                            carro.setAlugado(sc.next());
                            System.out.println("Informe o nome do carro: ");
                            carro.setNomeCarro(sc.nextLine());
                            System.out.println("Informe a marca do carro: ");
                            carro.setMarca(sc.nextLine());
                            System.out.println("Informe a classe do carro: ");
                            carro.setClasse(sc.nextLine());
                            System.out.println("Informe a quantidade de passageiros que o carro suporta: ");
                            carro.setQntPassageiros(sc.nextInt());
                            sc.nextLine();
                            System.out.println("Informe a quantidade de km rodados pelo carro: ");
                            carro.setKmRodados(sc.nextInt());
                            sc.nextLine();
                            System.out.println("Informe o preço da diária do carro R$: ");
                            carro.setPrecoDiaria(sc.nextDouble());
                            sc.nextLine();
                            System.out.println("---- CARRO CADASTRADO COM SUCESSO ----");
                        }
                        case 3 -> {
                            carrosDisponiveisCatalogo.listarCarros();
                            System.out.println("-------------------------------------------------");
                            System.out.println("Informe o ID do carro que deseja atualizar: ");
                            int idAtualizar = sc.nextInt();
                            sc.nextLine();

                            Carro carroAtualizado = new Carro();

                            System.out.println("Informe o novo ID do carro: ");
                            carroAtualizado.setIdCarro(sc.nextInt());
                            sc.nextLine();
                            System.out.println("Carro está disponível ou alugado? (S/N): ");
                            carroAtualizado.setAlugado(sc.nextLine());
                            System.out.println("Informe o nome do carro: ");
                            carroAtualizado.setNomeCarro(sc.nextLine());
                            System.out.println("Informe a marca do carro: ");
                            carroAtualizado.setMarca(sc.nextLine());
                            System.out.println("Informe a classe do carro: ");
                            carroAtualizado.setClasse(sc.nextLine());
                            System.out.println("Informe a quantidade de passageiros que o carro suporta: ");
                            carroAtualizado.setQntPassageiros(sc.nextInt());
                            sc.nextLine();
                            System.out.println("Informe a quantidade de km rodados pelo carro: ");
                            carroAtualizado.setKmRodados(sc.nextInt());
                            sc.nextLine();
                            System.out.println("Informe o preço da diária do carro R$: ");
                            carroAtualizado.setPrecoDiaria(sc.nextDouble());
                            sc.nextLine();

                            carrosDisponiveisCatalogo.atualizarCarro(idAtualizar - 1, carroAtualizado);
                            System.out.println("---- CARRO ATUALIZADO COM SUCESSO ----");
                        }
                        case 4 -> {
                            carrosDisponiveisCatalogo.listarCarros();
                            System.out.println("----------------------------------------------");
                            System.out.println("Informe o ID do carro que deseja remover: ");
                            int idRemover = sc.nextInt();

                            carrosDisponiveisCatalogo.removerCarro(idRemover - 1);
                            System.out.println("---- CARRO REMOVIDO COM SUCESSO! ----");
                        }
                        case 0 -> {
                            break;
                        }
                        default -> {
                            System.out.println("Opção selecionada inválida!");
                            System.out.println("---------------------------------------------");
                        }
                    }
                }
                case 2 -> {
                    System.out.println("VOCÊ ESTÁ ACESSANDO O MENU PARA CLIENTES;");
                    System.out.println("------ MENU PARA CLIENTES ------");
                    System.out.println("1 - LISTAR OS CARROS DISPONÍVEIS DO CATÁLOGO;\n2 - ALUGAR UM CARRO;\n3 - DEVOLVER CARRO;\n0 - SAIR;\nSUA ESCOLHA: ");
                    int opcaoCliente = sc.nextInt();
                    sc.nextLine();
                    switch (opcaoCliente) {
                        case 1 -> {
                            carrosDisponiveisCatalogo.listarCarros();
                            System.out.println("-------------------------------------------------");
                        }
                        case 2 -> {
                            System.out.println("Informe o ID do carro que deseja alugar: ");
                            int idCarroEscolhido = sc.nextInt();
                            sc.nextLine();

//                            Cliente novoCliente = new Cliente();
//                            System.out.println("Informe seu ID de Cliente: ");
//                            novoCliente.setIdCliente(sc.nextInt());
//                            sc.nextLine();
//                            System.out.println("Informe seu nome: ");
//                            novoCliente.setNome(sc.nextLine());
//                            System.out.println("Informe seu CPF: ");
//                            novoCliente.setCpf(sc.nextLine());
//                            System.out.println("Informe um telefone para contato: ");
//                            novoCliente.setTelefone(sc.nextLine());
//                            System.out.println("Informe um endereço: ");
//                            novoCliente.setEndereco(sc.nextLine());

                            carrosDisponiveisCatalogo.alugar(idCarroEscolhido - 1);
                        }
                    }
                }
                default -> {
                    System.out.println("OPÇÃO SELECIONADA INVÁLIDA. POR FAVOR SELECIONA APENAS UMAS DAS OPÇÕES DISPONÍVEIS.");
                }
            }
        }    
    }
}
