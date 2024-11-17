package app;

public class BoletoBancario implements PagamentoStrategy {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Gerando boleto no valor de R$ " + valor + " para pagamento.");
    }
}