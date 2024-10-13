import java.util.ArrayList;

public class Clientes {
    private String nome;
    private String endereco;
    private String telefone;
    private Double saldo;
    private ArrayList<Pets> pets;

    public Clientes(String nome, String endereco, String telefone, Double saldo, ArrayList<Pets> pets) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.saldo = 0.0;
        this.pets = pets;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Pets> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pets> pets) {
        this.pets = pets;
    }
}
