package app;

public class PaypalFactory extends PagamentoFactory {
    @Override
    public PagamentoStrategy criarPagamento() {
        return new Paypal();
    }
}