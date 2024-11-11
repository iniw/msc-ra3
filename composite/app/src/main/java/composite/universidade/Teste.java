package composite.universidade;

import composite.modelo.MyException;
import composite.modelo.Elemento;
import composite.modelo.Composicao;

public class Teste {
    private static Elemento criarInstancias() {
        Elemento universidade = new Universidade("universidade");

        Elemento curitiba = new Campus("curitiba");

        Elemento azul = new Bloco("azul");

        Elemento primeiro = new Andar("primeiro");
        Elemento P1 = new Corredor("P1");
        Elemento P2 = new Sala("P2");
        Elemento P3 = new Sala("P3");

        Elemento segundo = new Andar("segundo");
        Elemento P4 = new Corredor("P4");
        Elemento P5 = new Sala("P5");
        Elemento P6 = new Laboratorio("P6");

        Elemento verde = new Bloco("verde");

        Elemento terceiro = new Andar("terceiro");
        Elemento P7 = new Laboratorio("P7");
        Elemento P8 = new Auditorio("P8");
        Elemento P9 = new Cantina("P9");

        Elemento quarto = new Andar("quarto");
        Elemento P10 = new Sala("P10");
        Elemento P11 = new Sala("P11");
        Elemento P12 = new Laboratorio("P12");

        Elemento londrina = new Campus("londrina");
        Elemento L1 = new Auditorio("L1");
        Elemento L2 = new Sala("L2");
        Elemento L3 = new Laboratorio("L3");

        try {
            universidade.adicionar(curitiba);
            universidade.adicionar(londrina);

            curitiba.adicionar(azul);
            curitiba.adicionar(verde);

            azul.adicionar(primeiro);
            azul.adicionar(segundo);

            primeiro.adicionar(P1);
            primeiro.adicionar(P2);
            primeiro.adicionar(P3);

            segundo.adicionar(P4);
            segundo.adicionar(P5);
            segundo.adicionar(P6);

            verde.adicionar(terceiro);
            verde.adicionar(quarto);

            terceiro.adicionar(P7);
            terceiro.adicionar(P8);
            terceiro.adicionar(P9);

            quarto.adicionar(P10);
            quarto.adicionar(P11);
            quarto.adicionar(P12);

            londrina.adicionar(L1);
            londrina.adicionar(L2);
            londrina.adicionar(L3);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return curitiba;
    }

    public static void main(String[] args) {
        try {
            Elemento praiz = criarInstancias();
            praiz.listar(0);

            System.out.println("\n");

            Elemento t4 = new Bloco("t4");
            Elemento filho = praiz.consultar("azul");

            filho.adicionar(t4);
            filho.listar(0);

            praiz.excluir("curitiba");

            filho = praiz.consultar("verde");
            filho.listar(0);
            filho = praiz.excluir("curitiba");
            filho = praiz.consultar("curitiba");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
