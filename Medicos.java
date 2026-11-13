public class Medicos extends Funcionarios {
    private int CRM;
    public Medicos(long cpf, String nome, int cod, int CRM) {
        super(cpf, nome, cod);
        setCRM(CRM);
    }
    //getter
    public int getCRM(){
        return CRM;
    }

    //setter
    public void setCRM(int CRM){
        this.CRM = CRM;
    }

    //método
    @Override
    void ficha(){
        System.out.println("Código: " + getCodFuncionario() + " | Nome: " + getNome() + " | CPF: " + getCpf() + " | CRM: " + getCRM());
    }
}

