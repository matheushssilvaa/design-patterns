package app;

public class ProcessadorDePagamento {
    private PagamentoFactory pagamentoFactory;

    public ProcessadorDePagamento(PagamentoFactory pagamentoFactory) {
        this.pagamentoFactory = pagamentoFactory;
    }

    public void realizarPagamento(double valor) {
        pagamentoFactory.processarPagamento(valor);
    }
}
