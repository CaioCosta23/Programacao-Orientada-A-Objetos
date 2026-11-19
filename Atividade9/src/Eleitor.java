public class Eleitor extends Pessoa{
    private String titulo;
    private float patrimonio;

    public Eleitor() {
    }

    protected String getTitulo() {
        return this.titulo;
    }

    protected void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPatrimonio() {
        return this.patrimonio;
    }

    public void setPatrimonio(float patrimonio) {
        this.patrimonio = patrimonio;
    }
}