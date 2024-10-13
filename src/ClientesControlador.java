import java.util.ArrayList;
import java.util.Scanner;

public class ClientesControlador {

    public static void mostraClientes(){
        ArrayList<Clientes> listaClientes =  ArquivoControlador.carregarClientes();

        for (int i=0; i<listaClientes.size(); i++){

            if (listaClientes.isEmpty()){
                System.out.println("\n\nNao há clientes cadastrados!");
            }else {

                System.out.println(listaClientes.get(i).getCpf()+";"+listaClientes.get(i).getNome()+";"+listaClientes.get(i).getEndereco()+";"+listaClientes.get(i).getTelefone()+";"+listaClientes.get(i).getSaldo().toString()+";");

                for (int l=0; l<listaClientes.get(l).getPets().size(); l++){
                    if(listaClientes.get(i).getPets().isEmpty()){
                        System.out.println("Sem cadastro de pet");
                    }else {
                        System.out.println(listaClientes.get(i).getPets().get(l).getNome()+";"+listaClientes.get(i).getPets().get(l).getRaca()+";"+listaClientes.get(i).getPets().get(l).getIdade()+";"+listaClientes.get(i).getPets().get(l).getDescricao());
                    }
                }
            }
        }
    }

    public static void inputCliente() {
        Scanner input = new Scanner(System.in);
        ArrayList<Clientes> listaClientes = new ArrayList<>();

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
                Clientes objCliente = new Clientes(cpf, nome, endereco, telefone, preco, PetsControlador.inputPets());
                listaClientes.add(objCliente);
            } else {
                Clientes objCliente = new Clientes(cpf, nome, endereco, telefone, preco, null);
                listaClientes.add(objCliente);
            }
            ArquivoControlador.exportarClientes(listaClientes);

        } catch (Exception e) {
            System.out.println("\t\t!!ATENÇÃO!!\nInforme os valores corretos de cada infromação!");
        }
    }
}
