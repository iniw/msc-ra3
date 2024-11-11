package composite.categoria;

import composite.modelo.MyException;
import composite.modelo.Elemento;
import composite.modelo.Composicao;

public class Teste {
    public static Elemento criarInstancias() {
        Elemento craiz = new CategoriaRaiz("craiz");

        Elemento comestivel = new Categoria("comestivel");

        Elemento diversos = new Categoria("diversos");

        Elemento ceral = new CategoriaFolha("ceral");
        Elemento P1 = new Cereal("P1");
        Elemento P2 = new Cereal("P2");
        Elemento P3 = new Cereal("P3");

        Elemento bebida = new CategoriaFolha("bebida");
        Elemento P4 = new Bebida("P4");
        Elemento P5 = new Bebida("P5");
        Elemento P6 = new Bebida("P6");

        Elemento proteinaAnimal = new Categoria("proteinaAnimal");

        Elemento defumado = new CategoriaFolha("defumado");
        Elemento P7 = new Defumado("P7");
        Elemento P8 = new Defumado("P8");
        Elemento P9 = new Defumado("P9");

        Elemento carne = new CategoriaFolha("carne");
        Elemento P10 = new Carne("P10");
        Elemento P11 = new Carne("P11");
        Elemento P12 = new Carne("P12");

        Elemento limpeza = new CategoriaFolha("limpeza");
        Elemento L1 = new Limpeza("L1");
        Elemento L2 = new Limpeza("L2");
        Elemento L3 = new Limpeza("L3");

        try {
            craiz.adicionar(comestivel);
            craiz.adicionar(limpeza);

            comestivel.adicionar(diversos);
            comestivel.adicionar(proteinaAnimal);

            diversos.adicionar(ceral);
            diversos.adicionar(bebida);

            ceral.adicionar(P1);
            ceral.adicionar(P2);
            ceral.adicionar(P3);

            bebida.adicionar(P4);
            bebida.adicionar(P5);
            bebida.adicionar(P6);

            limpeza.adicionar(L1);

            proteinaAnimal.adicionar(defumado);
            proteinaAnimal.adicionar(carne);

            defumado.adicionar(P7);
            defumado.adicionar(P8);
            defumado.adicionar(P9);

            carne.adicionar(P10);
            carne.adicionar(P11);
            carne.adicionar(P12);

            limpeza.adicionar(L2);
            limpeza.adicionar(L3);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return craiz;
    }

    public static void main(String[] args) {
        try {
            Elemento craiz = criarInstancias();
            craiz.listar(0);

            System.out.println("\n");

            Elemento cat = new Categoria("cat");
            Elemento filho = craiz.consultar("diversos");

            filho.adicionar(cat);
            filho.listar(0);

            craiz.excluir("diversos");

            filho = craiz.consultar("craiz");
            filho.listar(0);
            filho = craiz.excluir("diversos");
            filho = craiz.consultar("diversos");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
