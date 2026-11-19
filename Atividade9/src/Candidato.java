public class Candidato extends Fisica {
    private String nome;
    private int numero;
    private Partido partido;

    public Candidato() {   
    }

    public String getNomeCandidato() {
        return this.nome;
    }

    public void setNomeCandidato(String nome) {
        this.nome = nome;
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