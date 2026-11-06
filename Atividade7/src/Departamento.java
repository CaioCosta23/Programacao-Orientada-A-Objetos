public abstract class Departamento {
    protected String nome;
    private String descricao;
    protected static float salario;

    public Departamento(String nome, String descricao, float salario) {
        this.nome = nome;
        this.descricao = descricao;
        Departamento.salario = salario;
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

    protected void setSalario(float salario) {
        Departamento.salario = salario;
    }

    public abstract void imprimeDadosDepartamento();
}
