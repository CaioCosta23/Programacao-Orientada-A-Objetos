public abstract class Pessoa {
    private String nome;
    private String cpf;
    private Estado estado;

    public Pessoa() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected String getCpf() {
        return this.cpf;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
