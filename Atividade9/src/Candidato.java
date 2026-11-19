public class Candidato extends Pessoa {
    private int numero;
    private Partido partido;

    public Candidato() {
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