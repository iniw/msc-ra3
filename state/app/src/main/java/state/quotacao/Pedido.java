package state.quotacao;

public class Pedido implements IPedido {
    Estado estado;

    public String solicita() {
        estado = new Solicitado();
        return "Solicita";
    }

    public String cotacao() {
        estado = estado.cotacao();
        return "Cotação";
    }

    public String encomenda() {
        estado = estado.encomenda();
        return "Encomenda";
    }

    public String entrega() {
        estado = estado.entrega();
        return "Entrega";
    }

    public String paga() {
        estado = estado.paga();
        return "Paga";
    }

    public String rejeita() {
        estado = estado.rejeita();
        return "Rejeita";
    }

    public String cancela() {
        estado = estado.cancela();
        return "Cancela";
    }

    public String arquiva() {
        estado = estado.arquiva();
        return "FIM";
    }
}
