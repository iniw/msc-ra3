package state.quotacao;

public class Pedido implements IPedido {
    Estado estado;

    public String solicita() {
        if (estado.getClass() != Estado.class)
            return "Transição Inválida";
        estado = new Solicitado();
        return "Solicita";
    }

    public String cotacao() {
        if (estado.getClass() == Estado.class)
            return "Transição Inválida";
        estado = estado.cotacao();
        return "Cotação";
    }

    public String encomenda() {
        if (estado.getClass() == Estado.class)
            return "Transição Inválida";
        estado = estado.encomenda();
        return "Encomenda";
    }

    public String entrega() {
        if (estado.getClass() == Estado.class)
            return "Transição Inválida";
        estado = estado.entrega();
        return "Entrega";
    }

    public String paga() {
        if (estado.getClass() == Estado.class)
            return "Transição Inválida";
        estado = estado.paga();
        return "Paga";
    }

    public String rejeita() {
        if (estado.getClass() == Estado.class)
            return "Transição Inválida";
        estado = estado.rejeita();
        return "Rejeita";
    }

    public String cancela() {
        if (estado.getClass() == Estado.class)
            return "Transição Inválida";
        estado = estado.cancela();
        return "Cancela";
    }

    public String arquiva() {
        if (estado.getClass() == Estado.class)
            return "Transição Inválida";
        estado = estado.arquiva();
        return "FIM";
    }
}
