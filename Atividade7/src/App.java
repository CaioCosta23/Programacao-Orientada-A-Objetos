import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        final int ADICIONAR = 1, EDITAR = 2, OPCAO_TECNOLOGIA = 1, OPCAO_ELETRICA = 2, MAXIMO_DEPARTAMENTOS = 2;
        final String TECNOLOGIA = "Tecnologia", ELETRICA = "Eletrica";
        
        int operacao, opcao;
        int quantidadeDepartamentos = 0;
        String descricao;
        float salario, bonus;

        Departamento tecnologia = null, eletrica = null;

        System.out.println("-> Empresa POO");

        while(true){
            System.out.print("# Escolha um dos departamentos que deseja inserir o funcionário:");
            System.out.print("[1] Adicionar Departamento\t [2] Editar dados de departamento");

            operacao = Integer.parseInt(leitor.next());

            if ((operacao != ADICIONAR) && (operacao != EDITAR))
                break;

            System.out.print("# Escolha um dos departamentos que deseja realizar a operação:");
            System.out.print("[1] Tecnologia\t [2] Elétrica");
            opcao = Integer.parseInt(leitor.next());

            switch(operacao) {
                case ADICIONAR:
                    System.out.print("-Digite a descrição das atribuições/funcões do departamento: ");
                    descricao = leitor.nextLine();
                    System.out.print("- Digite o salário (base) do departamento: ");
                    salario = Float.parseFloat(leitor.next());
                    System.out.print("- Informe o bônus atribuído ao departamento: ");
                    bonus = Float.parseFloat(leitor.next());
                    
                if (quantidadeDepartamentos >= MAXIMO_DEPARTAMENTOS) {
                    System.out.println("Quantidade limite de departamentos, atingida.");
                    break;
                }

                    if (opcao == OPCAO_TECNOLOGIA) {
                        String area;

                        System.out.print("- Informe a área de atuação: ");
                        area = leitor.nextLine();

                        tecnologia = new DepartamentoTecnologia(TECNOLOGIA, descricao, salario, area, bonus);
                        quantidadeDepartamentos++;

                    }else if (opcao == OPCAO_ELETRICA) {
                        String areaApoio, especialidade;

                        System.out.print("- Informe a área de apoio do departamento:");
                        areaApoio = leitor.nextLine();
                        System.out.print("- Informe a especialização do departamento: ");
                        especialidade = leitor.nextLine();

                        eletrica = new DepartamentoEletrica(ELETRICA, descricao, salario, bonus, areaApoio, especialidade);
                        quantidadeDepartamentos++;
                    }else {
                        System.out.println("* Departamento não encontrado. Digite uma das opções de departameno válidas (1 ou 2).");
                    }

                    break;
                case EDITAR:
                    if (quantidadeDepartamentos < 1)
                            System.out.println("* Não é possível editar departamentos pois a lista de departamentos está vazia.");
                    break;
                default:
                    System.out.println("Operação inexistente no sistema! Informe uma opção de departamento válida (1 ou 2).");
                    break;
            }

        }

        leitor.close();
            if ((quantidadeDepartamentos >= 0) && ((tecnologia != null) &&  (eletrica != null))) {
            int d;

            for (d = 0; d < MAXIMO_DEPARTAMENTOS; d++){
                tecnologia.imprimeDadosDepartamento();
                eletrica.imprimeDadosDepartamento();
            }
        }else {
            System.out.println("Departamentos vazios ou inexistentes.\n");
        }
    }
}
