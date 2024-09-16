
public class ContaBancaria {
    private String numeroConta;
    private String nomeCliente;
    private double saldo;

  
    public ContaBancaria(String numeroConta, String nomeCliente, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
    }

   
    public void depositar(double quantia) {
        if (quantia > 0) {
            saldo += quantia;
            System.out.println("Depósito de R$" + quantia + " realizado. Saldo atual: R$" + saldo);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    
    public void sacar(double quantia) {
        if (quantia > 0 && quantia <= saldo) {
            saldo -= quantia;
            System.out.println("Saque de R$" + quantia + " realizado. Saldo atual: R$" + saldo);
        } else if (quantia > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            System.out.println("O valor do saque deve ser positivo.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("123456", "João Silva", 1000.00);

 
        conta.depositar(500.00);  
        conta.sacar(300.00);      
        conta.sacar(1500.00);    
    }
}
