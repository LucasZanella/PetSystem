import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ArquivoControlador {

    public static void exportarClientes (ArrayList<Clientes> listaClientes) throws IOException {
        File file = new File("Dados.dat");
        PrintWriter gravarArq = new PrintWriter(file);

        for (int i=0; i<listaClientes.size(); i++) {
            gravarArq.println(listaClientes);
        }
        gravarArq.close();
    }

    public static ArrayList<Clientes> carregarClientes() {
        ArrayList<Clientes> clientes = new ArrayList<>();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Dados.dat"))) {
            clientes = (ArrayList<Clientes>) in.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de clientes não encontrado. Continuando com lista vazia.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar clientes: " + e.getMessage());
        }
        return clientes;
    }

//    public static ArrayList<Clientes> importarClientes() {
//        ArrayList<Clientes> clientesLidos = new ArrayList<>();
//
//        try {
//            FileReader arq = new FileReader("Dados.dat");
//            BufferedReader lerArq = new BufferedReader(arq);
//            String linha = lerArq.readLine();
//
//            while (linha != null) {
//
//                for (int i = 0; )
//            }
//            lerArq.close();
//            arq.close();
//
//        } catch (IOException e) {
//            System.err.println("Erro na abertura do arquivo: "+ e.getMessage());
//        }
//
//        return clientesLidos;
//    }

    public static void verificaArquivo() throws IOException {
        boolean exists = (new File("Dados.dat")).exists();
        if (!exists){
             new FileWriter("Dados.dat");
        }
    }
}
