package sistemaCinema.model;

public class PagamentoPix implements Pagamento {
    @Override
    public boolean processarPagamento(double valor) {
        // lógica de pagamento com Pix
        System.out.println("Processando pagamento com Pix: R$" + valor);
        return true; // simulação de sucesso
    }

}
