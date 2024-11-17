package app;

public class Paypal implements PagamentoStrategy {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " via PayPal.");
    }
}
