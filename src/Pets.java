public class Pets {
    private String raca;
    private Integer idade;
    private String descricao;

    public Pets(String descricao, Integer idade, String raca) {
        this.descricao = descricao;
        this.idade = idade;
        this.raca = raca;
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
}