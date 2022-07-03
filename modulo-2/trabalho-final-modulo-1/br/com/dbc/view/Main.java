package br.com.dbc.view;

import br.com.dbc.model.Aluguel;
import br.com.dbc.model.Carro;
import br.com.dbc.model.Cliente;
import br.com.dbc.service.AluguelService;
import br.com.dbc.service.CarroService;
import br.com.dbc.service.ClienteService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("SEJA BEM VINDO A LOCADORA DBCAR!");
            System.out.println("LOGIN:\n1 - ACESSO AO MENU PARA FUNCIONÁRIOS;\n2 - ACESSO AO MENU PARA CLIENTES;");
            System.out.print("SUA ESCOLHA: ");
            int opcaoMenu = Integer.parseInt(sc.nextLine());

            switch (opcaoMenu) {
                case 1 -> {
                    System.out.println("BEM VINDO! VOCÊ ESTÁ ACESSANDO O MENU PARA FUNCIONÁRIOS;");
                    System.out.println("------ MENU PARA FUNCIONÁRIOS ------");
                    System.out.println("1 - LISTAR CARROS DISPONÍVEIS NO CATÁLOGO;");
                    System.out.println("2 - ADICIONAR UM NOVO CARRO NO CATÁLOGO;");
                    System.out.println("3 - ATUALIZAR UM CARRO DO CATÁLOGO;");
                    System.out.println("4 - REMOVER CARRO DO CATÁLOGO;");
                    System.out.println("5 - SAIR;");
                    System.out.println("SUA ESCOLHA: ");
                    int opcaoFuncionario = Integer.parseInt(sc.nextLine());
                    switch (opcaoFuncionario) {
                        case 1 -> {
                            CarroService.carrosService.listarCarros();
                            System.out.println("-------------------------------------------------");
                            break;
                        }
                        case 2 -> {
                            Carro carro = new Carro();

                            System.out.println("Informe o ID do carro: ");
                            carro.setIdCarro(Integer.parseInt(sc.nextLine()));

                            System.out.println("Carro está disponível? (S/N): ");
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

                            CarroService.carrosService.adicionarCarro(carro);
                            System.out.println("---- CARRO CADASTRADO COM SUCESSO ----");
                        }
                        case 3 -> {
                            CarroService.carrosService.listarCarros();
                            System.out.println("-------------------------------------------------");
                            System.out.println("Informe o ID do carro que deseja atualizar: ");
                            int idAtualizar = Integer.parseInt(sc.nextLine());

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
                            boolean validouId = false;
                            while(!validouId) {
                                try {
                                    int idRemover = Integer.parseInt(sc.nextLine());
                                    CarroService.carrosService.removerCarro(idRemover);
                                    validouId = true;
                                } catch (InputMismatchException ex) {
                                    System.out.println("Número ID inválido!");
                                }
                            }
                            System.out.println("---- CARRO REMOVIDO COM SUCESSO! ----");
                            break;
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
                    System.out.println("1 - LISTAR CARROS DISPONÍVEIS NO CATÁLOGO;");
                    System.out.println("2 - ALUGAR UM CARRO;");
                    System.out.println("3 - SAIR;");
                    System.out.println("SUA ESCOLHA: ");
                    int opcaoCliente = Integer.parseInt(sc.nextLine());

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
                            int diaAluguel = Integer.parseInt(sc.nextLine());

                            System.out.println("Dia da entrega: ");
                            int diaEntrega = Integer.parseInt(sc.nextLine());

                            Aluguel aluguelCarro = new Aluguel();
                            aluguelCarro.setCarro(carroEscolhido);
                            aluguelCarro.setCliente(clienteAluguel);
                            aluguelCarro.setDiaDoAluguel(diaAluguel);
                            aluguelCarro.setDiaDaEntrega(diaEntrega);

                            System.out.println("Valor do aluguel R$: " + aluguelCarro.valorDoAluguel());
                            System.out.println("CONFIRMAR ALUGUEL?");
                            System.out.println("1 - SIM");
                            System.out.println("2 - NÃO");
                            System.out.println("SUA ESCOLHA: ");
                            int confirmarAluguel = Integer.parseInt(sc.nextLine());

                            if (confirmarAluguel == 1) {
                                AluguelService.alugueisService.alugar(aluguelCarro);
                            } else {
                                System.out.println("ALUGUEL CANCELADO;");
                            }
                        }
                    }
                }
                default -> {
                    System.out.println("MENU SELECIONADO INVÁLIDO. POR FAVOR SELECIONE APENAS UM DOS MENUS DISPONÍVEIS.");
                }
            }
        }
    }
}