package sistemaCinema.model;

import java.util.Date;

public class Comprovante {
    private Date dataHoraEmissao;
    private String detalhes;

    public Comprovante(String detalhes) {
        this.dataHoraEmissao = new Date(); // Emite na data/hora atual
        this.detalhes = detalhes;
    }

    public Date getDataHoraEmissao() {
        return dataHoraEmissao;
    }

    public String getDetalhes() {
        return detalhes;
    }

    @Override
    public String toString() {
        return "Comprovante emitido em: " + dataHoraEmissao + "\nDetalhes: " + detalhes;
    }
}