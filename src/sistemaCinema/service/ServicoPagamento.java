package sistemaCinema.service;

import sistemaCinema.model.Pagamento;

public class ServicoPagamento {
    private Pagamento metodoPagamento;

    public ServicoPagamento(Pagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public boolean realizarPagamento(double valor) {
        return metodoPagamento.processarPagamento(valor);
    }

    public void setEstrategiaPagamento(Pagamento estrategiaPagamento) {
        this.metodoPagamento = estrategiaPagamento;
    }
}