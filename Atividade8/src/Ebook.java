public class Ebook extends Material{
    private String versao;

    public Ebook(int id, String titulo, float valor, int anoPublicacao, String versao) {
        super(id, titulo, valor, anoPublicacao);

        this.versao = versao;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    @Override
    public void imprimeDadosMaterial() {
        super.imprimeDadosMaterial();

        System.out.println("# Versão: " + this.getVersao());
    }
}
