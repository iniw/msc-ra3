package state.quotacao;

public class Cancelado extends Estado {
    public Estado arquiva() {
        return new Estado();
    }
}
