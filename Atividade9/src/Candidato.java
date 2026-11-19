public class Candidato extends Pessoa {
    private int numero;
    private Partido partido;

    public Candidato() {
        Leitor leitor = new Leitor();

        //super(leitor.leNome(), leitor.leDocumento(), leitor.leEstado());
        //this.numero = leitor.leNumero();
        //this.partido = leitor.lePartido();

    }

    public int getNumeroCandidato() {
        return this.numero;
    }

    public void setNumeroCandidato(int numero) {
        this.numero = numero;
    }

    public Partido getPartidoCandidato() {
        return this.partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
}