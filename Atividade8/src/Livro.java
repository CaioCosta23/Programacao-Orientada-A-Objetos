public class Livro extends Material{
   private String autor;
   private String subtitulo;
   
   public Livro(int id, String titulo, float valor, int anoPublicacao, String autor, String subtitulo) {
        super(id, titulo, valor, anoPublicacao);

        this.autor = autor;
        this.subtitulo = subtitulo;
   }

   public String getAutor() {
        return this.autor;
   }

   public void setAutor(String autor) {
        this.autor = autor;
   }

   public String getSubtitulo() {
        return this.subtitulo;
   }

   public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
   }

   @Override
   public void imprimeDadosMaterial() {
        super.imprimeDadosMaterial();

        System.out.println("# Autor: " + this.getAutor());
        System.out.println("# Subtitulo: " + this.getSubtitulo());
   }
}
