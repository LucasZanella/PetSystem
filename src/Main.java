import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            do {
                ArquivoControlador.verificaArquivo();
                switch (menuInicial()){
                    case 0:
                        System.exit(0);
                    break;
                    case 1:
                        switch (subMenuCliente()){
                            case 0:
                                break;
                            case 1:
                                ClientesControlador.inputCliente();
                            break;
                            case 2:
                                ClientesControlador.mostraClientes();
                            break;
                            case 3:

                            break;
                        }
                    break;
                    case 2:
                        switch (subMenuPet()){
                            case 0:
                                break;
                            case 1:

                            break;
                            case 2:

                            break;
                        }
                    break;
                    case 3:
                        switch (subMenuServicos()){
                            case 0:
                                break;
                            case 1:

                            break;
                            case 2:

                            break;
                            case 3:

                            break;
                        }
                    break;
                }
            }while (true);

        } catch (Exception e) {
            System.out.println("\n\t!!Atenção!!\nDigite o número correto!");
        }
    }

    static boolean enter = false;

    public static int menuInicial(){
        Scanner menu_escolha = new Scanner(System.in);

        if(enter){
            System.out.println("\n\n\n\n");
        }

        System.out.println("=====================================");
        System.out.println("\t  MENU DA APLICAÇÃO ");
        System.out.println("=====================================");
        System.out.println("* 1 -> Cadastro de clientes.");
        System.out.println("* 2 -> Cadastro de pets.");
        System.out.println("* 3 -> Serviços e controle de caixa.");
        System.out.println("* 0 -> Sair do sistema.");
        System.out.println("=====================================");
        System.out.print("Digite sua opção:\t");
        enter = true;

        return menu_escolha.nextInt();
    }

    public static int subMenuCliente(){
        Scanner menu_escolha = new Scanner(System.in);

        System.out.println("\n\n\n\n");
        System.out.println("=====================================");
        System.out.println("   MENU DA APLICAÇÃO --> CLIENTES");
        System.out.println("=====================================");
        System.out.println("1. Cadastro de clientes.");
        System.out.println("\t* 1 ->  Incluir clientes.");
        System.out.println("\t* 2 ->  Listar clientes.");
        System.out.println("\t* 3 ->  Excluir clientes.");
        System.out.println("\t* 0 ->  Voltar.\n");
        System.out.println("2. Cadastro de pets.");
        System.out.println("3. Serviços e controle de caixa.");
        System.out.println("0. Sair do sistema.");
        System.out.println("=====================================");
        System.out.print("Digite sua opção:\t");

        return menu_escolha.nextInt();
    }

    public static int subMenuPet(){
        Scanner menu_escolha = new Scanner(System.in);

        System.out.println("\n\n\n\n");
        System.out.println("=====================================");
        System.out.println("     MENU DA APLICAÇÃO --> PETS");
        System.out.println("=====================================");
        System.out.println("1. Cadastro de clientes.");
        System.out.println("2. Cadastro de pets.");
        System.out.println("\t* 1 ->  Incluir pets.");
        System.out.println("\t* 2 ->  Excluir pets.");
        System.out.println("\t* 0 ->  Voltar.\n");
        System.out.println("3. Serviços e controle de caixa.");
        System.out.println("0. Sair do sistema.");
        System.out.println("=====================================");
        System.out.print("Digite sua opção:\t");

        return menu_escolha.nextInt();
    }

    public static int subMenuServicos(){
        Scanner menu_escolha = new Scanner(System.in);

        System.out.println("\n\n\n\n");
        System.out.println("=====================================");
        System.out.println("   MENU DA APLICAÇÃO --> SERVIÇOS");
        System.out.println("=====================================");
        System.out.println("1. Cadastro de clientes.");
        System.out.println("2. Cadastro de pets.");
        System.out.println("3. Serviços e controle de caixa.");
        System.out.println("\t* 1 ->  Lançar serviço.");
        System.out.println("\t* 2 ->  Lançar pagamento.");
        System.out.println("\t* 3 ->  Listar saldo dos clientes.");
        System.out.println("\t* 4 ->  Listar clientes com saldo negativo.");
        System.out.println("\t* 0 ->  Voltar.\n");
        System.out.println("0. Sair do sistema.");
        System.out.println("=====================================");
        System.out.print("Digite sua opção:\t");

        return menu_escolha.nextInt();
    }
}