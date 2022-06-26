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

        CaracteristicasCarro caracFusca = new CaracteristicasCarro("Wolkswagem", "qualquer", 1990, 4,
                120000L, 25.0);
        CaracteristicasCarro caracPalio = new CaracteristicasCarro("Fiat", "2.0", 2010, 5,
                40000L, 45.0);

        Carro fusca = new Carro("Fusca", caracFusca, "B", 100.00);
        Carro palio = new Carro("Palio", caracPalio, "C", 100.00);

        Aluguel aluguel1 = new Aluguel(26, 4, fusca);

        Cliente cliente1 = new Cliente("Willian", "111.222.333-44", "Cliente", aluguel1);

       // CarroOperacoes carro = new CarroOperacoes(new CaracteristicasCarro("Fiat", "Palio", 2010"", 5, 1480L, 40.0));

        // MENU DE OPÇÕES:
        // 1 - CLIENTE OU FUNCIONÁRIO?
        //     1.1 - CLIENTE;
        //        1.2 - VERIFICAR CARROS DISPONÍVEIS;
        //          1.2.1. CARRO 1;
        //          1.2.2  CARRO 2;
        //          1.2.3  CARRO 3;
        //          1.2.4  CARRO 4;
        //          1.2.5  CARRO 5;
        //        1.3 - ALUGAR CARRO;
        //        1.4 - DEVOLVER CARRO;
        //        1.5 - SAIR;
        //     2.1 - FUNCIONÁRIO;
        //        2.1 - ADICIONAR CARRO A WISH LIST;
        //        2.2 - REMOVER CARRO DA WISH LIST;
        //        2.3 - ATUALIZAR CARRO DA WISH LIST;
        // 0 - SAIR;
        /*
        int escolha = 0;
        while (escolha != 0) {
            System.out.println("SEJA BEM VINDO(S) A DBCAR");
            System.out.println("A melhor locadora de carros do Brasil!");
            System.out.println("_______________________________________");
            System.out.println("MENU DE OPÇÕES;");
            System.out.println("1 - LISTAR CARROS DISPONÍVEIS;\n2 - ADICIONAR UM CARRO A WISH LIST;\n3 - REMOVER CARRO DA WISH LIST;\n4 - ATUALIZAR CARRO DA WISH LIST;\n0 - SAIR.");
        }
         */

        System.out.println("SEJA BEM VINDO(S) A DBCAR");
        System.out.println("A melhor locadora de carros do Brasil!");
        System.out.println("_______________________________________");
        System.out.println("\t\n" +
                "              ____----------- _____\n" +
                "\\~~~~~~~~~~/~_--~~~------~~~~~     \\\n" +
                " `---`\\  _-~      |                   \\\n" +
                "   _-~  <_         |                    \\[]\n" +
                " / ___     ~~--[\"\"] |      ________-------'_\n" +
                "> /~` \\    |-.   `\\~~.~~~~~                _ ~ - _\n" +
                " ~|  ||\\%  |       |    ~  ._                ~ _   ~ ._\n" +
                "   `_//|_%  \\      |          ~  .             ~-_   /\\\n" +
                "          `--__     |    _-____  /\\               ~-_ \\/.\n" +
                "              ~--_ /  ,/ -~-_ \\ \\/         _______---~/\n" +
                "                  ~~-/._<   \\ \\`~~~~~~~~~~~~~     ##--~/\n" +
                "                         \\    ) |`------##---~~~~-~  ) )\n" +
                "                          ~-_/_/                  ~~ ~~\n");


        do {
            System.out.println("LOGIN:\nDigite 1 para funcionário ou Digite 2 para cliente:");
            tipo = sc.nextInt();

            if (tipo == 1) {
                do {
                    System.out.println("-FUNCIONARIO-");
                    System.out.println("MENU DE OPÇÕES;");
                    System.out.println("1 - ADICIONAR CARRO DO CATALOGO\n2 - REMOVER CARRO DO CATALOGO\n3 - ATUALIZAR CATALOGO\n0 - SAIR\nDIGITE A OPCAO:");

                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("~adicionar~");
                            System.out.println("Digite 0 para retornar:");
                            opcaoAux = sc.nextInt();
                            if (opcaoAux==0){
                                break;
                            }
                        case 2:
                            System.out.println("~remover");
                            System.out.println("Digite 0 para retornar:");
                            opcaoAux = sc.nextInt();
                            if (opcaoAux==0){
                                break;
                            }
                        case 3:
                            System.out.println("~atualizar");
                            System.out.println("Digite 0 para retornar:");
                            opcaoAux = sc.nextInt();
                            if (opcaoAux==0){
                                break;
                            }
                        case 0:
                            System.out.println("~voltar menu");
                            break;
                    }
                } while (opcao != 0);

            } else if (tipo == 2) {
                do {
                    System.out.println("-CLIENTE-");
                    System.out.println("MENU DE OPÇÕES;");
                    System.out.println("1 - VERIFICAR CARROS DISPONÍVEIS\n2 - ALUGAR CARRO\n3 - DEVOLVER CARRO\n0 - SAIR\n\nDIGITE A OPCAO:");
                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 1:
                            fusca.imprimir();
                            palio.imprimir();

                            System.out.println("Digite 0 para retornar:");
                            opcaoAux = sc.nextInt();
                            if (opcaoAux==0){
                                break;
                            }

                        case 2:
                            cliente1.alugar(palio.getValorAluguelCarro());
                            System.out.println(palio.getValorAluguelCarro());
                            System.out.println("Deseja alugar o carro:\n1 - SIM   2 - NÃo");
                            opcaoAux = sc.nextInt();
                            if (opcaoAux==1){
                                System.out.println("Informe o valor:");
                                doubleAux = sc.nextDouble();
                                cliente1.pagar(doubleAux, palio.getValorAluguelCarro());
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
                        case 3:
                            System.out.println("~devolver");

                            System.out.println("Digite 0 para retornar:");
                            opcaoAux = sc.nextInt();
                            if (opcaoAux==0){
                                break;
                            }
                            break;
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
