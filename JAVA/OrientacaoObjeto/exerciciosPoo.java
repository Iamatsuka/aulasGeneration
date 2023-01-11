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
_____________________________________________________________________
public class TestaCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Joao Silva", "321.654.987-78", "21.654.987-8", "Rua ABC, 10", "21/08/1996");
        Cliente c2 = new Cliente("Maria Silva", "321.654.789-78", "21.654.987-9", "Rua DEF, 15", "09/05/1996");

        c1.visualizar();
        c2.visualizar();
    }
}
__________________________________________________________________________
public class Produto {
    private int codigo;
    private String nome;
    private double valor;
    private String tamanho;
    private String dataValidade;

    public Produto(int codigo, String nome, double valor, String tamanho, String dataValidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.tamanho = tamanho;
        this.dataValidade = dataValidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void visualizar() {
        System.out.println("codigo: " + codigo + "\n" +
                "nome: " + nome + "\n" +
                "valor: " + valor + "\n" +
                "tamanho: " + tamanho + "\n" +
                "dataValidade: " + dataValidade + "\n");
    }
}
______________________________________________________________________________________
public class TestaGame {
    public static void main(String[] args) {
        Produto c1 = new Produto(591, "Teclado Gamer", 200.00, "M", "30/02/2023");
        Produto c2 = new Produto(176, "Cadeira Gamer",900.00, "M", "15/06/2023");

        c1.visualizar();
        c2.visualizar();
    }
}