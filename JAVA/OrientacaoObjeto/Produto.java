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
