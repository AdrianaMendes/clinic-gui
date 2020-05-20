package clinica;

public final class Medico {
    private final String nome;
    private final String crm;
    private final String especialidade;
    private final String endereco;
    private final String telefone;
    private final String celular;
    
    public Medico(String nome, String crm, String especialidade,String endereco, String telefone, String celular){
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.celular = celular;        
    }

    public String getNome() {
        return nome;
    }

    public String getCrm() {
        return crm;
    }
    
    public String getEspecialidade() {
        return especialidade;
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