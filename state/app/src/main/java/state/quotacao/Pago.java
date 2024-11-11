package state.quotacao;

public class Pago extends Estado {
    public Estado arquiva() {
        return new Estado();
    }
}
