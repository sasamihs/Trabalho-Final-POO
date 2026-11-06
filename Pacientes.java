public class Pacientes extends Pessoas{
    private int numPaciente;
    private int tempoAlocado;
    //private bool convenio;

    //construtor
    public Pacientes(long cpf, String nome, int cod){
        super(cpf, nome);
        setTempoAlocado(tempoAlocado);
        setNumPaciente(numPaciente);
    }

    //getters
    public int getNumPaciente() { return numPaciente; }
    public int getTempoAlocado() { return tempoAlocado; }

    //setters
    public void setNumPaciente(int numPaciente){
        this.numPaciente=numPaciente;
    }

    public void setTempoAlocado(int tempoAlocado){
        this.tempoAlocado=tempoAlocado;
    }
}