public class Fisica {
    private String nome;
    private static String cpf;

    public Fisica() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected String getCpf() {
        return Fisica.cpf;
    }

    protected void setCpf(String cpf) {
        Fisica.cpf = cpf;
    }
    
}
