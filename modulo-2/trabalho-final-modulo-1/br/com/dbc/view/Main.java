package br.com.dbc.view;

import br.com.dbc.controller.AlugueisController;
import br.com.dbc.controller.CarrosController;
import br.com.dbc.controller.ClientesController;
import br.com.dbc.model.Aluguel;
import br.com.dbc.model.Carro;
import br.com.dbc.model.Cliente;
import br.com.dbc.service.AluguelService;
import br.com.dbc.service.CarroService;
import br.com.dbc.service.ClienteService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escolha = 0;
        
        while (escolha != 3) {
            System.out.println("SEJA BEM VINDO A LOCADORA DBCAR!");
            System.out.println("LOGIN:\n1 - ACESSO FUNCIONÁRIO;\n2 - ACESSO CLIENTE;");
            System.out.print("SUA ESCOLHA: ");
            int opcaoMenu = Integer.parseInt(sc.nextLine());
            switch (opcaoMenu) {
                case 1 -> {
                    System.out.println("VOCÊ ESTÁ ACESSANDO O MENU PARA FUNCIONÁRIO;");
                    System.out.println("------ MENU PARA FUNCIONÁRIOS ------");
                    System.out.println("1 - LISTAR OS CARROS DISPONÍVEIS DO CATÁLOGO;\n2 - ADICIONAR UM NOVO CARRO AO CATÁLOGO;\n3 - ATUALIZAR UM CARRO DO CATÁLOGO;\n4 - REMOVER CARRO DO CATÁLOGO;\n0 - SAIR;\nSUA ESCOLHA: ");
                    int opcaoFuncionario = Integer.parseInt(sc.nextLine());
                    sc.nextLine();
                    switch (opcaoFuncionario) {
                        case 1 -> {
                            CarroService.carrosService.listarCarros();
                            System.out.println("-------------------------------------------------");
                        }
                        case 2 -> {
                            Carro carro = new Carro();
                            System.out.println("Informe o ID do carro: ");
                            carro.setIdCarro(Integer.parseInt(sc.nextLine()));
                            System.out.println("br.com.dbc.model.Carro está disponível? (S/N): ");
                            carro.setAlugado(sc.nextLine());
                            System.out.println("Informe o nome do carro: ");
                            carro.setNomeCarro(sc.nextLine());
                            System.out.println("Informe a marca do carro: ");
                            carro.setMarca(sc.nextLine());
                            System.out.println("Informe a classe do carro: ");
                            carro.setClasse(sc.nextLine());
                            System.out.println("Informe a quantidade de passageiros que o carro suporta: ");
                            carro.setQntPassageiros(Integer.parseInt(sc.nextLine()));
                            System.out.println("Informe a quantidade de km rodados pelo carro: ");
                            carro.setKmRodados(Integer.parseInt(sc.nextLine()));
                            System.out.println("Informe o preço da diária do carro R$: ");
                            carro.setPrecoDiaria(Double.parseDouble(sc.nextLine()));
                            System.out.println("---- CARRO CADASTRADO COM SUCESSO ----");

                            CarroService.carrosService.adicionarCarro(carro);
                        }
                        case 3 -> {
                            CarroService.carrosService.listarCarros();
                            System.out.println("-------------------------------------------------");
                            System.out.println("Informe o ID do carro que deseja atualizar: ");
                            int idAtualizar = sc.nextInt();
                            sc.nextLine();

                            Carro carroAtualizado = new Carro();

                            System.out.println("Informe o novo ID do carro: ");
                            carroAtualizado.setIdCarro(Integer.parseInt(sc.nextLine()));
                            System.out.println("br.com.dbc.model.Carro está disponível ou alugado? (S/N): ");
                            carroAtualizado.setAlugado(sc.nextLine());
                            System.out.println("Informe o nome do carro: ");
                            carroAtualizado.setNomeCarro(sc.nextLine());
                            System.out.println("Informe a marca do carro: ");
                            carroAtualizado.setMarca(sc.nextLine());
                            System.out.println("Informe a classe do carro: ");
                            carroAtualizado.setClasse(sc.nextLine());
                            System.out.println("Informe a quantidade de passageiros que o carro suporta: ");
                            carroAtualizado.setQntPassageiros(Integer.parseInt(sc.nextLine()));
                            System.out.println("Informe a quantidade de km rodados pelo carro: ");
                            carroAtualizado.setKmRodados(Integer.parseInt(sc.nextLine()));
                            System.out.println("Informe o preço da diária do carro R$: ");
                            carroAtualizado.setPrecoDiaria(Double.parseDouble(sc.nextLine()));

                            CarroService.carrosService.atualizarCarro(idAtualizar, carroAtualizado);
                            System.out.println("---- CARRO ATUALIZADO COM SUCESSO ----");
                        }
                        case 4 -> {
                            CarroService.carrosService.listarCarros();
                            System.out.println("----------------------------------------------");
                            System.out.println("Informe o ID do carro que deseja remover: ");
                            int idRemover = sc.nextInt();

                            CarroService.carrosService.removerCarro(idRemover);
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
                            CarroService.carrosService.listarCarros();
                            System.out.println("-------------------------------------------------");
                        }
                        case 2 -> {
                            System.out.println("Informe o ID do carro que deseja alugar: ");
                            int idCarroEscolhido = (Integer.parseInt(sc.nextLine()));
                            Carro carroEscolhido = CarroService.carrosService.selecionarCarro(idCarroEscolhido);
                            System.out.println("Informe o ID do cliente: ");
                            int idClienteAluguel = (Integer.parseInt(sc.nextLine()));
                            Cliente clienteAluguel = ClienteService.clientesService.selecionarCliente(idClienteAluguel);
                            System.out.println("Dia do aluguel: ");
                            int diaAluguel = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Dia da entrega: ");
                            int diaEntrega = sc.nextInt();
                            sc.nextLine();
                            Aluguel aluguelCarro = new Aluguel();
                            aluguelCarro.setCarro(carroEscolhido);
                            aluguelCarro.setCliente(clienteAluguel);
                            aluguelCarro.setDiaDoAluguel(diaAluguel);
                            aluguelCarro.setDiaDaEntrega(diaEntrega);
                            System.out.println("Valor do aluguel R$: " + aluguelCarro.valorDoAluguel());
                            System.out.println("CONFIRMAR ALUGUEL?\n1 - Sim;\n2 - Não\nSUA ESCOLHA: ");
                            int confirmarAluguel = sc.nextInt();
                            if (confirmarAluguel == 1) {
                                AluguelService.alugueisService.alugar(aluguelCarro);
                            } else {
                                System.out.println("ALUGUEL CANCELADO;");
                            }
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