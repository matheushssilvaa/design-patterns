package app;

public class CartaoCreditoFactory extends PagamentoFactory {
    @Override
    public PagamentoStrategy criarPagamento() {
        return new CartaoCredito();
    }
}
