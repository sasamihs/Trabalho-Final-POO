abstract class Quartos {
    //atributos basicos
    private int tempoMax;
    private int limitePessoas;
    private int numQuarto;
    private int hospedes;
    private boolean disponivel;

    //construtor
    public Quartos(int tempoMax, int limitePessoas, int numQuarto, int hospedes, boolean disponivel){
        setTempoMax(tempoMax);
        setLimitePessoas(limitePessoas);
        setNumQuarto(numQuarto);
        setHospedes(hospedes);
        setDisponivel(disponivel);
    }

    //getters
    public int getTempoMax(){
        return tempoMax;
    }

    public int getLimitePessoas(){
        return limitePessoas;
    }

    public int getNumQuarto(){
        return numQuarto;
    }

    public int getHospedes(){
        return hospedes;
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    //setters
    public void setTempoMax(int tempoMax){
        this.tempoMax=tempoMax;
    }

    public void setLimitePessoas(int limitePessoas){
        this.limitePessoas=limitePessoas;
    }

    public void setNumQuarto(int numQuarto){
        this.numQuarto=numQuarto;
    }

    public void setHospedes(int hospedes){
        this.hospedes=hospedes;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel=disponivel;
    }

    //métodos
    public void checaDisponibilidade(){
        if(hospedes==limitePessoas){
            setDisponivel(false);
        }else{
            setDisponivel(true);
        }
    }
}
