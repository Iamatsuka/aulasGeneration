public class TestaCliente {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica1 = new PessoaFisica("Joao Silva","Rua ABC, 10","321.654.987-78","21.654.987-8","21/08/1996");
        PessoaFisica pessoaFisica2 = new PessoaFisica("Maria Silva","Rua DEF, 15","321.654.789-78", "21.654.987-9", "09/05/1996");

        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Empresa A", "Rua A, 10", "75.217.766/0001-21");
        PessoaJuridica pessoaJuridica2 = new PessoaJuridica("Empresa B", "Rua B, 20", "26.488.422/0001-41");

        pessoaFisica1.visualizar();
        pessoaFisica2.visualizar();
        pessoaJuridica1.visualizar();
        pessoaJuridica2.visualizar();
    }
}

//__________________________________________________________________

public class Cliente {
    private String nome;
    private String endereco;


    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void visualizar() {
        System.out.println("nome: " + nome + "\n" +
                "endereco: " + endereco + "\n");
    }
}

//__________________________________________________________________

public class PessoaFisica extends Cliente {
    private String cpf;
    private String rg;
    private String dataNasc;

    public PessoaFisica(String nome, String endereco, String cpf, String rg, String dataNasc) {
        super(nome, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNasc = dataNasc;
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

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void visualizar() {
        System.out.println("nome: " + super.getNome() + "\n" +
                "endereco: " + super.getEndereco() + "\n" +
                "cpf: " + cpf + "\n" +
                "rg: " + rg + "\n" +
                "data de nasc: " + dataNasc + "\n");
    }
}

//__________________________________________________________________

public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void visualizar() {
        System.out.println("nome: " + super.getNome() + "\n" +
                "endereco: " + super.getEndereco() + "\n" +
                "cnpj: " + cnpj + "\n");
    }
}
