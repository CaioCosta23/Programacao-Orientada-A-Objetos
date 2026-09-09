public class Carro {
    private String placa;
    private String marca;
    private String modelo;
    protected float km;

    public Carro(String placa, String marca, String modelo, float km) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
    }
    
    private String getPlaca() {
        return this.placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getKm() {
        return this.km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public void imprimeInformacoesCarro() {
        System.out.println("- Placa: " + this.getPlaca());
        System.out.println("- Modelo: " + this.getModelo());
        System.out.println("- Marca: " + this.getMarca());
        System.out.println("- Quilometragem: " + this.getKm());

    }
}
