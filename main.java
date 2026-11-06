import java.util.Scanner;
//import java.util.List;
//import java.util.ArrayList;

public class Main {
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
        System.out.println("Ocupar Quarto");
        System.out.println("0. Sair");
        System.out.println("-----------------------------------------");
    }

}
