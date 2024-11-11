package state.quotacao;

public class Rejeitado extends Estado {
    public Estado arquiva() {
        return new Estado();
    }
}
