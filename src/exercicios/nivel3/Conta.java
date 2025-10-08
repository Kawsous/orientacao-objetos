package nivel3;

public class Conta {
    private double saldo;

    public void deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Inválido! Valor menor que 0.");
        }
    }

    public void saca(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double consultaSaldo() {
        return saldo;
    }
}
