package decorator.funcionario;

public class Teste {
    public static void cenarioExemplo() {
        Componente pedroMes11 = new Funcionario("Pedro", "Silva");
        Componente a1, a2, a3, a4, a5;
        try {
            a1 = new AnalistaDeSistema(80f, 40f);
            a1.aponta(pedroMes11);
            a2 = new ArquitetoDeSoftware(20F, 50F);
            a2.aponta(a1);
            a3 = new AnalistaDeSistema(40F, 40F);
            a3.aponta(a2);
            a4 = new ArquitetoDeSoftware(20F, 50F);
            a4.aponta(a3);
            a5 = new TestadorDeSoftware(20F, 30F);
            a5.aponta(a4);

            System.out.println(a5.toString());
            System.out.println("Salario: " + a5.calculaSalario());

            /*
             * Funcionario: Pedro Silva
             * :- Atividade executada: Analista de sistema
             * [Numero de horas = 80.0, Valor hora = 40.0] = 3200.0
             * :- Atividade executada: Arquiteto de software
             * [Numero de horas = 20.0, Valor hora = 50.0] = 1000.0
             * :- Atividade executada: Analista de sistema
             * [Numero de horas = 40.0, Valor hora = 40.0] = 1600.0
             * :- Atividade executada: Arquiteto de software
             * [Numero de horas = 20.0, Valor hora = 50.0] = 1000.0
             * :- Atividade executada: Testador de Software
             * [Numero de horas = 20.0, Valor hora = 30.0] = 600.0
             * Salario: 7400.00
             */

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void cenarioJoao() {
        Componente joao = new Funcionario("João", "");
        Componente a1, a2, a3;
        try {
            a1 = new Programador(80, 20);
            a1.aponta(joao);
            a2 = new Implantador(40, 40);
            a2.aponta(a1);
            a3 = new TreinamentoDeUsuario(60F, 40F);
            a3.aponta(a2);

            System.out.println(a3.toString());
            System.out.println("Salario: " + a3.calculaSalario());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void cenarioMaria() {
        Componente maria = new Funcionario("Maria", "");
        Componente a1, a2, a3;
        try {
            a1 = new AnalistaDeSistema(90, 30);
            a1.aponta(maria);
            a2 = new TestadorDeSoftware(20, 40);
            a2.aponta(a1);
            a3 = new Programador(70F, 20F);
            a3.aponta(a2);

            System.out.println(a3.toString());
            System.out.println("Salario: " + a3.calculaSalario());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        cenarioExemplo();
        cenarioJoao();
        cenarioMaria();
    }
}
