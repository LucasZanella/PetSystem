import java.util.Scanner;

public class ClientesControlador {

    public static void inputCliente() {
        Scanner input = new Scanner(System.in);

        String cpf;
        String nome;
        String endereco;
        String telefone;
        Double preco;
        boolean verificacaoDados;
        boolean cadastroPets;

        try {
            do {
                System.out.println("\n\n\n\n");
                System.out.println("=============================================");
                System.out.println("\t    CADASTRO DE CLIENTE");
                System.out.println("=============================================");

                System.out.println("Informe o CPF:\t");
                cpf = input.next();

                System.out.println("Informe o nome:\t");
                nome = input.next();

                System.out.println("Informe o endereço:\t");
                endereco = input.next();

                System.out.println("Informe o telefone:\t");
                telefone = input.next();

                System.out.println("Informe o valor:\t");
                preco = input.nextDouble();

                System.out.println("\n\nAs informações estão corretas?\n\t* 1 -> Sim\n\t* 0 -> Não");
                verificacaoDados = input.next().equals("1");


            } while (!verificacaoDados && preco < 0.0);

            System.out.println("\n\nQuer fazer cadastro de pets?\n\t* 1 -> Sim\n\t* 0 -> Não");
            cadastroPets = input.next().equals("1");

            if (cadastroPets){
                Clientes cliente = new Clientes(cpf, nome, endereco, telefone, preco, PetsControlador.inputPets());
                System.out.println(cliente.toString());
            } else {
                Clientes cliente = new Clientes(cpf, nome, endereco, telefone, preco, null);
                System.out.println(cliente);
            }

        } catch (Exception e) {
            System.out.println("\t\t!!ATENÇÃO!!\nInforme os valores corretos de cada infromação!");
        }
    }
}
