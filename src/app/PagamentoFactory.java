package app;

public abstract class PagamentoFactory {
    public abstract PagamentoStrategy criarPagamento();
    
    public void processarPagamento(double valor) {
        PagamentoStrategy pagamento = criarPagamento();
        pagamento.processarPagamento(valor);
    }
}
