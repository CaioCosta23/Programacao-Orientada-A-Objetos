public class DepartamentoTecnologia extends Departamento implements Operacoes {
    private String area;

    public DepartamentoTecnologia(String nome, String descricao, float salario, String area, float bonus) {
        super(nome, descricao, salario, bonus);
        this.area = area;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    @Override
    public float calculaSalarioTotal() {
        return Departamento.salario + (Departamento.salario * Departamento.bonus);
    }

    @Override
    public void imprimeDadosDepartamento() {
        System.out.println("- Nome: " + this.getNome());
        System.out.println("- Descrição: " + this.getDescricao());
        System.out.println("- Salário Base: " + Departamento.salario);
        System.out.println("- Salário Total: " + this.calculaSalarioTotal());
        System.out.println("- Área de atuação: " + this.getArea());
    }
}
