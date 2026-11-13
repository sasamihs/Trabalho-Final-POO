abstract class Funcionarios extends Pessoas {
    private int codFuncionario;

    public Funcionarios(long cpf, String nome, int cod) {
        super(cpf, nome);
        setCodFuncionario(cod);
    }
    // Getter
    public int getCodFuncionario() { return codFuncionario;}

    // Setter
    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario=codFuncionario;
    }
    // Métodos
    abstract void ficha();
}
