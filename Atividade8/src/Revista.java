public class Revista extends Material {
   private int edicao;
   private String editora;
   
   public Revista(int id, String titulo, float preco, int anoPublicacao, int edicao, String editora) {
        super(id, titulo, preco, anoPublicacao);

        this.edicao = edicao;
        this.editora = editora;
   }

   public int getEdicao() {
        return this.edicao;
   }

   public void setEdicao(int edicao) {
        this.edicao = edicao;
   }

   public String getEditora() {
        return this.editora;
   }

   public void getEditora(String editora) {
        this.editora = editora;
   }
   
   @Override
   public void imprimeDadosMaterial() {
        super.imprimeDadosMaterial();

        System.out.println("# Edicao: " + this.getEdicao() + "ª edição");
        System.out.println("# Editora: " + this.getEditora());
   }
}
