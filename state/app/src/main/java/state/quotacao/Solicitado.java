package state.quotacao;

public class Solicitado extends Estado {
    public Estado cotacao() {
        return new Cotado();
    }
}
