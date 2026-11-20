public class DepartamentoEletrica extends Departamento implements Operacoes {
    private static final int id = 2;
    private final String areaApoio;
    private String especializacao;
    
    public DepartamentoEletrica(String nome, String descricao, float salario, float bonus, String areaApoio, String especializacao) {
        super(nome, descricao, salario, bonus);
        this.areaApoio = areaApoio;
        this.especializacao = especializacao;
    }

    public int getId() {
        return DepartamentoEletrica.id;
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
        return super.getSalario() + (super.getBonus() * super.getSalario());
    }

    @Override
    public void imprimeDadosDepartamento() {
        System.out.println("- Nome: " + this.getNome());
        System.out.println("- Descrição: " + this.getDescricao());
        System.out.println("- Salário Base: " + super.getSalario());
        System.out.println("- Salário Total: " + this.calculaSalarioTotal());
        System.out.println("- Área de apoio: " + this.getAreaApoio());
        System.out.println("- Especialização: " + this.getEspecializacao());
    }
}
