public class DepartamentoTecnologia extends Departamento implements Operacoes {
    private String area;
    private static float bonus;

    public DepartamentoTecnologia(String nome, String descricao, float salario, String area, float bonus) {
        super(nome, descricao, salario);
        this.area = area;
        DepartamentoTecnologia.bonus = bonus;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public float getBonus(){
        return DepartamentoTecnologia.bonus;
    }

    protected void setBonus(float bonus) {
        DepartamentoTecnologia.bonus = bonus;
    }
    
    @Override
    public float calculaSalarioTotal() {
        return Departamento.salario + (Departamento.salario * DepartamentoTecnologia.salario);
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
