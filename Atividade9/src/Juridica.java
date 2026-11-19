public class Juridica extends Pessoa {
    private String razaoSocial;
    private String cnpj;

    public Juridica() {   
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    protected String getCnpj() {
        return this.cnpj;
    }

    protected void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}