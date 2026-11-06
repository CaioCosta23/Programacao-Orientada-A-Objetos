public class DepartamentoTecnologia extends Departamento {
    protected String nome;
    private String descricao;
    private float salario;

    public Departamento(String nome, String descricao, float salario) {
        this.nome = nome;
        this.descricao = descricao;
        this.salario = salario;
    }
}
