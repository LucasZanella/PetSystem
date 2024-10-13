public class Pets {
    private String nome;
    private String raca;
    private Integer idade;
    private String descricao;

    public Pets(String nome, String raca, Integer idade, String descricao) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}