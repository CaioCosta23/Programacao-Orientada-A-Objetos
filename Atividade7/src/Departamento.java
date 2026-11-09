public abstract class Departamento {
    protected String nome;
    private String descricao;
    protected static float salario;
    protected static float bonus;

    public Departamento(String nome, String descricao, float salario, float bonus) {
        this.nome = nome;
        this.descricao = descricao;
        Departamento.salario = salario;
        Departamento.bonus = bonus;
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

    public float getBonus(){
        return DepartamentoTecnologia.bonus;
    }

    protected void setBonus(float bonus) {
        DepartamentoTecnologia.bonus = bonus;
    }

    public abstract void imprimeDadosDepartamento();
}
