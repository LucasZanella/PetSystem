import java.io.*;
import java.util.ArrayList;

public class ArquivoControlador {


    public static void exportarContatos(ArrayList<Clientes> listaClientes)  throws IOException {
        FileWriter arq = new FileWriter("dados.dat");
        PrintWriter gravarArq = new PrintWriter(arq);
        int i;
        for (i=0; i<listaClientes.size(); i++) {
            gravarArq.println(listaClientes.get(i));
        }
        gravarArq.close();
    }

    public static ArrayList<Clientes> importarClientes() {
        ArrayList<Clientes> clientesLidos = new ArrayList<>();

        try {
            FileReader arq = new FileReader("dados.dat");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine(); // lê a primeira linha
            // a variável "linha" recebe o valor "null" quando o processo
            // de repetição atingir o final do arquivo texto
            while (linha != null) {
                Clientes cliente = new Clientes();
                contato.nome = linha;
                agendaLida.add(contato);
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }
            arq.close();
        } catch (IOException e) {
            System.err.println("Erro na abertura do arquivo: "+ e.getMessage());
        }
        return agendaLida;
    }

    public verificaArquivo(){
        boolean exists = (new File("Dados.dat")).exists();

        if (!exists){
            re

        } else {

        }

    }
}
