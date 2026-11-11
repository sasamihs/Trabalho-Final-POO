abstract class Funcionarios extends Pessoas {
    private int codFuncionario;

    public Funcionarios(long cpf, String nome, int cod) {
        super(cpf, nome);
        this.codFuncionario = cod;
    }
    // Getter
    public int getCodFuncionario() { return codFuncionario;}

class Medico extends Funcionarios {
    public Medico(long cpf, String nome, int cod) {
        super(cpf, nome, cod);
    }
}

class Enfermeiros extends Funcionarios {
    public Enfermeiros(long cpf, String nome, int cod) {
        super(cpf, nome, cod);
    }
}
