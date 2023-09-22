import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodos string1 = new Metodos();

        System.out.println("Digite uma String");
        String string = scanner.next();
        System.out.println("String digitada:    " + string);
        System.out.println("A) Quantidade de caracteres da String: " + string.length());
        System.out.println("B) String com todas as letras Maiusculo:  " + string.toUpperCase());
        System.out.println("C) A String:    " + string + " Tem " + string1.ContarVogais(string) + " vogais");
        String stringFormatada = string.toLowerCase();
        if (stringFormatada.startsWith("inf")){
            System.out.println("D) "+string + "   comeca com INF");
        }
        if (stringFormatada.endsWith("net")){
            System.out.println("E) "+string + "   termina com NET");
        }
        System.out.println("F) A String: "+ string + " Tem " + string1.ContarDigitos(string) + " Digitos");
        System.out.printf("%s %s %s %c-%c \n","G) 1 e 2 Digitos da", string, "Respecitivamente", string.charAt(0), string.charAt(1));
        if (string1.VerificarPalindromo(string)){
            System.out.printf("%s \"%s\" %s. \n", "G) A String",string,"e um palindromo");
        } else {
            System.out.printf("%s \"%s\" %s. \n", "G) A String",string,"nao e um palindromo");
        }

        System.out.println("----------------");
        System.out.println("Digite numeros...");
        int numeros = scanner.nextInt();
        System.out.println("2.  " + string1.ReescreverNumeros(numeros));

        System.out.println("----------------");

        System.out.println("Digite seu Nome Completo!");
        String nome = scanner.nextLine();
//        O nextLine nao esta pegando
        System.out.println("Suas inicias sao:   " + string1.PegarIniciais(nome));
        System.out.println("Suas inicias sao:   " + string1.PegarIniciais("Maria das Gracas Pimenta"));
        System.out.println("Suas inicias sao:   " + string1.PegarIniciais("Joao Carlos dos Santos"));
        System.out.println("Suas inicias sao:   " + string1.PegarIniciais("Jose da Silva"));
        System.out.println("Suas inicias sao:   " + string1.PegarIniciais("Pedro Pereira Teixeira"));

        System.out.println("----------------");

        System.out.println("Digite o tamanho da cadeira:");
        int tamanho = scanner.nextInt();
        CadeiaDeDna.gerarCadeiaDeDna(tamanho);


    }
}