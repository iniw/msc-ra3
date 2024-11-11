package state.quotacao;

public class Teste {
    public static void main(String[] args) {
        IPedido p1 = new Pedido();

        String str = p1.solicita();
        System.out.println("p1-Estado: " + str);

        str = p1.cotacao();
        System.out.println("p1-Estado: " + str);

        str = p1.cotacao();
        System.out.println("p1-Estado: " + str);

        str = p1.encomenda();
        System.out.println("p1-Estado: " + str);

        str = p1.entrega();
        System.out.println("p1-Estado: " + str);

        str = p1.paga();
        System.out.println("p1-Estado: " + str);

        str = p1.arquiva();
        System.out.println("p1-Estado: " + str);
    }
}
