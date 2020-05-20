package clinica;

public final class Paciente {
    private final String nome;
    private final String cpf;
    private final String idade;
    private final String sexo;
    private final String endereco;
    private final String telefone;
    private final String celular;

    public Paciente( String nome, String cpf, String idade, String sexo, String endereco, String telefone, String celular){  
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.celular = celular;
    } 

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
        
    public String getIdade() {
        return idade;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public String getCelular() {
        return celular;
    }  
}

