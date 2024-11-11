package state.quotacao;

public class Cotado extends Estado {
    public Estado encomenda() {
        return new Encomendado();
    }

    public Estado rejeita() {
        return new Rejeitado();
    }
}
