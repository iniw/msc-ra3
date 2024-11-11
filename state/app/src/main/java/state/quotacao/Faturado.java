package state.quotacao;

public class Faturado extends Estado {
    public Estado paga() {
        return new Pago();
    }

    public Estado arquiva() {
        return new Estado();
    }
}
