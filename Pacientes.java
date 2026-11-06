public class Pacientes extends Pessoas{
    private int numPaciente;
    private int tempoAlocado;
    //private bool convenio;

    //construtor
    public Pacientes(long cpf, string nome, int cod){
        super(cpf, nome);
        this.tempoAlocado = 0;
        this.numPaciente = cod;
    }
    public Pessoas getNumPaciente() { return numPaciente; }
}