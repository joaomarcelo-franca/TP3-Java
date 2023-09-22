import java.util.Scanner;

public class ClientesVip extends Cliente implements ISacarBits{
    Scanner scan = new Scanner(System.in);
    @Override
    public void sacarBits(int valor) {
        if (validarSaque(valor)){
            double valorSaquado = valor;
            setSaldo(getSaldo() - valor);

            System.out.println("Saque Cliente Vip");

            if (valor < 50){

                System.out.println("O senhor deseja receber:");
                System.out.println("[1] - Com o menor numeros de notas");
                System.out.println("[2] - Ou so com notas de B$5 e B$1");

                int opcao = scan.nextInt();
                if (opcao == 1){
                    super.sacarBits(valor);
                } else if (opcao == 2) {

                    int bits5;
                    bits5 = valor / 5;
                    System.out.println(bits5 + " de B$5");
                    valor %= 5;

                    int bits1;
                    bits1 = valor;
                    System.out.println(bits1 + " de B$1");
                    valor %= 1;

                    System.out.println("Valor Sacado com sucesso : B$"  + valorSaquado);
                    System.out.println("Saldo atual e de B$" + getSaldo());

                } else {
                    System.out.println("Error de Sistema");
                }
            } else {
                super.sacarBits(valor);
            }
        } else {
            System.out.println("Saque invalido");
            System.out.println("Voce tentou sacar ZERO ou um valor maior do que o seu saldo");
        }
    }
}
