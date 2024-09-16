
public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Universidade universidade;

    public Pessoa(String nome, String dataNascimento, Universidade universidade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.universidade = universidade;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void exibirInformacoes() {
        System.out.println(nome + " nasceu em " + dataNascimento + " e trabalha como professor em " + universidade.getNome());
    }
}
    