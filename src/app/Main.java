package app;

public class Main {
    public static void main(String[] args) {
        // Criando diferentes tipos de pagamento
        PagamentoFactory pagamentoCartaoCredito = new CartaoCreditoFactory();
        PagamentoFactory pagamentoBoleto = new BoletoBancarioFactory();
        PagamentoFactory pagamentoPaypal = new PaypalFactory();

        // Processador de pagamento utilizando o cartão de crédito
        ProcessadorDePagamento processador1 = new ProcessadorDePagamento(pagamentoCartaoCredito);
        processador1.realizarPagamento(100.0);

        // Processador de pagamento utilizando boleto bancário
        ProcessadorDePagamento processador2 = new ProcessadorDePagamento(pagamentoBoleto);
        processador2.realizarPagamento(200.0);

        // Processador de pagamento utilizando PayPal
        ProcessadorDePagamento processador3 = new ProcessadorDePagamento(pagamentoPaypal);
        processador3.realizarPagamento(300.0);
    }
}
