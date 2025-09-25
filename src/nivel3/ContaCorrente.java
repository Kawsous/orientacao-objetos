package nivel3;

public class ContaCorrente extends Conta{
    double cobraTarifaMensal() {
        return consultaSaldo() * 0.95;
    }
}
