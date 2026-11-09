public class Funcionario {
   private String nome;
   private String funcao;
   
   public Funcionario(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
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

   protected void imprimeNome() {
        System.out.println("* Nome do funcionário:" + this.nome);
   }

   protected void imprimeFuncao() {
        System.out.println("* Função" + this.funcao);
   }

   public void imprimeDadosFuncionario() {
        imprimeNome();
        imprimeFuncao();
   }
}
