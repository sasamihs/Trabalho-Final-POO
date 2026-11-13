import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Quartos> listaQuartos = new ArrayList<>();
    private static List<Medicos> listaMedicos = new ArrayList<>();
    private static List<Pacientes> listaPacientes = new ArrayList<>();
    private static List<Enfermeiros> listaEnfermeiros = new ArrayList<>();
    private static List<Funcionarios> listaFuncionarios = new ArrayList<>();


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        carregarDadosIniciais();
        int opcao = -1;

        System.out.println("### Sistema Hospital ###");

        while (opcao != 0) {
            exibirMenu();
            try {
                System.out.print("Escolha uma opção: ");
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1 -> consultarQuartos();
                    case 2 -> registrarMedico();
                    case 3 -> registrarPaciente();
                    case 4 -> ocuparQuarto();
                    case 5 -> desocuparQuarto();
                    case 6 -> listarMedicos();
                    case 7 -> listarPacientes();
                    case 8 -> listarFuncionarios();
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

    private static void carregarDadosIniciais() {
        // Quartos iniciais
        listaQuartos.add(new Apartamento(101, 0, true));
        listaQuartos.add(new Enfermaria(201, 2, true));
        listaQuartos.add(new HospitalDia(301, 0, true));

        // Médicos iniciais
        listaMedicos.add(new Medicos(11122233344L, "Dra. Samih de Oliveira", 1002, 123));

        // Enfermeiros iniciais
        listaEnfermeiros.add(new Enfermeiros(55667788L, "Enf. Luiz Antonio Lima", 1001, 4567));

        // Pacientes iniciais
        listaPacientes.add(new Pacientes(99988877766L, "Lucas Kimura", 501));
        listaPacientes.add(new Pacientes(44433322211L, "Eduardo Elias", 502));

        //Funcionarios iniciais
        listaFuncionarios.add(new Medicos(11122233344L, "Dra. Samih de Oliveira", 1002, 123));
        listaFuncionarios.add(new Enfermeiros(55667788L, "Enf. Luiz Antonio Lima", 1001, 4567));

    }


    private static void exibirMenu() {
        System.out.println("\n-----------------------------------------");
        System.out.println("1. Consultar Quartos (Disponibilidade)");
        System.out.println("2. Registrar Medico");
        System.out.println("3. Registrar Paciente");
        System.out.println("4. Ocupar Quarto");
        System.out.println("5. Desocupar Quarto");
        System.out.println("6. Listar Médicos");
        System.out.println("7. Listar Pacientes");
        System.out.println("8. Listar Funcionários");
        System.out.println("0. Sair");
        System.out.println("-----------------------------------------");
    }

    private static void consultarQuartos() {
        System.out.println("\n--- Lista de Quartos ---");
        for (Quartos q : listaQuartos) {
            q.checaDisponibilidade(); // Garante que o status esteja atualizado
            String status = q.getDisponivel() ? "Disponível" : "Lotado/Indisponível";
            System.out.println("Quarto " + q.getNumQuarto() + 
                               " (" + q.getClass().getSimpleName() + ") - Hóspedes: " + 
                               q.getHospedes() + "/" + q.getLimitePessoas() + 
                               " - Status: " + status);
        }
    }

    private static void registrarMedico() {
        System.out.println("\n--- Registrar Médico ---");
        System.out.print("CPF (apenas números): ");
        long cpf = Long.parseLong(scanner.nextLine());
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Código do Funcionário: ");
        int cod = Integer.parseInt(scanner.nextLine());
        System.out.print("CRM: ");
        int crm = Integer.parseInt(scanner.nextLine());


        Medicos novoMedico = new Medicos(cpf, nome, cod, crm);
        listaMedicos.add(novoMedico);
        System.out.println("Médico " + nome + " registrado com sucesso!");
    }

    private static void registrarPaciente() {
        System.out.println("\n--- Registrar Paciente ---");
        System.out.print("CPF (apenas números): ");
        long cpf = Long.parseLong(scanner.nextLine());
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Número/Código do Paciente: ");
        int cod = Integer.parseInt(scanner.nextLine());

        Pacientes novoPaciente = new Pacientes(cpf, nome, cod);
        listaPacientes.add(novoPaciente);
        System.out.println("Paciente " + nome + " registrado com sucesso!");
    }

    private static void ocuparQuarto() {
        System.out.print("\nDigite o número do quarto que deseja ocupar: ");
        int num = Integer.parseInt(scanner.nextLine());

        for (Quartos q : listaQuartos) {
            if (q.getNumQuarto() == num) {
                q.checaDisponibilidade();
                if (q.getDisponivel()) {
                    q.ocuparVaga(); // Usa o método da sua classe Quartos!
                    System.out.println("Vaga ocupada no quarto " + num + "! Lotação atual: " + 
                                       q.getHospedes() + "/" + q.getLimitePessoas());
                } else {
                    System.out.println("O quarto " + num + " já atingiu o limite de pessoas.");
                }
                return;
            }
        }
        System.out.println("Quarto não encontrado.");
    }

    private static void desocuparQuarto() {
        System.out.print("\nDigite o número do quarto que deseja desocupar: ");
        int num = Integer.parseInt(scanner.nextLine());

        for (Quartos q : listaQuartos) {
            if (q.getNumQuarto() == num) {
                if (q.getHospedes() > 0) {
                    q.liberarVaga(); // Usa o método da sua classe Quartos!
                    System.out.println("Vaga liberada no quarto " + num + "! Lotação atual: " + 
                                       q.getHospedes() + "/" + q.getLimitePessoas());
                } else {
                    System.out.println("O quarto " + num + " já está vazio.");
                }
                return;
            }
        }
        System.out.println("Quarto não encontrado.");
    }
        private static void listarMedicos() {
        System.out.println("\n--- Lista de Médicos ---");
        
        if (listaMedicos.isEmpty()) {
            System.out.println("Nenhum médico cadastrado no sistema.");
            return;
        }

        for (Medicos m : listaMedicos) {
            m.ficha();
        }
    }
        private static void listarPacientes() {
        System.out.println("\n--- Lista de Pacientes ---");

        if (listaPacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado no sistema.");
            return;
        }

        for (Pacientes p : listaPacientes) {
            System.out.println("Nº Paciente: " + p.getNumPaciente() + 
                               " | Nome: " + p.getNome() + 
                               " | CPF: " + p.getCpf() + 
                               " | Tempo Alocado: " + p.getTempoAlocado() + "h");
        }
    }

        private static void listarFuncionarios(){
        System.out.println("\n--- Lista de Funcionários ---");
        
        if (listaFuncionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado no sistema.");
            return;
        }

        for (Funcionarios f : listaFuncionarios) {
            f.ficha();
        }
        }
}
