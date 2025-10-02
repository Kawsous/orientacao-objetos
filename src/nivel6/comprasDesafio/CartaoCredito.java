package nivel6.comprasDesafio;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    //validacao de compra
    public boolean lancaCompra(Compra compra) {
        if (compra.getPreco() <= saldo ) {
            saldo -= compra.getPreco();
            compras.add(compra);
            return true;
        } else
            return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
