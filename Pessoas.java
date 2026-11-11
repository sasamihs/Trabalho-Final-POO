abstract class Pessoas{
    private long cpf;
    private String nome;

    //construtor
    public Pessoas(long cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public long getCpf() {return cpf;}
    public String getNome() {return nome;}
}

