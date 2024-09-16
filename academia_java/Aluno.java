public class Aluno {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Aluno(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public boolean isMenorIdade() {
        return idade < 18;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Peso: " + peso + "kg, Altura: " + altura + "m, IMC: " + String.format("%.2f", calcularIMC()) + 
               ", Menor de idade: " + (isMenorIdade() ? "Sim" : "Não");
    }
}
