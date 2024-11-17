package app;

public class CartaoCredito implements PagamentoStrategy {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " via Cartão de Crédito.");
    }
}

