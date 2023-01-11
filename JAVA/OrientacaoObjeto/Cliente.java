public class Cliente {
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String dataNasc;

    public Cliente(String nome, String cpf, String rg, String endereco, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void visualizar() {
        System.out.println("nome: " + nome + "\n" +
                "cpf: " + cpf + "\n" +
                "rg: " + rg + "\n" +
                "endereco: " + endereco + "\n" +
                "dataNasc: " + dataNasc + "\n");
    }
}
