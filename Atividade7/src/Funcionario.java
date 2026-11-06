public class Funcionario {
   private String nome;
   private String funcao;
   private float bonus;
   
   public Funcionario(String nome, String funcao, float bonus) {
        this.nome = nome;
        this.funcao = funcao;
        this.bonus = bonus;
   }

   public String getNome() {
        return this.nome;
   }

   public void setNome(String nome) {
        this.nome = nome;
   }

   public String getFuncao() {
        return this.funcao;
   }

   public void setFuncao(String funcao) {
        this.funcao = funcao;
   }

   public float getBonus() {
        return this.bonus;
   }

   public void setBonus(float bonus) {
        this.bonus = bonus;
   }

   protected void imprimeNome() {
        System.out.println("* Nome do funcionário:" + this.nome);
   }

   protected void imprimeFuncao() {
        System.out.println("* Função" + this.funcao);
   }

   protected void imprimeSalario() {
        System.out.println("* Salario: R$" + (Departamento.salario + (Departamento.salario * bonus)));
   }

   public void imprimeDadosFuncionario() {
        imprimeNome();
        imprimeFuncao();
        imprimeSalario();
   }
}
