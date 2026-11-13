public class Enfermeiros extends Funcionarios {
    private int COREM;
    public Enfermeiros(long cpf, String nome, int cod, int COREM) {
        super(cpf, nome, cod);
        setCOREM(COREM);
    }
    //getter
    public int getCOREM(){
        return COREM;
    }

    //setter
    public void setCOREM(int COREM){
        this.COREM=COREM;
    }

    //método
    @Override
    void ficha(){
        System.out.println("Código: " + getCodFuncionario() + " | Nome: " + getNome() + " | CPF: " + getCpf() + " | COREM: " + getCOREM());
    }
}