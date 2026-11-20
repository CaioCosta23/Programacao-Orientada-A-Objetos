public class DepartamentoTecnologia extends Departamento implements Operacoes {
    private static final int id = 1;
    private String area;

    public DepartamentoTecnologia(String nome, String descricao, float salario, String area, float bonus) {
        super(nome, descricao, salario, bonus);
        this.area = area;
    }

    public int getId() {
        return DepartamentoTecnologia.id;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
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
        System.out.println("- Área de atuação: " + this.getArea());
    }
}
