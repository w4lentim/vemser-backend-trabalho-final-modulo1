import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipo = 0;
        int opcao = 0;
        int opcaoAux = 0;
        double doubleAux =0;

        CarroOperacoes carrosDisponiveisCatalogo = new CarroOperacoes();

        System.out.println("SEJA BEM VINDO(S) A DBCAR");
        System.out.println("A melhor locadora de carros do Brasil!");
        System.out.println("_______________________________________");
        
        do {
            System.out.println("LOGIN:\n1 - FUNCIONÁRIO;\n 2 - CLIENTE:\nSUA ESCOLHA:");
            tipo = sc.nextInt();

            if (tipo == 1) {
                do {
                    System.out.println("-FUNCIONARIO-");
                    System.out.println("MENU DE OPÇÕES;");
                    System.out.println("1 - ADICIONAR CARRO DO CATALOGO\n2 - REMOVER CARRO DO CATALOGO\n3 - ATUALIZAR CATALOGO\n0 - SAIR\nDIGITE A OPCAO:");

                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 1 -> {
                            Carro carro = new Carro();
                            System.out.println("Digite o nome do carro: ");
                            carro.setNomeDoCarro(sc.nextLine());
                            System.out.println("Digite o tipo do carro: ");
                            carro.setTipo(sc.nextLine());
                            System.out.println("Digite a marca do carro: ");
                            carro.setMarca(sc.nextLine());
                            System.out.println("Digite a quantidade de passageiros que o carro suporta: ");
                            carro.setQntPassageiros(sc.nextInt());
                            System.out.println("Digite a quantidade de quilômetros rodados pelo carro (km): ");
                            carro.setKmRodados(sc.nextLong());
                            System.out.println("Digite o valor do aluguel do carro R$: ");
                            carro.setValorAluguelCarro(sc.nextDouble());
                        }
                        case 2 -> {
                            System.out.println("Qual id do carro deseja excluir? ");
                            carrosDisponiveisCatalogo.listarCarros();
                            int id = sc.nextInt();
                            carrosDisponiveisCatalogo.removerCarros(id);
                        }
                        case 3 -> {
                            System.out.println("Qual carro gostaria de atualizar? ");
                            carrosDisponiveisCatalogo.listarCarros();
                            int id = sc.nextInt();
                            sc.nextLine();

                            CarroOperacoes carroAtualizado = new CarroOperacoes();
                            System.out.println("Digite as informações do carro: ");
                            System.out.println("Digite 0 para retornar:");
                            opcaoAux = sc.nextInt();
                        }
                        case 0 -> {
                            break;
                        }
                        default -> {
                            System.out.println("Opção digitada inválida. Escolha apenas uma das opções válidas!");
                        }
                    }
                } while (opcao != 0);

            } else if (tipo == 2) {
                do {
                    System.out.println("-CLIENTE-");
                    System.out.println("MENU DE OPÇÕES;");
                    System.out.println("1 - ALUGAR CARRO\n2 - DEVOLVER CARRO\n0 - SAIR\n\nDIGITE A OPCAO:");
                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 1:
                            carrosDisponiveisCatalogo.listarCarros();

                            System.out.println("Deseja alugar o carro:\n1 - SIM   2 - NÃo");
                            opcaoAux = sc.nextInt();

                            if (opcaoAux==1){
                                System.out.println("Informe o valor:");
                                doubleAux = sc.nextDouble();
                            }
                            else {
                                break;
                            }

                            System.out.println("Digite 0 para retornar:");
                            opcaoAux = sc.nextInt();
                            if (opcaoAux==0){
                                break;
                            }
                            break;

                        case 2:
                            System.out.println("~devolver");

                            System.out.println("Digite 0 para retornar:");
                            opcaoAux = sc.nextInt();
                            if (opcaoAux==0){
                                break;
                            }

                        case 0:
                            break;
                        default:
                            System.out.println("Operacao invalida, escolha novamente a opcao:");
                            break;
                    }
                } while (opcao != 0);
            }
        } while (tipo != 0);
    }
}
