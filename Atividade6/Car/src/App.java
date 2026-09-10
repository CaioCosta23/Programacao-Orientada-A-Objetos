public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        
        Carro carro1 = new Carro ("ANL6-KCG", "Chevroletet", "Ônix", 20000f);
        Carro carro2 = new Carro ("LR7H6-WCP", "Volkswagem", "Gol", 5000f);

        System.out.println("Carro 1:");
        carro1.imprimeInformacoesCarro();

        System.out.println("------------------------------------------------");

        System.out.println("Carro 2:");
        carro2.imprimeInformacoesCarro();
    }
}
