public class Eleitor extends Pessoa{
    private String titulo;

    public Eleitor() {
    }

    protected String getTitulo() {
        return this.titulo;
    }

    protected void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}