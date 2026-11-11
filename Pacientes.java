public class Pacientes extends Pessoas{
    private int numPaciente;
    private int tempoAlocado;
    //private bool convenio;

    //construtor
    public Pacientes(long cpf, String nome, int cod){
        super(cpf, nome);
        setNumPaciente(cod); // Salva o 'cod' recebido no atributo numPaciente
        setTempoAlocado(0);  // Inicia o tempo alocado como 0
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
