package state.quotacao;

public interface IPedido {
    String solicita();

    String cotacao();

    String encomenda();

    String entrega();

    String paga();

    String rejeita();

    String cancela();

    String arquiva();
}
