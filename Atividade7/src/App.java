import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        final int DEPARTAMENTO_TECNOLOGIA = 1;
        final int DEPARTAMENTO_ELETRICA = 2;
        
        int quantidadeDepartamentos = 0;
        int opcao;
        String operacao, nome, funcao;
        float salario;

        Departamento tecnologia = new DepartamentoTecnologia();
        Departamento eletrica = new DepartamentoEletrica();

        System.out.println("-> Empresa POO");

        while(true){
            System.out.println("# Escolha um dos departamentos que deseja inserir o funcionário:");
            System.out.println("[1] Tecnologia\t [2] Elétrica");

            
            leitor.close();
        }

        if (quantidadeDepartamentos >= 0) {
            int d;

            tecnologia.imprimeDadosDepartamento();
            eletrica.imprimeDadosDepartamento();
        }else {
            System.out.println("Departamentos vazios.\n");
        }
    }
}
