package state.quotacao;

public class Encomendado extends Estado {
    public Estado entrega() {
        return new Faturado();
    }

    public Estado cancela() {
        return new Cancelado();
    }
}
