import java.util.Random;
import java.util.StringJoiner;

public class AlgoritmosGeneticos {
    public static void recombinacao(int tamanho, String[] arrayDna1, String[] arrayDna2){
        Random gerador = new Random();
        StringJoiner joiner = new StringJoiner("");
        int fatorCorte = gerador.nextInt(tamanho);
        System.out.printf("%s %d \n", "Fator de Corte da Combinacao:", fatorCorte);
        System.out.println("Resultado da Combinacao");
        for (String a :
                arrayDna1) {
            joiner.add(a);
        }
        String dna1 = joiner.toString();
        joiner = new StringJoiner("");
        for (String a :
                arrayDna2) {
            joiner.add(a);
        }
        String dna2 = joiner.toString();
        System.out.println(dna1);
        System.out.println(dna2);
        joiner = new StringJoiner("");

        String stringSalvo = arrayDna1[fatorCorte];
        arrayDna1[fatorCorte] = arrayDna2[fatorCorte];
        arrayDna2[fatorCorte] = stringSalvo;

        for (String a :
                arrayDna1) {
            joiner.add(a);
        }
        String dna1Recombinado = joiner.toString();
        joiner = new StringJoiner("");
        for (String a :
                arrayDna2) {
            joiner.add(a);
        }
        String dna2Recombinado = joiner.toString();
        System.out.println(dna1Recombinado);
        System.out.println(dna2Recombinado);

        System.out.println("====================================");
        mutacao(arrayDna1);
    }
    public static void mutacao(String[] arrayDna1){
        String[] Proteina = {"A", "C", "G", "T"};
        Random gerador = new Random();
        StringJoiner joiner = new StringJoiner("");
        int indiceMut = gerador.nextInt(arrayDna1.length);
        System.out.println("Resultado da Mutacao");
        System.out.printf("%s %d \n", "Indice Aleatorio na mutacao:", indiceMut);
        for (String a :
                arrayDna1) {
            joiner.add(a);
        }
        String cadeiaPre = joiner.toString();
        System.out.println(cadeiaPre);

        do {
            arrayDna1[indiceMut] = Proteina[gerador.nextInt(Proteina.length)];
        }
        while (arrayDna1[indiceMut] == Proteina[gerador.nextInt(Proteina.length)]);

        joiner = new StringJoiner("");
        for (String a :
                arrayDna1) {
            joiner.add(a);
        }
        String cadeiaPos = joiner.toString();
        System.out.println(cadeiaPos);
        System.out.println("====================================");
    }
}
