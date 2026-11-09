public class DepartamentoEletrica extends Departamento implements Operacoes {
    private final String areaApoio;
    private String especializacao;
    
    public DepartamentoEletrica(String nome, String descricao, float salario, float bonus, String areaApoio, String especializacao) {
        super(nome, descricao, salario, bonus);
        this.areaApoio = areaApoio;
        this.especializacao = especializacao;
    }

    public String getAreaApoio() {
        return this.areaApoio;
    }

    public String getEspecializacao() {
        return this.especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public float calculaSalarioTotal() {
        return Departamento.salario + (Departamento.bonus * Departamento.salario);
    }

    @Override
    public void imprimeDadosDepartamento() {
        System.out.println("- Nome: " + this.getNome());
        System.out.println("- Descrição: " + this.getDescricao());
        System.out.println("- Salário Base: " + Departamento.salario);
        System.out.println("- Salário Total: " + this.calculaSalarioTotal());
        System.out.println("- Área de apoio: " + this.getAreaApoio());
        System.out.println("- Especialização: " + this.getEspecializacao());
    }
}
