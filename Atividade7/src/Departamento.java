public abstract class Departamento {
    protected String nome;
    private String descricao;
    private float salario;

    public Departamento(String nome, String descricao, float salario) {
        this.nome = nome;
        this.descricao = descricao;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected String getDescricao() {
        return this.descricao;
    }

    protected void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    protected float getSalario() {
        return this.salario;
    }

    protected void setSalario(float salario) {
        this.salario = salario;
    }

    public abstract void imprimeDadosDepartamento();
}
