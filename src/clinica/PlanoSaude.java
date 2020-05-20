package clinica;

public final class PlanoSaude {
    private final String nome;
    private final String operadora;
    private final String status;
    private final String adesao;
    private final String vencimento;
    
    public PlanoSaude(String nome, String operadora, String status, String adesao, String vencimento){
        this.nome = nome;
        this.operadora = operadora;
        this.status = status;
        this.adesao = adesao;
        this.vencimento = vencimento;
    }
    
    public String getNome() {
        return nome;
    }

    public String getOperadora() {
        return operadora;
    }

    public String getStatus() {
        return status;
    }

    public String getAdesao() {
        return adesao;
    }
  
    public String getVencimento() {
        return vencimento;
    }
 }
