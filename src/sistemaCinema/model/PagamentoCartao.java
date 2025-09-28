package sistemaCinema.model;

public class PagamentoCartao implements Pagamento {
    @Override
    public boolean processarPagamento(double valor) {
        // lógica de pagamento com cartão
        System.out.println("Processando pagamento com cartão: R$" + valor);
        return true; // simulação de sucesso
    }

}
