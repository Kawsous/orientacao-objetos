package nivel2;

public class ContaBancaria {
    private double numeroConta;
    private double saldo;
    public String titular;

    public void saca(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Precisa ser um valor positivo.");
        }
    }

    //getter setter
    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
