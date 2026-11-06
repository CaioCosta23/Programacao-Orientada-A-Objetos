import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
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

            Scanner leitor = new Scanner(System.in);

            operacao = leitor.next();
            opcao = Integer.parseInt(operacao);

            if ((opcao != DEPARTAMENTO_TECNOLOGIA) || (opcao != DEPARTAMENTO_ELETRICA)) {
                break;
            }

            // Ainda necessário ver como criar o vetor de funcionários (sem estruturas de dados);

            System.out.println("- Digíte o nome do funcionário: ");
                
            nome = leitor.next();

            System.out.println("- Informe a função do funcionário no departamento: ");
            
            funcao = leitor.next();

            System.out.println("- Informe o nome do funcionário: ");
            
            salario = leitor.nextInt();

            if (opcao == DEPARTAMENTO_TECNOLOGIA) {
                String area;

                System.out.println("Informe a área de atuação: ");
                
                area = leitor.next();
            }

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
