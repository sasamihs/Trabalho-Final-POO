abstract class Funcionarios extends Pessoas{
    private int codFuncionario;
    //construtor
    public Funcionarios(long cpf, string nome, int cod){
        super(cpf,nome);
        this.codFuncionario = cod
    }

}
public class Medico extends Funcionarios{
    private int codFuncionario;
    //construtor
    public Funcionarios(long cpf, string nome, int cod){      
        super(cpf,nome);
        this.codFuncionario = cod
    }

}

public class Enfermeiros extends Funcionarios{
    private int codFuncionario;
    //construtor
    public Funcionarios(long cpf, string nome, int cod){      
        super(cpf,nome);
        this.codFuncionario = cod
    }
}

//getters
public Funcionarios getUsuario() { return usuario; }
    public Equipamento getEquipamento() { return equipamento; }
    public Medico get() { return dataDevolucaoPrevista; }
/* 
public class ServicosGerais extends Funcionarios{
    private int codFuncionario;
    //construtor
    public Funcionarios(long cpf, string nome, int cod){    
        super(cpf,nome);
        this.codFuncionario = cod
    }

}*/