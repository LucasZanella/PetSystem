import java.util.ArrayList;
import java.util.Scanner;

public class PetsControlador {

//    public void cadastroPets(){
//        Scanner input = new Scanner(System.in);
//
//        String cpf;
//
//        try {
//
//           do {
//               System.out.println("\n\n\n\n");
//               System.out.println("=============================================");
//               System.out.println("\t    CADASTRO DE PETS");
//               System.out.println("=============================================");
//
//               System.out.println("Informe o CPF:\t");
//               cpf = input.next();
//
//               if (){
//
//               }else {
//
//                   System.out.println("\nNao existe cliente com este CPF: " + (cpf));
//                   System.out.println("");
//               }
//
//           }while ();
//
//        } catch (Exception e) {
//            System.out.println("\t\t!!ATENÇÃO!!\nInforme os valores corretos de cada infromação!");
//        }
//    }

    public static ArrayList<Pets> inputPets() {
        Scanner input = new Scanner(System.in);
        ArrayList<Pets> pets = new ArrayList<>();

        String raca;
        String nome;
        Integer idade;
        String descricao;
        boolean verificacaoDados;
        boolean adicionaPets;

        try {
            do {
                System.out.println("\n\n\n\n");
                System.out.println("=============================================");
                System.out.println("\t    CADASTRO DE PETS");
                System.out.println("=============================================");

                System.out.println("Informe o nome:\t");
                nome = input.next();

                System.out.println("Informe a raça:\t");
                raca = input.next();

                System.out.println("Informe a idade:\t");
                idade = input.nextInt();

                System.out.println("Informe a descrição:\t");
                descricao = input.next();

                System.out.println("\n\nAs informações estão corretas?\n\t* 1 -> Sim\n\t* 0 -> Não");
                verificacaoDados = input.next().equals("1");

                System.out.println("\n\nQuer adicionar mais um pet?\n\t* 1 -> Sim\n\t* 0 -> Não");
                adicionaPets = input.next().equals("1");

                if (!verificacaoDados){
                    inputPets();
                }else {
                    Pets pet = new Pets(nome, raca, idade, descricao);
                    pets.addLast(pet);
                }

            }while (adicionaPets);

        } catch (Exception e) {
            System.out.println("\t\t!!ATENÇÃO!!\nInforme os valores corretos de cada infromação!");
        }

        return pets;
    }
}
