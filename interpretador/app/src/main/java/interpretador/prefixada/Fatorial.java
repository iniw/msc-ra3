package interpretador.prefixada;

import java.util.ArrayList;

public class Fatorial extends Operador {
    public Fatorial(ArrayList<Expressao> elemento) {
        super(elemento);
    }

    @Override
    public char simbolo() {
        return '!';
    }

    @Override
    public double resolva() {
        double n = this.elemento.get(0).resolva();
        return fatorial((int) n);
    }

    private int fatorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
}
