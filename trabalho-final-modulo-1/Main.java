import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipo =0;
        int opcao = 0;
        
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
        System.out.println("LOGIN:\nDigite 1 para funcionário ou Digite 2 para cliente:");
        tipo = sc.nextInt();

        if (tipo == 1)
        {
            System.out.println("-FUNCIONARIO-");
            System.out.println("MENU DE OPÇÕES;");
            System.out.println("1 - ADICIONAR CARRO DO CATALOGO\n2 - REMOVER CARRO DO CATALOGO\n3 - ATUALIZAR CATALOGO\n0 - SAIR\nDIGITE A OPCAO:");
            opcao = sc.nextInt();
            switch (opcao){
                case  1:
                    System.out.println("~adicionar~");
                    break;

                case 2:
                    System.out.println("~remover");
                case 3:
                    System.out.println("~atualizar");
            }
        }
        else if(tipo ==2){
            System.out.println("-CLIENTE-");
            System.out.println("MENU DE OPÇÕES;");
            System.out.println("1 - VERIFICAR CARROS DISPONÍVEIS\n2 - ALUGAR CARRO\n3 - DEVOLVER CARRO\n0 - SAIR\n\nDIGITE A OPCAO:");
            opcao = sc.nextInt();
            switch (opcao){
                case  1:
                    System.out.println("~lista~");
                    break;

                case 2:
                    System.out.println("~alugar");
                case 3:
                    System.out.println("~devolver");
            }
        }

        }

    }
