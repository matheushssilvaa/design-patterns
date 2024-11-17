package app;

public class BoletoBancarioFactory extends PagamentoFactory {
    @Override
    public PagamentoStrategy criarPagamento() {
        return (PagamentoStrategy) new BoletoBancario();
    }
}
