import java.util.Scanner;
//import java.util.List;
//import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        carregarDadosIniciais();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        System.out.println("### Sistema Hospital ###");

    carregarDadosIniciais();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            exibirMenu();
            try {
                System.out.print("Escolha uma opção: ");
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1 -> 
                    case 2 -> 
                    case 3 -> 
                    case 4 -> 
                    case 5 -> 
                    case 0 -> System.out.println("\nEncerrando o sistema. Até mais!");
                    default -> System.out.println("\n[Erro] Opção inválida. Digite um número do menu.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\n[Erro Entrada Inválida] Digite apenas números inteiros para navegar no menu.");
            } catch (Exception e) {
                System.out.println("\n[Erro Inesperado] Ocorreu um problema: " + e.getMessage());
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        System.out.println("1- Ver quartos disponiveis\n2- Transferir paciente de quarto\n3- Ocupar quarto\n4- Liberar quarto");
    }

    private static void exibirMenu() {
        System.out.println("\n-----------------------------------------");
        System.out.println("1. Consultar Quartos (Disponibilidade)");
        System.out.println("2. Registrar Medico");
        System.out.println("3. Registrar Paciente");
        //System.out.println("3. Registrar Funcionario");
        //System.out.println("4. Ver Histórico de um Paciente");
        //System.out.println("4. Ver Histórico de um Quartos");
        System.out.println("4. Ocupar Quarto");
        System.out.println("5. Desocupar Quarto");
        System.out.println("0. Sair");
        System.out.println("-----------------------------------------");
    }

}