import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<IShowMessage> Cartoes = new LinkedList<IShowMessage>();

        IShowMessage[] Cards = {
          new Pascoa("joao@marcelo.com", "joao"),
          new Natal("augusto@augusto.com", "augusto"),
          new DiaDosNamorados("gabi@.com", "Gabriela"),
          new Aniversário("Zedu@gmail.com", "Zedu"),
          new Natal("rafa@bbg.com", "rafael")
        };
        for (IShowMessage card:
             Cards) {
            Cartoes.add(card);
        }
        for (IShowMessage card:
             Cartoes) {
            System.out.println(card.showMessage());
            System.out.println();
        }

        System.out.println("=======================================================");

        ClientesStandart c1 = new ClientesStandart();
        c1.setSaldo(200);
        c1.sacarBits(72);

        System.out.println("=======================================================");

        ClientesVip c2 = new ClientesVip();
        c2.setSaldo(200);
        c2.sacarBits(36);

    }
}