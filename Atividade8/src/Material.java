public abstract class Material {
    private static int id;
    private String titulo;
    private float preco;
    private int anoPublicacao;

    public Material(int id, String titulo, float preco, int anoPublicacao) {
        Material.id = id;
        this.titulo = titulo;
        this.preco = preco;
        this.anoPublicacao = anoPublicacao;
    }

    public int getId() {
        return Material.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void imprimeDadaosMaterial() {
        // A fazer;
    }
}
